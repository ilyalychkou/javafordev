package com.javafordev.lesson6.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1. Не используя вспомогательных объектов, переставить
 * отрицательные элементы списка - в конец,
 * положитетельные - в начало
 */

public class NumberService<T> {

    List<Integer> listOfNumbers;

    public NumberService(ArrayList<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    public List<Integer> getListOfNumbers() {
        return listOfNumbers;
    }

    public void setListOfNumbers(List<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    public List<Integer> movePositiveToHeadAndNegativeToTail() {
        List<Integer> convertedList = this.getListOfNumbers();
        convertedList.sort(new NumberComparator());
        return convertedList;
    }

    public List<Integer> reverseList() {
        List<Integer> convertedList = this.getListOfNumbers();
        Collections.sort(convertedList, Collections.reverseOrder());
        return convertedList;
    }
}
