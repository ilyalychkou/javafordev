package com.javafordev.lesson6.task3;

import java.util.ArrayList;

/**
 * 1. Создать коллекцию
 * 2. Наполнить случаиными числами
 * 3. Удвлить повторяющиеся числа - Set
 */

public class RandomNumbersService {

    private ArrayList<Integer> randomNumbersList;

    public RandomNumbersService(ArrayList<Integer> randomNumbersList) {
        this.randomNumbersList = randomNumbersList;
    }

    public ArrayList<Integer> getRandomNumbersList() {
        return randomNumbersList;
    }

    public void setRandomNumbersList(ArrayList<Integer> randomNumbersList) {
        this.randomNumbersList = randomNumbersList;
    }

    public ArrayList<Integer> removeDuplicates() {
        ArrayList<Integer> randomNumbersListWithoutDuplicates = new ArrayList<>();
        for (Integer element : this.getRandomNumbersList()) {
            if (!randomNumbersListWithoutDuplicates.contains(element)) {
                randomNumbersListWithoutDuplicates.add(element);
            }
        }
        return randomNumbersListWithoutDuplicates;
    }
}
