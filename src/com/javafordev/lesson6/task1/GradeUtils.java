package com.javafordev.lesson6.task1;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class GradeUtils {

    public static int generateRandomGrade() {
        int min = 12;
        int max = 45;
        int diff = max - min;
        Random random = new Random();
        int randomGrade = random.nextInt(diff+1);
        randomGrade +=min;
        return randomGrade;
    }

    public static int findMaxGrade(List<Integer> integerList) {
        int maxGrade = 0;
        Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()) {
            int currentElement = iterator.next();
            if (currentElement > maxGrade) {
                maxGrade = currentElement;
            }
        }
        return maxGrade;
    }
}
