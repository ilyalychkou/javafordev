package com.javafordev.lesson6.task5;

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
 *
 */

public class ListRunner {
    public static void main(String[] args) {
        ArrayList<String> listWithPoem = new ArrayList<>();
        listWithPoem.add("Мело, мело по всей земле");
        listWithPoem.add("Во все пределы.");
        listWithPoem.add("Свеча горела на столе,");
        listWithPoem.add("Свеча горела.");
        listWithPoem.add("Как летом роем мошкара");
        listWithPoem.add("Летит на пламя,");
        listWithPoem.add("Слетались хлопья со двора");
        listWithPoem.add("К оконной раме.");
        listWithPoem.add("Метель лепила на стекле");
        listWithPoem.add("Кружки и стрелы.");
        listWithPoem.add("Свеча горела на столе,");
        listWithPoem.add("Свеча горела.");
        listWithPoem.add("На озаренный потолок");
        listWithPoem.add("Скрещенья рук, скрещенья ног,");
        listWithPoem.add("Судьбы скрещенья.");

        ListService listService = new ListService(listWithPoem);
        System.out.println("Исходныи текст стихотворения: ");
        listService.printList();
        System.out.println();

        System.out.println("Текст стихотворения после сортировки: ");
        ListUtils.sortByLength(listWithPoem);
        listService.printList();
    }
}
