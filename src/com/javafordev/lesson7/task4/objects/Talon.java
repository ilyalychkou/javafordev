package com.javafordev.lesson7.task4.objects;

import java.sql.Timestamp;

public class Talon extends Entity {

    private String talonHospitalName;
    private String talonDoctorName;
    private Timestamp talonDate;

    public Talon(int id, String talonHospitalName, String talonDoctorName, Timestamp talonDate) {
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

    public Timestamp getTalonDate() {
        return talonDate;
    }

    public void setTalonDate(Timestamp talonDate) {
        this.talonDate = talonDate;
    }

    @Override
    public String getName() {
        return String.valueOf(this.getId());
    }
}
