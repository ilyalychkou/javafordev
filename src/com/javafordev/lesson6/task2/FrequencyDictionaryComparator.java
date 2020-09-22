package com.javafordev.lesson6.task2;

import java.util.Comparator;
import java.util.Map;

public class FrequencyDictionaryComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Comparable) ((Map.Entry) (o1)).getValue())
                .compareTo(((Map.Entry) (o2)).getValue());
    }
}
