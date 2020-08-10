package com.javafordev.lesson4.task2;

import java.util.Scanner;

/**
 * 2)Реализовать методы сложения, вычитания, умножения и деления объектов (для
 * тех классов, объекты которых могут поддерживать арифметические действия). Определить класс Дробь (Рациональная Дробь) в виде пары чисел m и n.
 * Объявить и инициализировать массив из k дробей, ввести/вывести значения для массива дробей. Создать массив/список/множество объектов и передать его в метод, который изменяет каждый элемент массива с четным
 * индексом путем добавления следующего за ним элемента.
 */

public class Fraction {

    protected double m;
    protected double n;
    protected double fraction;

    public Fraction() {
    }

    public Fraction(double m, double n) {
        try {
            this.m = m;
            this.n = n;
            this.fraction = this.m / this.n;
        } catch (Exception e) {
            System.out.println("Знаменатель дроби равен 0. Деление на 0 невозможно");
        }
    }

    public double getFraction() {
        return this.fraction;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "fraction=" + fraction +
                '}';
    }

    public double add(Fraction fraction) {
        return this.getFraction() + fraction.getFraction();
    }

    public double subtract(Fraction fraction) {
        return this.getFraction() - fraction.getFraction();
    }

    public double multiply(Fraction fraction) {
        return this.getFraction() * fraction.getFraction();
    }

    public double divide(Fraction fraction) {
        return this.getFraction() / fraction.getFraction();
    }

    //метод для вводв элементов массива типа Fraction
    public static Fraction[] fillArrayOfFractionsFromCommandLine() {
        System.out.print("Введите количество элементов массива: ");
        Scanner scan = new Scanner(System.in);
        int arrayLength = Math.abs(scan.nextInt());
        Fraction[] fractions = new Fraction[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            double randomNumerator = Math.random() * 31 + 10;
            double randomDenominator = Math.random() * 74 + 10;
            fractions[i] = new Fraction(randomNumerator, randomDenominator);
        }
        return fractions;
    }

    //метод для вывода элементов массива типа Fraction
    public static void printArrayOfFractions(Fraction[] fractions) {
        for (Fraction element : fractions) {
            System.out.println(element.toString());
        }
    }

    //метод для изменения массива fractions
    public static Fraction[] changeArrayOfFractions(Fraction[] fractions) {
        for (int i = 0; i < fractions.length; i += 2) {
            fractions[i].fraction = fractions[i].add(fractions[i + 1]);
        }
        return fractions;
    }
}
