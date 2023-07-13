package com.jontxu.SmartCityManagement.data.Devices;

public class SmartLight extends Device {
    private SmartLightType smartLightType;
    protected SmartLight(String manufacturer, String modelName, int serialnumber, int monthsInWarranty, ConnectionStatus connectionStatus, SmartLightType smartLightType) {
        super(manufacturer, modelName, serialnumber, monthsInWarranty, connectionStatus);
        this.smartLightType = smartLightType;
    }

    public SmartLightType getSmartLightType() {
        return smartLightType;
    }

    public int getPower(){
        return smartLightType.getPower();
    }
}
