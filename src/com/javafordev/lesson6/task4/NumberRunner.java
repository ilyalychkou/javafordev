package com.javafordev.lesson6.task4;

import java.util.ArrayList;

public class NumberRunner {
    public static void main(String[] args) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        int countOfGrades = 15;
        for (int i = 0; i < countOfGrades; i++) {
            listOfNumbers.add(NumberUtils.generateRandomNumber());
        }
        System.out.println("Список чисел до сортировки : " + listOfNumbers);
        NumberService numberService = new NumberService(listOfNumbers);
        numberService.setListOfNumbers(numberService.movePositiveToHeadAndNegativeToTail());
        System.out.println("Список чисел после сортировки c использованием компаратора : " + numberService.getListOfNumbers());
        listOfNumbers.clear();
        for (int i = 0; i < countOfGrades; i++) {
            listOfNumbers.add(NumberUtils.generateRandomNumber());
        }
        numberService.setListOfNumbers(numberService.reverseList());
        System.out.println("Список чисел после сортировки c использованием метода Collections.reverseOrder() : " + numberService.getListOfNumbers());
    }
}
