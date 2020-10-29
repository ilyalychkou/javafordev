package com.javafordev.lesson7.task4.objects;

public class UserRequest {

    private String doctorName;
    private String hospitalName;

    public UserRequest(String doctorName, String hospitalName) {
        this.doctorName = doctorName;
        this.hospitalName = hospitalName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
}
