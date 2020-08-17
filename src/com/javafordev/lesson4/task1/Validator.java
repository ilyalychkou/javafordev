package com.javafordev.lesson4.task1;

public class Validator {

    public static String validateInputParameterForString(String parameterName, String parameterValue) {

        if (parameterName.equals("destination") && parameterValue.equals("")) {
            System.out.println("Для параметра destination задано пустое значение. "
                    + "Допустимые значения - латиница, не пустая строка");
            return " ";
        } else {
            return parameterValue;
        }
    }

    public static int validateStringParameterForNumber(String parameterName, int parameterValue) {

        int validatedParameterValue = 0;
        switch (parameterName) {
            case "numberOfFlight":
                if (parameterValue <= 0) {
                    System.out.println("Для параметра numberOfFlight задано отрицательное или нулевое значение. "
                            + "Допустимые значения - целые положительные числа");
                } else {
                    validatedParameterValue = parameterValue;
                    return parameterValue;
                }
                break;
            case "departureTimeInHours":
                if (parameterValue < 0 || parameterValue > 23) {
                    System.out.println("Для параметра departureTimeInHours задано недопустимое значение. "
                            + "Допустимые значения - целые положительные числа от 0 до 23");
                } else {
                    validatedParameterValue = parameterValue;
                    return parameterValue;
                }
                break;
            case "departureTimeInMinutes":
                if (parameterValue < 0 || parameterValue > 59) {
                    System.out.println("Для параметра departureTimeInMinutes задано недопустимое значение. "
                            + "Допустимые значения - целые положительные числа от 0 до 59");
                } else {
                    validatedParameterValue = parameterValue;
                    return parameterValue;
                }
                break;
            default:
                System.out.println("Задано некорректное имя входного параметра!");
        }
        return validatedParameterValue;
    }
}

