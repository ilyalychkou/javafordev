package com.javafordev.lesson5.task1;

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

    public static String validateElement(String str) {
        if (str.equals("")) {
            System.out.println("Задан пустои элемент!");
            return "";
        }
        return str;
    }
}
