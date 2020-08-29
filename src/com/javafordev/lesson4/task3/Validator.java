package com.javafordev.lesson4.task3;

import static java.lang.StrictMath.abs;

public class Validator {

    public static double validateSide(double side) {
        if (side <= 0) {
            System.out.println("Задана сторона треугольника <=0");
        }
        return side;
    }

    public static Triangle[] validateInputParameterForArray(Triangle[] arrayName) {
        for (Triangle element : arrayName) {
            if (element == null) {
                System.out.println("Входнои массив содержит null элементы!");
                return new Triangle[arrayName.length];
            }
        }
        return arrayName;
    }

    public static boolean isTriangleCorrect(double sideOne, double sideTwo, double sideThree) {
        boolean condition1 = getCondition(sideOne, sideTwo, sideThree);
        boolean condition2 = getCondition(sideTwo, sideOne, sideThree);
        boolean condition3 = getCondition(sideThree, sideOne, sideTwo);
        return (condition1 && condition2 && condition3);
    }

    public static boolean getCondition(double side1, double side2, double side3) {
        return (side1 < (side2 + side3)) && (side1 > (abs(side2 - side3)));
    }

    public static Triangle[] removeNullElementsFromArray(Triangle[] arrayName) {
        int countOfNotNullElements = 0;
        for (Triangle element : arrayName) {
            if (element != null) {
                countOfNotNullElements++;
            }
        }

        Triangle[] fitleredArrayWithoutNullElements = new Triangle[countOfNotNullElements];
        int i = 0;
        for (Triangle element : arrayName) {
            if (element != null) {
                fitleredArrayWithoutNullElements[i] = element;
                i++;
            }
        }
        return fitleredArrayWithoutNullElements;
    }
}
