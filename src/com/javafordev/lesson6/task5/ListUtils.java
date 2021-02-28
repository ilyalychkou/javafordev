package com.javafordev.lesson6.task5;

import java.util.ArrayList;
import java.util.Collections;

public class ListUtils {
    public static void sortByLength(ArrayList<String> list) {
        Collections.sort(list, new LengthComparator());
    }
}
