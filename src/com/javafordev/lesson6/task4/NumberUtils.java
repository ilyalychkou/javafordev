package com.javafordev.lesson6.task4;

import java.util.Random;

public class NumberUtils {

    public static int generateRandomNumber() {

        int min = -155;
        int max = 155;
        int diff = max - min;
        Random random = new Random();
        int randomNumber = random.nextInt(diff+1);
        randomNumber +=min;
        return randomNumber;
    }
}
