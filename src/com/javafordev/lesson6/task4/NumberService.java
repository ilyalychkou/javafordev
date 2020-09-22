package com.javafordev.lesson6.task4;

import java.util.ArrayList;

/**
 * 1. Не используя вспомогательных объектов, переставить
 * отрицательные элементы списка - в конец,
 * положитетельные - в начало
 */

public class NumberService {

    ArrayList<Integer> listOfNumbers;

    public NumberService(ArrayList<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    public ArrayList<Integer> getListOfNumbers() {
        return listOfNumbers;
    }

    public void setListOfNumbers(ArrayList<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    public ArrayList<Integer> movePositiveToHeadAndNegativeToTail() {
        ArrayList<Integer> convertedList = this.getListOfNumbers();
        convertedList.sort(new NumberComparator());
        return convertedList;
    }
}
