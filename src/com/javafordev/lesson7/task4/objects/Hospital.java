package com.javafordev.lesson7.task4.objects;

import java.util.List;

public class Hospital extends Entity {

    private String name;
    private List<Doctor> doctors;

    public Hospital(int id, String hospitalName, List<Doctor> doctors) {
        super(id);
        this.name = hospitalName;
        this.doctors = doctors;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + name + '\'' +
                ", doctors=" + doctors +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
