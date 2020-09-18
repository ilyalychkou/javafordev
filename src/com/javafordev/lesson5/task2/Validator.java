package com.javafordev.lesson5.task2;

import java.util.Objects;

public class Validator {

    public static String[] validateInputParameterForArray(String[] arrayName) {
        for (String element : arrayName) {
            if (Objects.isNull(element)) {
                System.out.println("Входнои массив содержит null элементы!");
                return new String[arrayName.length];
            }
        }
        return arrayName;
    }

    public static String validateElement(String str) {
//        if (Objects.isNull(str)) {
        if (Objects.equals(str,null)) {
            throw new NullPointerException("Задан null элемент!");
        }
        return str;
    }
}
