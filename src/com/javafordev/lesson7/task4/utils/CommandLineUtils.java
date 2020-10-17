package com.javafordev.lesson7.task4.utils;

import com.javafordev.lesson7.task4.objects.Hospital;
import com.javafordev.lesson7.task4.objects.Talon;
import com.javafordev.lesson7.task4.services.HospitalService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class CommandLineUtils {

    public static void requestDataAndInputDataFromCommandLine(List<Hospital> hospitals) {
        HospitalService hospitalService = new HospitalService(hospitals);
        hospitalService.printListOfHospitals();
        System.out.println();
        String hospitalName = CommandLineUtils.inputHospitalName();
        hospitalService.printListOfDoctors(hospitalName);
        System.out.println();
        String doctorName = CommandLineUtils.inputDoctorName();
        System.out.println();
        Talon talon = CommandLineUtils.createTalon(hospitalName, doctorName);
        System.out.println(talon);
    }


    public static String inputHospitalName() {
        System.out.print("Выберите и введите имя медициского учреждения :");
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter(" ");
        String hospitalName = scan.nextLine().trim();
        return hospitalName;
    }

    public static String inputDoctorName() {
        System.out.print("Выберите и введите имя врача :");
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter(" ");
        String doctorName = scan.nextLine().trim();
        scan.close();
        return doctorName;
    }

    public static Talon createTalon(String hospitalName, String doctorName) {
        int talonId = TalonUtils.generateRandomId();
        LocalDateTime talonDate = TalonUtils.generateRandomDate();
        return new Talon(talonId, hospitalName, doctorName, talonDate);
    }

}
