package com.javafordev.lesson7.task4.objects;

import java.util.List;

public class Hospital extends Entity {

    private String hospitalName;
    private List<Doctor> doctors;

    public Hospital(int id, String hospitalName, List<Doctor> doctors) {
        super(id);
        this.hospitalName = hospitalName;
        this.doctors = doctors;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", doctors=" + doctors +
                '}';
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    @Override
    public String getName() {
        return this.hospitalName;
    }
}
