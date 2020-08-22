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

    public double getM() {
        return m;
    }

    public double getN() {
        return n;
    }

    public void setM(double m) {
        this.m = m;
    }

    public void setN(double n) {
        this.n = n;
    }

    public Fraction() {
    }

    public Fraction(double m, double n) {
            this.m = m;
            this.n = n;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "fraction=" + this.getFraction() +
                '}';
    }

    public Fraction add(Fraction fraction) {
        double denominator = this.getN() * fraction.getN();
        double numerator = denominator / this.getM() + denominator / fraction.getM();
        return new Fraction(numerator, denominator);
    }

    public Fraction subtract(Fraction fraction) {
        double denominator = this.getN() * fraction.getN();
        double numerator = denominator / this.getM() - denominator / fraction.getM();
        return new Fraction(numerator, denominator);
    }

    public Fraction multiply(Fraction fraction) {
        double denominator = this.getN() * fraction.getN();
        double numerator = (denominator / this.getM()) * (denominator / fraction.getM());
        return new Fraction(numerator, denominator);
    }

    public Fraction divide(Fraction fraction) {
        double denominator = this.getN() * fraction.getN();
        double numerator = (denominator / this.getM()) / (denominator / fraction.getM());
        return new Fraction(numerator, denominator);
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
        for (int i = 0; i < fractions.length; i = i + 2) {
            fractions[i] = fractions[i].add(fractions[i + 1]);
        }
        return fractions;
    }

    public double getFraction() {
        double fraction=0.0;
        try {
            fraction =  this.getM() / this.getN();
        } catch (Exception e) {
            System.out.println("Знаменатель дроби равен 0!");
        }
        return fraction;
    }
}
