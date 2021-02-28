package com.javafordev.lesson6.task1;

import java.util.ArrayList;
import java.util.List;

public class GradeRunner {

    public static void main(String[] args) {
        int countOfGrades = 10;
        List<Integer> gradeList = new ArrayList<>();
        for (int i = 0; i < countOfGrades; i++) {
            gradeList.add(GradeUtils.generateRandomGrade());
        }

        System.out.println("Список рандомных оценок : " + gradeList);
        System.out.println("Максимальная оценка : " + GradeUtils.findMaxGrade(gradeList));
    }
}
