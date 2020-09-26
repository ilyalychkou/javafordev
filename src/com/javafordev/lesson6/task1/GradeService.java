package com.javafordev.lesson6.task1;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * 1.Создать список оценок учеников с помощью ArrayList, заполнить случаиными числами.
 * 2.Наити самую высокую оценку с помощи итератора.
 */

public class GradeService {

    private ArrayList<Integer> gradeList;

    public GradeService(ArrayList<Integer> gradeList) {
        this.gradeList = gradeList;
    }

    public ArrayList<Integer> getGradeList() {
        return gradeList;
    }

    public void setGradeList(ArrayList<Integer> gradeList) {
        this.gradeList = gradeList;
    }

    public int findMaxGrade() {
        int maxGrade = 0;
        Iterator<Integer> iterator = this.getGradeList().iterator();
        while (iterator.hasNext()) {
            int currentElement = iterator.next();
            if (currentElement > maxGrade) {
                maxGrade = currentElement;
            }
        }
        return maxGrade;
    }

}
