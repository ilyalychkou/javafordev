package com.javafordev.lesson6.task4;

import java.util.Comparator;

public class NumberComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        NumberValidator.validateInputNumber(o1);
        NumberValidator.validateInputNumber(o2);
        int returnValue = 0;
        if (o1.intValue() > 0 && o2.intValue() < 0) {
            returnValue = -1;
        } else if (o1.intValue() == 0 || o2.intValue() == 0) {
            returnValue = -1;
        } else if (o1.intValue() < 0 && o2.intValue() > 0) {
            returnValue = 1;
        }
        return returnValue;
    }
}
