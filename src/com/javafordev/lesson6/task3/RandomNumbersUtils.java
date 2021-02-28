package com.javafordev.lesson6.task3;

import java.util.Random;

public class RandomNumbersUtils {

    public static int generateRandomNumber() {

        int min = 10;
        int max = 25;
        int diff = max - min;
        Random random = new Random();
        int randomNumber = random.nextInt(diff+1);
        randomNumber +=min;
        return randomNumber;
    }
}
