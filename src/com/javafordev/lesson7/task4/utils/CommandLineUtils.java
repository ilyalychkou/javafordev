package com.javafordev.lesson7.task4.utils;

import com.javafordev.lesson7.task4.objects.Doctor;
import com.javafordev.lesson7.task4.objects.Hospital;
import com.javafordev.lesson7.task4.objects.Talon;
import com.javafordev.lesson7.task4.objects.UserRequest;
import com.javafordev.lesson7.task4.services.HospitalService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class CommandLineUtils {

    public static UserRequest requestDataAndInputDataFromCommandLine(List<Hospital> hospitals) {
        HospitalService hospitalService = new HospitalService(hospitals);
        hospitalService.printListOfHospitals();
        System.out.println();
        String hospitalName = CommandLineUtils.inputHospitalName();
        hospitalService.printListOfDoctors(hospitalName);
        System.out.println();
        String doctorName = CommandLineUtils.inputDoctorName();

        return new UserRequest(doctorName, hospitalName);
    }

    public static String inputHospitalName() {
        System.out.print("Выберите и введите имя медициского учреждения :");
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter(" ");
        return scan.nextLine().trim();
    }

    public static String inputDoctorName() {
        System.out.print("Выберите и введите имя врача :");
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter(" ");
        String doctorName = scan.nextLine().trim();
        scan.close();
        return doctorName;
    }

    public static Talon createTalon(UserRequest userRequest, List<Hospital> hospitals) {
        HospitalService hospitalService = new HospitalService(hospitals);
        int hospitalId = hospitalService.findHospitalId(userRequest);
        int doctorId = hospitalService.findDoctorId(userRequest);
        int talonId = TalonUtils.generateRandomId();
        LocalDateTime talonDate = TalonUtils.generateRandomDate();
        return new Talon(talonId, hospitalId, doctorId, talonDate);
    }

    public static void printTalonInfo(Talon talon, List<Hospital> hospitals) {
        int doctorId = talon.getDoctorId();
        int hospitalId = talon.getHospitalId();
        for (Hospital hospital : hospitals) {
            if (hospital.getId() == hospitalId) {
                System.out.println("название медучреждения - " + hospital.getName());
            }
            for (Doctor doctor : hospital.getDoctors()) {
                if (doctor.getId() == doctorId && hospital.getId() == hospitalId) {
                    System.out.println("имя доктора - " + doctor.getName());
                }
            }
        }
        System.out.println("дата - " + talon.getTalonDate());
    }
}
