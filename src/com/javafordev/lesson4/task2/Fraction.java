package com.javafordev.lesson4.task2;

import static com.javafordev.lesson4.task2.Validator.validateDenominator;

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
        this.n = validateDenominator(n);
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
        double numerator = denominator / validateDenominator(this.getM()) + denominator / validateDenominator(fraction.getM());
        return new Fraction(numerator, denominator);
    }

    public Fraction subtract(Fraction fraction) {
        double denominator = this.getN() * fraction.getN();
        double numerator = denominator / validateDenominator(this.getM()) - denominator / validateDenominator(fraction.getM());
        return new Fraction(numerator, denominator);
    }

    public Fraction multiply(Fraction fraction) {
        double denominator = this.getN() * fraction.getN();
        double numerator = (denominator / validateDenominator(this.getM())) * (denominator / validateDenominator(fraction.getM()));
        return new Fraction(numerator, denominator);
    }

    public Fraction divide(Fraction fraction) {
        double denominator = this.getN() * fraction.getN();
        double numerator = (denominator / validateDenominator(this.getM())) / (denominator / validateDenominator(fraction.getM()));
        return new Fraction(numerator, denominator);
    }

    public double getFraction() {
        return this.getM() / validateDenominator(this.getN());
    }
}
