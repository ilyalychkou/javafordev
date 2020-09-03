package com.javafordev.lesson4.task3;

import static com.javafordev.lesson4.task3.Validator.isTriangleCorrect;
import static com.javafordev.lesson4.task3.Validator.validateSide;
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

    public void setSideOne(double sideOne) {
        this.sideOne = validateSide(sideOne);
        if (!(isTriangleCorrect(this.getSideOne(), this.getSideTwo(), this.getSideThree()))) {
            System.out.println("Нельзя построить треугольник из трех заданных сторон!");
        }
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = validateSide(sideTwo);
        if (!(isTriangleCorrect(this.getSideOne(), this.getSideTwo(), this.getSideThree()))) {
            System.out.println("Нельзя построить треугольник из трех заданных сторон!");
        }
    }

    public void setSideThree(double sideThree) {
        this.sideThree = validateSide(sideThree);
        if (!(isTriangleCorrect(this.getSideOne(), this.getSideTwo(), this.getSideThree()))) {
            System.out.println("Нельзя построить треугольник из трех заданных сторон!");
        }
    }

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        if (isTriangleCorrect(validateSide(sideOne), validateSide(sideTwo), validateSide(sideThree))) {
            this.sideOne = sideOne;
            this.sideTwo = sideTwo;
            this.sideThree = sideThree;
        } else {
            System.out.println("Нельзя построить треугольник из трех заданных сторон!");
        }
    }

    public double calculateSquare() {
        double perimeter = this.calculatePerimeter();
        return Math.sqrt(0.5 * perimeter * (0.5 * perimeter - this.sideOne) * (0.5 * perimeter - this.sideTwo) * (0.5 * perimeter - this.sideThree));
    }

    public double calculatePerimeter() {
        return this.getSideOne() + this.getSideTwo() + this.getSideThree();
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

}

