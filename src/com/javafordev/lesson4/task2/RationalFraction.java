package com.javafordev.lesson4.task2;

public class RationalFraction extends Fraction {

    public RationalFraction(double m, double n) {
        try {
            this.m = m;
            this.n = n;
        } catch (Exception e) {
            System.out.println("Знаменатель рациjлнальнои дроби равен 0!");
        }
    }

    public double getRationalFraction() {
        double rationalFraction = 0.0;
        try {
            rationalFraction = (this.getM() + this.getN()) / (this.getM() - this.getN());
        } catch (Exception e) {
            System.out.println("Знаменатель дроби равен 0!");
        }
        return rationalFraction;
    }

    @Override
    public String toString() {
        return "RationalFraction{" +
                "fraction=" + this.getRationalFraction() +
                '}';
    }
}
