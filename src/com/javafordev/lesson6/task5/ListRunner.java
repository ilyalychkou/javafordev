package com.javafordev.lesson6.task5;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Исходное стихотворение Зимняя ночь:
 *
 * Мело, мело по всей земле
 * Во все пределы.
 * Свеча горела на столе,
 * Свеча горела.
 *
 * Как летом роем мошкара
 * Летит на пламя,
 * Слетались хлопья со двора
 * К оконной раме.
 *
 * Метель лепила на стекле
 * Кружки и стрелы.
 * Свеча горела на столе,
 * Свеча горела.
 *
 * На озаренный потолок
 * Ложились тени,
 * Скрещенья рук, скрещенья ног,
 * Судьбы скрещенья.
 *
 */

public class ListRunner {
    public static void main(String[] args) throws FileNotFoundException {

        String localPathToFileWithText = "src/com/javafordev/lesson6/task5/FileWithPoem.txt";
        ArrayList<String> listWithPoem = TextUtils.readTextFromFile(localPathToFileWithText);

        ListService listService = new ListService(listWithPoem);
        System.out.println("Исходныи текст стихотворения : ");
        System.out.println();
        listService.printList();
        System.out.println();

        System.out.println("Текст стихотворения после сортировки по длине строки : ");
        System.out.println();
        ListUtils.sortByLength(listWithPoem);
        listService.printList();
    }
}
