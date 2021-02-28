package com.javafordev.lesson6.task6.validators;

public class NumberValidator {

    public static double validatePrice(String price) {

        if (Double.parseDouble(price) <= 0) {
            throw new IllegalArgumentException("Задан невалидное значение стоимости");
        }
        return Double.parseDouble(price);
    }

    public static double validateSubscriptionFee(String subscriptionFee) {
        if (Double.parseDouble(subscriptionFee) <= 0) {
            throw new IllegalArgumentException("Задан невалидное значение абонентскои платы");
        }
        return Double.parseDouble(subscriptionFee);
    }

    public static int validateDuration(String duration) {
        if (Integer.parseInt(duration) <= 0) {
            throw new IllegalArgumentException("Задан невалидное значение длительности путешествия");
        }
        return Integer.parseInt(duration);
    }

    public static int validateInternetTrafficVolume(String internetTrafficVolume) {
        if (Integer.parseInt(internetTrafficVolume) <= 0) {
            throw new IllegalArgumentException("Задан невалидное значение объема интернет-траффика");
        }
        return Integer.parseInt(internetTrafficVolume);
    }
}

