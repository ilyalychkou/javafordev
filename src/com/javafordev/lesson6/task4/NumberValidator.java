package com.javafordev.lesson6.task4;

public class NumberValidator {

    public static Integer validateInputNumber(Integer number) {
        if(number.equals(null)) {
            throw new NullPointerException();
        }
        return number;
    }
}
