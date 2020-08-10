package com.javafordev.lesson4.task3;

public class TriangleRunner {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,4,5); //треугольник Пифагора
        System.out.println(Triangle.perimeter(triangle));
    }
}
