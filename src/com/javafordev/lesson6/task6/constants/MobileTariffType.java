package com.javafordev.lesson6.task6.constants;

public enum MobileTariffType {

    FOR_SMARTPHONE("smartphone"),
    FOR_CHILDREN("child"),
    SOCIAL("social");

    private final String mobileTariffName;

    MobileTariffType(String mobileTariffName) {
        this.mobileTariffName = mobileTariffName;
    }

    public String getMobileTariffName() {
        return mobileTariffName;
    }

}
