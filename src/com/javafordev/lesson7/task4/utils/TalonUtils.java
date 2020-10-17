package com.javafordev.lesson7.task4.utils;

import java.sql.Timestamp;
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

    public static Timestamp generateRandomDate() {
        long startRange = Timestamp.valueOf("2020-01-01 09:00:00").getTime();
        long endRange = Timestamp.valueOf("2020-10-01 19:00:00").getTime();
        long diff = endRange - startRange + 1;
        return new Timestamp(startRange + (long)(Math.random() * diff));
    }
}
