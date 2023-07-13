package com.jontxu.SmartCityManagement.data.Devices;

public abstract class Device {
    private final String manufacturer;
    private final String modelName;
    private final int serialnumber;
    private final int monthsInWarranty;
    private ConnectionStatus connectionStatus;

    protected Device(String manufacturer, String modelName, int serialnumber, int monthsInWarranty, ConnectionStatus connectionStatus) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.serialnumber = serialnumber;
        this.monthsInWarranty = monthsInWarranty;
        this.connectionStatus = connectionStatus;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public int getSerialnumber() {
        return serialnumber;
    }

    public int getMonthsInWarranty() {
        return monthsInWarranty;
    }

    public ConnectionStatus getConnectionStatus() {
        return connectionStatus;
    }

    public void setConnectionStatus(ConnectionStatus connectionStatus) {
        this.connectionStatus = connectionStatus;
    }
}
