package com.javafordev.lesson6.task4;

import java.util.ArrayList;

public class NumberRunner {
    public static void main(String[] args) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(-1);
        listOfNumbers.add(666);
        listOfNumbers.add(-8);
        listOfNumbers.add(3);
        listOfNumbers.add(-2);
        listOfNumbers.add(0);
        listOfNumbers.add(-5);
        listOfNumbers.add(1);
        listOfNumbers.add(-3);
        listOfNumbers.add(2);
        listOfNumbers.add(-4);
        listOfNumbers.add(4);
        listOfNumbers.add(-22);
        listOfNumbers.add(155);
        listOfNumbers.add(0);

        System.out.println("Список чисел до сортировки : " + listOfNumbers);
        NumberService numberService = new NumberService(listOfNumbers);
        numberService.setListOfNumbers(numberService.movePositiveToHeadAndNegativeToTail());
        System.out.println("Список чисел после сортировки : " + numberService.getListOfNumbers());

    }
}
