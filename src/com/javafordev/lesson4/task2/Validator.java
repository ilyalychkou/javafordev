package com.javafordev.lesson4.task2;

public class Validator {

    public static double validateDenominator(double denominator) {

        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель дроби равен 0! Деление на 0 невозможно!");
        }
        return denominator;
    }

    public static Fraction[] validateInputParameterForArray(Fraction[] arrayName) {
        for (Fraction element : arrayName) {
            if (element == null) {
                System.out.println("Входнои массив содержит null элементы!");
                return new Fraction[arrayName.length];
            }
        }
        return arrayName;
    }
}
