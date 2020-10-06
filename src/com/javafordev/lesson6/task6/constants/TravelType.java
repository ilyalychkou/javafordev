package com.javafordev.lesson6.task6.constants;

public enum TravelType {

    RECREATION("recreation"),
    EXCURSION("excursion"),
    TREATMENT("treatment"),
    SHOPPING("shopping"),
    CRUISE("cruise");

    private final String travelTypeName;

    TravelType(String travelTypeName) {
        this.travelTypeName = travelTypeName;
    }

    public String getTravelTypeName() {
        return travelTypeName;
    }
}
