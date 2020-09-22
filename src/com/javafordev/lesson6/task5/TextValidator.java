package com.javafordev.lesson6.task5;

public class TextValidator {

    public static String validateString(String string) {
        if (string.equals(null)) {
            throw new NullPointerException();
        }
        return string;
    }
}
