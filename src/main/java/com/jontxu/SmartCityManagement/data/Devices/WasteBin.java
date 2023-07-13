package com.jontxu.SmartCityManagement.data.Devices;

public class WasteBin extends Device {
    private final boolean hasCompactor;
    protected WasteBin(String manufacturer, String modelName, int serialnumber, int monthsInWarranty, ConnectionStatus connectionStatus, boolean hasCompactor) {
        super(manufacturer, modelName, serialnumber, monthsInWarranty, connectionStatus);
        this.hasCompactor = hasCompactor;
    }

    public boolean isHasCompactor() {
        return hasCompactor;
    }

}
