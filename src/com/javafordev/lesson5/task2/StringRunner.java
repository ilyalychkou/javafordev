package com.javafordev.lesson5.task2;

/**
 * Тестовые значения:
 * 1. char symbol - регистр - верхнии/нижнии/разные, слова - палиндром/не палиндром
 * 2. String newElement - пустое, не пустое, null
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

        StringUtils.isPalindrome(stringService.getStrings()[0]);
        StringUtils.isPalindromeViaReverse(stringService.getStrings()[0]);
        StringUtils.isPalindrome(stringService.findByMaxLength());
        StringUtils.isPalindromeViaReverse(stringService.findByMaxLength());
        System.out.println();

        String stringToReplace = "мяу бяка гав-гав гуд игнор бяка+/# финиш...бяки-бякаяка";
        String substringFrom = "бяка";
        String substringTo = "ягода";
        System.out.println("Исходная строка : " + stringToReplace);
        System.out.println("Измененная строка : " + StringUtils.replaceString(stringToReplace, substringFrom, substringTo));
        System.out.println();

        String strWhereToFind = "вода, вода кругом вода, вода, вода, шумит вода";
        String strWhatToFind = "вода";
        System.out.println("Количество вхождении подстроки \"" + strWhatToFind + "\" в строке \"" + strWhereToFind + "\" равно : " + StringUtils.calculateNumberOfOccurrences(strWhereToFind, strWhatToFind));
        System.out.println();

        String validStringToCheckIP = "221.0.221.0";
        String invalidStringToCheckIP = "256.168.100.21";
        StringUtils.isIPAddress(validStringToCheckIP);
        StringUtils.isIPAddress(invalidStringToCheckIP);

    }
}
