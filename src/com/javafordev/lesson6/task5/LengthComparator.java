package com.javafordev.lesson6.task5;

import java.util.Comparator;

public class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        TextValidator.validateString(o1);
        TextValidator.validateString(o2);
        return o1.length()-(o2.length());
    }
}
