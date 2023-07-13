package com.jontxu.SmartCityManagement.data;

import com.jontxu.SmartCityManagement.data.Devices.Device;

import java.util.ArrayList;
import java.util.List;

public class Gateway {
    private final String manufacturer;
    private final String address;
    private final List<Device> devices;

    public Gateway(String manufacturer, String address) {
        this.manufacturer = manufacturer;
        this.address = address;
        devices = new ArrayList<>();
    }

    public void addDevice(Device device){
        if(device.getManufacturer().equalsIgnoreCase(this.manufacturer)) {
            devices.add(device);
        };
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getAddress() {
        return address;
    }

    public List<Device> getDevices() {
        return devices;
    }
}
