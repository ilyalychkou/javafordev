package com.javafordev.lesson4.task3;

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
    private double square;
    private double perimeter;

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        if ((int) sideOne == 0 || (int) sideTwo == 0 || (int) sideThree == 0) {
            System.out.println("Одна из введенных сторон треугольника равна 0. Ни одна сторона треугольника не может быть равна 0");
        } else if (sideOne < 0 || sideTwo < 0 || sideThree < 0) {
            System.out.println("Одна из введенных сторон треугольника < 0. Допустимые значения для сторон треугольника > 0");
        } else {
            this.sideOne = sideOne;
            this.sideTwo = sideTwo;
            this.sideThree = sideThree;
        }
    }

    public  double square(Triangle triangle) {
//        double square = this.sideOne + this.sideTwo + this.sideThree;

        return square;
    }

    public static double perimeter(Triangle triangle) {
        return triangle.sideOne + triangle.sideTwo + triangle.sideThree;
    }
}
