package com.javafordev.lesson7.task4.utils;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Random;

public class TalonUtils {

    public static int generateRandomId() {
        int min = 1;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
        int randomId = random.nextInt(diff + 1);
        randomId += min;
        return randomId;
    }

    public static String generateDate() {
        String months[] = {"Январь", "Февраль", "Март", "Апрель", "Маи", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        Calendar calendar = Calendar.getInstance();
        String talonDate = calendar.get(Calendar.YEAR) + " " + months[calendar.get(Calendar.MONTH)] + calendar.get(Calendar.DATE);
        return talonDate;
    }

    public static String generateTime() {
        Calendar calendar = Calendar.getInstance();
        String talonTime = calendar.get(Calendar.HOUR) + " " + calendar.get(Calendar.MINUTE);
        return talonTime;
    }

    public static LocalDateTime generateRandomDate() {
        LocalDateTime now = LocalDateTime.now();
        long startEpochMilli = now.toInstant(ZoneOffset.UTC).toEpochMilli();
        LocalDateTime endRange = now.plus(20L, ChronoUnit.DAYS);
        long endEpochMilli = endRange.toInstant(ZoneOffset.UTC).toEpochMilli();
        long diff = endEpochMilli - startEpochMilli;
        Random random = new Random();
        long randomEpochMilli = random.nextInt((int) (diff));
        randomEpochMilli += startEpochMilli;
        Instant instant = Instant.ofEpochMilli(randomEpochMilli);
        return LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
    }
}
