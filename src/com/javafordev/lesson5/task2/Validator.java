package com.javafordev.lesson5.task2;

public class Validator {

    public static String[] validateInputParameterForArray(String[] arrayName) {
        for (String element : arrayName) {
            if (element == null) {
                System.out.println("Входнои массив содержит null элементы!");
                return new String[arrayName.length];
            }
        }
        return arrayName;
    }
}
