package com.jontxu.SmartCityManagement.logic;

import com.jontxu.SmartCityManagement.data.Devices.Device;
import com.jontxu.SmartCityManagement.data.Gateway;

import java.util.List;
import java.util.stream.Collectors;

import static com.jontxu.SmartCityManagement.data.Devices.ConnectionStatus.ERROR;

public class SmartCityPilot {
    public long getAmountOfDevicesInstalled(List<Gateway> gateways) {
        return gateways.stream()
                .flatMap(gateway -> gateway.getDevices().stream())
                .count();
    }

    public List<Device> getDevicesWithError(List<Gateway> gateways) {
        return gateways.stream()
                .flatMap(gateway -> gateway.getDevices().stream())
                .filter(device -> device.getConnectionStatus().equals(ERROR))
                .collect(Collectors.toList());
    }
}
