package com.javafordev.lesson6.task2;

public class TextValidator {

    public static String validateString(String string) {
        if (string.equals(null)) {
            throw new NullPointerException();
        }
        return string;
    }
}
