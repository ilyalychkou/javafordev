package com.javafordev.lesson7.task4.objects;

public class Doctor extends Entity {

    private String doctorFirstName;
    private String doctorMiddleName;
    private String doctorLastName;
    private Speciality doctorSpeciality;

    public Doctor(int id, String doctorLastName, String doctorFirstName, String doctorMiddleName,  Speciality doctorSpeciality) {
        super(id);
        this.doctorLastName = doctorLastName;
        this.doctorMiddleName = doctorMiddleName;
        this.doctorFirstName = doctorFirstName;
        this.doctorSpeciality = doctorSpeciality;
    }

    @Override
    public String getName() {
        return doctorLastName + " " + doctorFirstName + " " + doctorMiddleName;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorLastName='" + doctorLastName + '\'' +
                ", doctorFirstName='" + doctorFirstName + '\'' +
                ", doctorMiddleName='" + doctorMiddleName + '\'' +
                ", doctorSpeciality=" + doctorSpeciality +
                '}';
    }

    public String getDoctorFirstName() {
        return doctorFirstName;
    }

    public void setDoctorFirstName(String doctorFirstName) {
        this.doctorFirstName = doctorFirstName;
    }

    public String getDoctorMiddleName() {
        return doctorMiddleName;
    }

    public void setDoctorMiddleName(String doctorMiddleName) {
        this.doctorMiddleName = doctorMiddleName;
    }

    public String getDoctorLastName() {
        return doctorLastName;
    }

    public void setDoctorLastName(String doctorLastName) {
        this.doctorLastName = doctorLastName;
    }

    public Speciality getDoctorSpeciality() {
        return doctorSpeciality;
    }

    public void setDoctorSpeciality(Speciality doctorSpeciality) {
        this.doctorSpeciality = doctorSpeciality;
    }
}
