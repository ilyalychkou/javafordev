package com.javafordev.lesson4.task2;

public class FractionRunner {
    public static void main(String[] args) {

        int numberOfFractions = 7;

        //инициализация объектов класса Fraction
        Fraction fraction1 = new Fraction(3, 9);
        Fraction fraction2 = new Fraction(5, 13);
        System.out.println();

        //вызов методов add(), subtract(), multiply(), divide() для объектов класса Fraction
        System.out.println(fraction1.add(fraction2));
        System.out.println(fraction1.subtract(fraction2));
        System.out.println(fraction1.multiply(fraction2));
        System.out.println(fraction1.divide(fraction2));
        System.out.println();

        //инициализация объектов класса RationalFraction
        RationalFraction rationalFraction1 = new RationalFraction(7, 9);
        RationalFraction rationalFraction2 = new RationalFraction(5, 13);

        //вызов методов add(), subtract(), multiply(), divide() для объектов класса RationalFraction
        System.out.println(rationalFraction1.add(rationalFraction2));
        System.out.println(rationalFraction1.subtract(rationalFraction2));
        System.out.println(rationalFraction1.multiply(rationalFraction2));
        System.out.println(rationalFraction1.divide(rationalFraction2));
        System.out.println();

        //инициализация массива объектов типа Ration
        Fraction[] fractions = new Fraction[numberOfFractions];
        Fraction[] rationalFractions = new RationalFraction[numberOfFractions];

        fractions[0] = new Fraction(3, 4);
        fractions[1] = new Fraction(2, 9);
        fractions[2] = new Fraction(14, 23);
        fractions[3] = new Fraction(5, 8);
        fractions[4] = new Fraction(4, 91);
        fractions[5] = new Fraction(6, 7);
        fractions[6] = new Fraction(6, 11);

        rationalFractions[0] = new RationalFraction(3, 4);
        rationalFractions[1] = new RationalFraction(2, 9);
        rationalFractions[2] = new RationalFraction(14, 23);
        rationalFractions[3] = new RationalFraction(5, 8);
        rationalFractions[4] = new RationalFraction(4, 91);
        rationalFractions[5] = new RationalFraction(6, 7);
        rationalFractions[6] = new RationalFraction(6, 11);

        //вывод на печать массива элементов типа Fraction
        System.out.println("Вывод на печать массива типа Fraction...");
        Fraction.printArrayOfFractions(fractions);
        System.out.println();

        //вывод на печать массива элементов типа RationalFraction
        System.out.println("Вывод на печать массива типа RationalFraction...");
        Fraction.printArrayOfFractions(rationalFractions);
        System.out.println();

        //заполнение и вывод на печать массива, заполненного дробями на основании случаиных чисел
        System.out.println("Заполнение и вывод на печать массива типа Fraction, заполненного дробями на основании случаиных чисел...");
        Fraction.printArrayOfFractions(Fraction.fillArrayOfFractionsFromCommandLine());
        System.out.println();

        //преобразование исх массива, добавление элементам с четными индексами следующего элемента
        Fraction[] fractions1 = Fraction.fillArrayOfFractionsFromCommandLine();
        System.out.println("Вывод на печать исходного массива...");
        Fraction.printArrayOfFractions(fractions1);
        Fraction.changeArrayOfFractions((fractions1));
        System.out.println("Вывод на печать измененного массива - добавление элементам с четными индексами следующего элемента...");
        Fraction.printArrayOfFractions(fractions1);

    }
}
