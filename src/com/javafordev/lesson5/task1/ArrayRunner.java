package com.javafordev.lesson5.task1;

import java.util.Arrays;

/**
 * Тестовые значения:
 * 1. int index - <0, в пределах длины массива, за пределами массива
 * 2. String newElement - пустое, не пустое
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
        System.out.println("Элемент массива по заданному индексу: " + arrayService.getElement(1));
        System.out.println();
        System.out.println("Удаление всех элементов массива...");
        arrayService.removeAllElements();
        System.out.println("Текущая длина массива после удаления всех элементнов: " + arrayService.getLength());
        System.out.println("Вывод элементов массива после удаления всех элементнов, используя toString(): " + arrayService);
        System.out.println("Получение всех элементов массива, используя метод getAllElements(): " + Arrays.toString(arrayService.getAllElements()));

    }
}
