package com.javafordev.lesson6.task6.objects.travel.options;

public enum Treatment {

    PHYSIOTHERAPY("physiotherapy"),
    BALNEOTHERAPY("balneotherapy"),
    AEROTHERAPY("aerotherapy");

    private final String treatmentName;

    Treatment(String treatmentName) {
        this.treatmentName = treatmentName;
    }

    public String getTreatmentName() {
        return treatmentName;
    }
}
