package com.javafordev.lesson6.task3;

import java.util.ArrayList;

public class RandomNumbersRunner {
    public static void main(String[] args) {

        int countOfGrades = 22;
        ArrayList<Integer> randomNumbersList = new ArrayList<>();
        for (int i = 0; i < countOfGrades; i++) {
            randomNumbersList.add(RandomNumbersUtils.generateRandomNumber());
        }
        System.out.println("Список рандомных чисел : " + randomNumbersList);
        RandomNumbersService randomNumbersService = new RandomNumbersService(randomNumbersList);
        randomNumbersService.setRandomNumbersList(randomNumbersService.removeDuplicates());
        System.out.println("Список рандомных чисел после удаления дубликатов: " + randomNumbersService.getRandomNumbersList());
    }
}
