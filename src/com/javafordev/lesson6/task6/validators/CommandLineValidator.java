package com.javafordev.lesson6.task6.validators;

public class CommandLineValidator {

    public static void validateServiceType(int serviceType) {

        if (serviceType < 0 || serviceType > 2) {
            throw new IllegalArgumentException("Значение параметра выходит за границы допустимых значении (от 1 до 2)!");
        }
    }

    public static void validateOption(int option) {

        if (option < 0 || option > 3) {
            throw new IllegalArgumentException("Значение параметра выходит за границы допустимых значении (от 1 до 3)!");
        }
    }
}
