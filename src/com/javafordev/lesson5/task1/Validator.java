package com.javafordev.lesson5.task1;

import java.util.Objects;

public class Validator {

    public static String[] validateInputParameterForArray(String[] arrayName) {
        for (String element : arrayName) {
            if (element == null) {
                System.out.println("Входнои массив содержит null элементы!");
                return new String[arrayName.length];
            }
        }
        return arrayName;
    }

    public static void validateIndexForCurrentArray(String[] arrayOfStrings, int index) {
        if (index >= arrayOfStrings.length) {
            throw new ArrayIndexOutOfBoundsException("Заданныи индекс выходит за текущую длину массива строк!");
        }
    }

    public static int validateIndex(int index) {
        if (index < 0) {
            System.out.println("Задан индекс < 0 !");
            return 0;
        }
        return index;
    }

    public static int validateArrayLength(int arrayLength) {
        if (arrayLength < 0) {
            System.out.println("Задана длина массива < 0 !");
            return 0;
        }
        return arrayLength;
    }


    public static String validateElement(String str) {
        if (Objects.isNull(str)) {
            throw new NullPointerException("Задан null элемент!");
        }
        return str;
    }
}
