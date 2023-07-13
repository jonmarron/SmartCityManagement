package com.jontxu.SmartCityManagement.data.Devices;

public enum SmartLightType {
    LED(150),
    HALOGEN(200);

    private final int power;

    SmartLightType(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
