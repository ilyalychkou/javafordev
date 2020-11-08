package com.javafordev.lesson8.task1;

import java.time.LocalDate;

public class Person {

    private String name;
    private LocalDate localDate;

    public Person(LocalDate localDate, String name) {
        this.name = name;
        this.localDate = localDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return name;
    }
}
