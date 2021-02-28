package com.javafordev.lesson6.task6.objects.travel.options;

public enum Transport {

    AIRPLANE("airplane"),
    SHIP("ship"),
    TRAIN("train"),
    BUS("bus");

    private final String transportName;

    Transport(String transportTypeName) {
        this.transportName = transportTypeName;
    }

    public String getTransportName() {
        return transportName;
    }
}
