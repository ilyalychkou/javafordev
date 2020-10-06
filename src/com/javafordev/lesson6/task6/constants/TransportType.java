package com.javafordev.lesson6.task6.constants;

public enum TransportType {

    AIRPLANE("airplane"),
    SHIP("ship"),
    TRAIN("train"),
    BUS("bus");

    private final String transportTypeName;

    TransportType(String transportTypeName) {
        this.transportTypeName = transportTypeName;
    }

    public String getTransportTypeName() {
        return transportTypeName;
    }
}
