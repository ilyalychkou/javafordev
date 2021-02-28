package com.javafordev.lesson6.task1;

import java.util.Collections;
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
        return Collections.max(integerList);
    }
}
