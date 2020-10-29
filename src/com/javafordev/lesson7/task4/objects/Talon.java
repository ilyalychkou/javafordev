package com.javafordev.lesson7.task4.objects;

import java.time.LocalDateTime;

public class Talon extends Entity {

    private int hospitalId;
    private int doctorId;
    private LocalDateTime talonDate;

    public Talon(int id, int hospitalId, int doctorId, LocalDateTime talonDate) {
        super(id);
        this.hospitalId = hospitalId;
        this.doctorId = doctorId;
        this.talonDate = talonDate;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public LocalDateTime getTalonDate() {
        return talonDate;
    }

    public void setTalonDate(LocalDateTime talonDate) {
        this.talonDate = talonDate;
    }

    @Override
    public String getName() {
        return String.valueOf(this.getId());
    }
}
