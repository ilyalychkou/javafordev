package com.javafordev.lesson4.task2;

import static com.javafordev.lesson4.task2.Validator.validateDenominator;

public class RationalFraction extends Fraction {

    public RationalFraction(double m, double n) {
        this.m = m;
        this.n = validateDenominator(n);
    }

    public double getRationalFraction() {
        return (this.getM() + this.getN()) / validateDenominator(this.getM() - this.getN());
    }

    @Override
    public String toString() {
        return "RationalFraction{" +
                "fraction=" + this.getRationalFraction() +
                '}';
    }
}
