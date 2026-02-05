package com.spring.ci;

public class Device {
    private String deviceName;
    private int deviceId;

    private Processor processor;

    public Device(String deviceName, int deviceId, Processor processor) {

        this.deviceName = deviceName;
        this.deviceId = deviceId;
        this.processor=processor;
    }

    @Override
    public String toString() {
        return this.deviceName+" : "+this.deviceId+" : "+this.processor;
    }
}
