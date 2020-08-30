package com.javafordev.lesson5.task2;

import static com.javafordev.lesson5.task2.StringUtils.*;

/**
 * Тестовые значения:
 * 1. char symbol - регистр - верхнии/нижнии/разные, слова - палиндром/не палиндром
 * 2. String newElement - пустое, не пустое
 * 3. замена подтроки - подсрока есть - вначале, всередине, в конце, между пробелами/спецсимволами
 * 4. количество вхождении подстроки - подстрока не входит в строку, подстрока входит в строку один/несколько раз
 * 5. является ли строка IP адресом (IPv4) - IP адрес, лишние цифры в октете, буквы в октете, "00", любои октет >255 (256), любои октет=255
 */

public class StringRunner {

    public static void main(String[] args) {

        //инициализация исходного массива типа String
        String[] arrayOfStrings = {"taTtaattAt", "Mango", "Pineapple", "Pear", "Watermelon", "Plum", "Hippopotamus", "Onion"};
        StringService stringService = new StringService(arrayOfStrings);

        System.out.println("Самая длинная строка в массиве : " + stringService.findByMaxLength());

        isPalindrome(stringService.strings[0]);
        isPalindrome(stringService.findByMaxLength());
        System.out.println();

        String stringToReplace = "мяу бяка гав-гав гуд игнор бяка+/# финиш...бяки-бякаяка";
        String substringFrom = "бяка";
        String substringTo = "ягода";
        System.out.println("Исходная строка : " + stringToReplace);
        System.out.println("Измененная строка : " + replaceString(stringToReplace, substringFrom, substringTo));
        System.out.println();

        String strWhereToFind = "вода, вода кругом вода, вода, вода, шумит вода";
        String strWhatToFind = "вода";
        System.out.println("Количество вхождении подстроки \"" + strWhatToFind + "\" в строке \"" + strWhereToFind + "\" равно : " + calculateNumberOfOccurrences(strWhereToFind, strWhatToFind));
        System.out.println();

        String stringToCheckIP = "192.168.100.21";
        isIPAddress(stringToCheckIP);

    }
}
