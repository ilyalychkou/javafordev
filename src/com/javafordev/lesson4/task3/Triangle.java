package com.javafordev.lesson4.task3;

import static java.lang.StrictMath.abs;
import static java.lang.StrictMath.pow;

/**
 * 1. Определить класс Треугольник на плоскости.
 * 2. Определить площадь и периметр треугольника.
 * 3. Создать массив/список/множество объектов и подсчитать количество треугольников разного типа (равносторонний, равнобедренный, прямоугольный, произвольный).
 * 4. Определить для каждой группы наибольший и наименьший по площади (периметру) объект.
 */

public class Triangle {

    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public double getSideOne() {
        return sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public double getSideThree() {
        return sideThree;
    }

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        if (isTriangleCorrect(sideOne, sideTwo, sideThree)) {
            this.sideOne = sideOne;
            this.sideTwo = sideTwo;
            this.sideThree = sideThree;
        } else {
            System.out.println("Фигура из трех введенных сторон не является треугольником!");
        }
    }

    public double square() {
        double perimeter = this.perimeter();
        return Math.sqrt(0.5 * perimeter * (0.5 * perimeter - this.sideOne) * (0.5 * perimeter - this.sideTwo) * (0.5 * perimeter - this.sideThree));
    }

    public double perimeter() {
        return this.getSideOne() + this.getSideTwo() + this.getSideThree();
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

    public boolean isTriangleNinetyAngle() {
        boolean condition1 = (pow(this.getSideOne(), 2)) == (pow(this.getSideTwo(), 2) + pow(this.getSideThree(), 2));
        boolean condition2 = (pow(this.getSideTwo(), 2)) == (pow(this.getSideOne(), 2) + pow(this.getSideThree(), 2));
        boolean condition3 = (pow(this.getSideThree(), 2)) == (pow(this.getSideOne(), 2) + pow(this.getSideTwo(), 2));
        return (condition1 || condition2 || condition3);
    }

    public boolean isTriangleIsosceles() {
        boolean condition1 = ((this.getSideOne() == this.getSideTwo()) && (this.getSideOne() != this.getSideThree()));
        boolean condition2 = ((this.getSideTwo() == this.getSideThree()) && (this.getSideOne() != this.getSideTwo()));
        boolean condition3 = ((this.getSideOne() == this.getSideThree()) && (this.getSideOne() != this.getSideTwo()));
        return (condition1 || condition2 || condition3);
    }

    public boolean isTriangleEquilateral() {
        return (this.getSideOne() == this.getSideTwo() && this.getSideOne() == this.getSideThree());
    }

    public static double getMinTriangleByFilter(Triangle[] triangles, String filter) {
        double minElement = 0;
        if (filter.equals("square")) {
            minElement = triangles[0].square();
            for (int i = 0; i < triangles.length; i++) {
                if ((triangles[i] != null) && (triangles[i].square() < minElement)) {
                    minElement = triangles[i].square();
                }
            }
        }

        if (filter.equals("perimeter")) {
            minElement = triangles[0].perimeter();
            for (int i = 0; i < triangles.length; i++) {
                if ((triangles[i] != null) && (triangles[i].perimeter() < minElement)) {
                    minElement = triangles[i].perimeter();
                }
            }
        }
        return minElement;
    }

    public static double getMaxTriangleByFilter(Triangle[] triangles, String filter) {
        double maxElement = 0;
        if (filter.equals("square")) {
            maxElement = triangles[0].square();
            for (int i = 0; i < triangles.length; i++) {
                if ((triangles[i] != null) && (triangles[i].square() > maxElement)) {
                    maxElement = triangles[i].square();
                }
            }
        }

        if (filter.equals("perimeter")) {
            maxElement = triangles[0].perimeter();
            for (int i = 0; i < triangles.length; i++) {
                if ((triangles[i] != null) && (triangles[i].perimeter() > maxElement)) {
                    maxElement = triangles[i].perimeter();
                }
            }
        }
        return maxElement;
    }
}

