package com.javafordev.lesson6.task6.objects.travel.options;

public enum Excursion {

    ART("art"),
    HISTORIC("historic"),
    NATURE("nature");

    private final String excursionName;

    Excursion(String excursionName) {
        this.excursionName = excursionName;
    }

    public String getExcursionName() {
        return excursionName;
    }
}
