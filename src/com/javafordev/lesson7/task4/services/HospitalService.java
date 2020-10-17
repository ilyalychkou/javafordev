package com.javafordev.lesson7.task4.services;

import com.javafordev.lesson7.task4.objects.Doctor;
import com.javafordev.lesson7.task4.objects.Hospital;

import java.util.List;

public class HospitalService {
    private List<Hospital> hospitals;

    public HospitalService(List<Hospital> hospitals) {
        this.hospitals = hospitals;
    }

    public List<Hospital> getHospitals() {
        return hospitals;
    }

    public void setHospitals(List<Hospital> hospitals) {
        this.hospitals = hospitals;
    }

    @Override
    public String toString() {
        return "HospitalService{" +
                "hospitals=" + hospitals +
                '}';
    }

    public void printListOfHospitals() {
        System.out.println("Список медицинских учреждений : ");
        for (Hospital hospital : this.getHospitals()) {
            System.out.println(hospital.getId() + " - " + hospital.getHospitalName());
        }
    }

    public void printListOfDoctors(String hospitalName) {
        System.out.println("Список врачей медицинского учреждения " + hospitalName + " : ");
        for (Hospital hospital : this.getHospitals()) {
            if (hospital.getHospitalName().equals(hospitalName.trim())) {
                for (Doctor doctor : hospital.getDoctors()) {
                    System.out.println(doctor.getId() + " - " + doctor.getDoctorLastName() + " " + doctor.getDoctorFirstName() + " " + doctor.getDoctorMiddleName() + " -  " + doctor.getDoctorSpeciality().getRuValue());
                }
            }
        }
    }

}
