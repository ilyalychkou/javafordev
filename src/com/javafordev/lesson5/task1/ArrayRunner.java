package com.javafordev.lesson5.task1;

import java.util.Arrays;

/**
 * Тестовые значения:
 * 1. int index - <0, в пределах длины массива, за пределами массива
 * 2. String newElement - пустое, не пустое, null
 * 3. ArrayService arrayService - через конструктор с массивом на входе, через конструктор с длинои массива на входе (<0, 0, >0)
 */

public class ArrayRunner {
    public static void main(String[] args) {

        //инициализация исходного массива типа String
        String[] arrayOfStrings = {"Rome", "Barcelona", "Sydney", "Seoul", "Brest", "Vancouver"};
        ArrayService arrayService = new ArrayService(arrayOfStrings);

        System.out.println("Текущая длина исходного массива : " + arrayService.getLength());
        System.out.println("Вывод элементов исходного массива, используя toString(): " + arrayService);
        System.out.println("Получение всех элементов массива, используя метод getAllElements(): " + Arrays.toString(arrayService.getAllElements()));
        System.out.println();
        System.out.println("Текущая длина массива после добавления в него нового элемента: " + arrayService.addElement("Palermo"));
        System.out.println("Вывод элементов массива после добавления в него нового элемента , используя toString(): " + arrayService);
        System.out.println("Получение всех элементов массива, используя метод getAllElements(): " + Arrays.toString(arrayService.getAllElements()));
        System.out.println();
        System.out.println("Элемент массива по заданному индексу: " + arrayService.getElement(2));
        System.out.println();
        System.out.println("Удаление всех элементов массива...");
        arrayService.removeAllElements();
        System.out.println("Текущая длина массива после удаления всех элементнов: " + arrayService.getLength());
        System.out.println("Вывод элементов массива после удаления всех элементнов, используя toString(): " + arrayService);
        System.out.println("Получение всех элементов массива, используя метод getAllElements(): " + Arrays.toString(arrayService.getAllElements()));

        ArrayService arrayServiceByLength = new ArrayService(12);
        String[] arrayOfMonths = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        arrayServiceByLength.setArray(arrayOfMonths);

        System.out.println("Текущая длина исходного массива, созданного через конструктор по длине массива : " + arrayServiceByLength.getLength());
        System.out.println("Вывод элементов исходного массива, созданного через конструктор по длине массива, используя toString(): " + arrayServiceByLength);
    }
}
