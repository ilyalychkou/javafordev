package com.javafordev.lesson6.task3;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 1. Создать коллекцию
 * 2. Наполнить случаиными числами
 * 3. Удвлить повторяющиеся числа
 */

public class RandomNumbersService {

    private List<Integer> randomNumbersList;

    public RandomNumbersService(List<Integer> randomNumbersList) {
        this.randomNumbersList = randomNumbersList;
    }

    public List<Integer> getRandomNumbersList() {
        return randomNumbersList;
    }

    public void setRandomNumbersList(List<Integer> randomNumbersList) {
        this.randomNumbersList = randomNumbersList;
    }

    public List<Integer> removeDuplicates() {
        return this.getRandomNumbersList().stream().distinct().collect(Collectors.toList());
    }

    public HashSet removeDuplicateViaSet() {
        return new HashSet<>(this.getRandomNumbersList());
    }
}
