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

    public static String validateElement(String str) {
        if (str.equals(null)) { // сравнение с null, для не null => false, то есть если null => true
            throw new NullPointerException("Задан null элемент!");
        }
        return str;
    }
}
