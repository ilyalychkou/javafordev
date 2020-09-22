package com.javafordev.lesson6.task1;

public class GradeUtils {

    public static int generateRandomGrade() {
        int randomGrade = (int) (Math.random() * 10);
        if (randomGrade == 0) {
            randomGrade = 1;
        }
        return randomGrade;
    }
}
