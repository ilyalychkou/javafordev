package com.javafordev.lesson9.task2.util;

import com.javafordev.lesson9.task2.objects.Participant;

import java.util.Scanner;

public class RegistrationUtil {

    public static Participant inputDataForParticipant() {
        System.out.print("Введите ваши имя, фамилию и отчество :");
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter(" ");
        String name = scan.nextLine().trim();
        System.out.print("Введите ваш возраст:");
        scan.useDelimiter(" ");
        int age = Integer.parseInt(scan.nextLine().trim());
        System.out.print("Введите название компании, которую вы представляете:");
        scan.useDelimiter(" ");
        String company = scan.nextLine().trim();
        return new Participant(name, age, company);
    }
}
