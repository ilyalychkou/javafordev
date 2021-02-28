package com.javafordev.lesson6.task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 1. Занести стихотворение в список.
 * 2. Отсортировать список по возврастанию строк
 */

public class ListService {

    List<String> listOfStrings;

    public ListService(ArrayList<String> listOfStrings) {
        this.listOfStrings = listOfStrings;
    }

    public List<String> getListOfStrings() {
        return listOfStrings;
    }

    public void setListOfStrings(ArrayList<String> listOfStrings) {
        this.listOfStrings = listOfStrings;
    }

    public void printList() {
        Iterator<String> iterator = this.getListOfStrings().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
