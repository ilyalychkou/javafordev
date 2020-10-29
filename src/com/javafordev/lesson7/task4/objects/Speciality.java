package com.javafordev.lesson7.task4.objects;

public enum Speciality {

    ANESTHETIST("Анестезиолог"),
    GYNECOLOGIST("Гинеколог"),
    CARDIOLOGIST("Кардиолог"),
    THERAPIST("Терапевт"),
    TRAUMATOLOGIST("Травматолог");

    private String ruValue;

    Speciality(String ruValue) {
        this.ruValue = ruValue;
    }

    public String getRuValue() {
        return ruValue;
    }
}
