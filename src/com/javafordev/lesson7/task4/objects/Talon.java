package com.javafordev.lesson7.task4.objects;

import java.time.LocalDateTime;

public class Talon extends Entity {

    private String talonHospitalName;
    private String talonDoctorName;
    private LocalDateTime talonDate;

    public Talon(int id, String talonHospitalName, String talonDoctorName, LocalDateTime talonDate) {
        super(id);
        this.talonHospitalName = talonHospitalName;
        this.talonDoctorName = talonDoctorName;
        this.talonDate = talonDate;
    }

    @Override
    public String toString() {
        return "Талон № " + this.getId() + " : \n" +
                "название медучреждения - " + talonHospitalName + "\n" +
                "имя доктора - " + talonDoctorName + "\n" +
                "дата - " + talonDate;
    }

    public String getTalonHospitalName() {
        return talonHospitalName;
    }

    public void setTalonHospitalName(String talonHospitalName) {
        this.talonHospitalName = talonHospitalName;
    }

    public String getTalonDoctor() {
        return talonDoctorName;
    }

    public void setTalonDoctor(String talonDoctorName) {
        this.talonDoctorName = talonDoctorName;
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
