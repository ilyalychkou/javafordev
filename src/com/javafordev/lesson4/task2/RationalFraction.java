package com.javafordev.lesson4.task2;

public class RationalFraction extends Fraction {

    public RationalFraction(double m, double n) {
        try {
            this.m = m;
            this.n = n;
            this.fraction = (this.m + this.n) / (this.m - this.n);
        } catch (Exception e) {
            System.out.println("Знаменатель рацилнальнои дроби равен 0. Деление на 0 невозможно");
        }
    }

    @Override
    public String toString() {
        return "RationalFraction{" +
                "fraction=" + fraction +
                '}';
    }
}
