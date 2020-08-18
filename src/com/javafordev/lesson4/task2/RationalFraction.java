package com.javafordev.lesson4.task2;

public class RationalFraction extends Fraction {

    public RationalFraction(double m, double n) {
        try {
            this.m = m;
            this.n = n;
            this.fraction = (this.m + this.n) / (this.m - this.n);
        } catch (Exception e) {
            System.out.println("Знаменатель рациjлнальнои дроби равен 0!");
        }
    }

    @Override
    public String toString() {
        return "RationalFraction{" +
                "fraction=" + fraction +
                '}';
    }
}
