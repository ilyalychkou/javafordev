package com.javafordev.lesson6.task1;

import java.util.ArrayList;

public class GradeRunner {

    public static void main(String[] args) {
        int countOfGrades = 10;
        ArrayList<Integer> gradeList = new ArrayList<>();
        for (int i = 0; i < countOfGrades; i++) {
            gradeList.add(GradeUtils.generateRandomGrade());
        }

        System.out.println("Список рандомных оценок : " + gradeList);

        GradeService gradeService = new GradeService(gradeList);
        System.out.println("Максимальная оценка, наиденная с помощью итератора : " + gradeService.findMaxGrade());

    }


}
