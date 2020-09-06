package com.javafordev.lesson4.task1;

public class Validator {

    public static String validateDestination(String destination) {

        if (destination.matches("[A-Za-z]+")) {
            return destination;
        } else {
            System.out.println("Для параметра destination задано пустое значение или строка состоит не из латинских символов.");
            return " ";
        }
    }

    public static int validateNumberOfFlight(int numberOfFlight) {
        if (numberOfFlight <= 0) {
            System.out.println("Для параметра numberOfFlight задано отрицательное или нулевое значение. "
                    + "Допустимые значения - целые положительные числа");
        }
        return numberOfFlight;

    }

    public static int validateDepartureTimeInHours(int departureTimeInHours) {
        if (departureTimeInHours < 0 || departureTimeInHours > 23) {
            System.out.println("Для параметра departureTimeInHours задано недопустимое значение. "
                    + "Допустимые значения - целые положительные числа от 0 до 23");
        }
        return departureTimeInHours;

    }

    public static int validateDepartureTimeInMinutes(int departureTimeInMinutes) {
        if (departureTimeInMinutes < 0 || departureTimeInMinutes > 59) {
            System.out.println("Для параметра departureTimeInMinutes задано недопустимое значение. "
                    + "Допустимые значения - целые положительные числа от 0 до 59");
        }
        return departureTimeInMinutes;

    }

    public static Airline[] validateInputParameterForArray(Airline[] arrayName) {
        for (Airline element : arrayName) {
            if (element == null) {
                System.out.println("Входнои массив содержит null элементы!");
                return new Airline[arrayName.length];
            }
        }
        return arrayName;
    }



}

