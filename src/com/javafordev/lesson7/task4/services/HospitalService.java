package com.javafordev.lesson7.task4.services;

import com.javafordev.lesson7.task4.objects.Doctor;
import com.javafordev.lesson7.task4.objects.Hospital;
import com.javafordev.lesson7.task4.objects.UserRequest;

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
            System.out.println(hospital.getId() + " - " + hospital.getName());
        }
    }

    public void printListOfDoctors(String hospitalName) {
        System.out.println("Список врачей медицинского учреждения " + hospitalName + " : ");
        for (Hospital hospital : this.getHospitals()) {
            if (hospital.getName().equals(hospitalName.trim())) {
                for (Doctor doctor : hospital.getDoctors()) {
                    System.out.println(doctor.getId() + " - " + doctor.getName() + " -  " + doctor.getSpeciality().getRuValue());
                }
            }
        }
    }

    public int findHospitalId(UserRequest userRequest) {
        int hospitalId = 0;
        for (Hospital hospital : this.getHospitals()) {

            if (hospital.getName().equals(userRequest.getHospitalName())) {
                hospitalId = hospital.getId();
            }
        }
        return hospitalId;
    }

    public int findDoctorId(UserRequest userRequest) {
        int doctorId = 0;
        for (Hospital hospital : this.getHospitals()) {
            for (Doctor doctor : hospital.getDoctors()) {
                if (hospital.getName().equals(userRequest.getHospitalName()) && doctor.getName().equals(userRequest.getDoctorName())) {
                    doctorId = doctor.getId();
                }
            }
        }
        return doctorId;
    }
}
