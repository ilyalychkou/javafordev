package com.javafordev.lesson4.task2;

import java.util.Scanner;

import static com.javafordev.lesson4.task2.Validator.validateInputParameterForArray;

public class FractionService {
    Fraction[] fractions;

    public Fraction[] getFractions() {
        return fractions;
    }

    public void setFractions(Fraction[] fractions) {
        this.fractions = validateInputParameterForArray(fractions);
    }

    public FractionService(Fraction[] fractions) {
        this.fractions = validateInputParameterForArray(fractions);
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
    public void printArrayOfFractions() {
        for (Fraction element : this.fractions) {
            System.out.println(element);
        }
    }

    //метод для изменения массива fractions
    public Fraction[] changeArrayOfFractions() {
        if (this.fractions.length % 2 == 0) {
            for (int i = 0; i < this.fractions.length; i = i + 2) {

                this.fractions[i] = this.fractions[i].add(fractions[i + 1]);
            }
        } else {
            for (int i = 0; i < this.fractions.length - 1; i = i + 2) {

                this.fractions[i] = this.fractions[i].add(fractions[i + 1]);
            }
        }

        return fractions;
    }


}
