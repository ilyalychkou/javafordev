package com.javafordev.lesson5.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 2. Напишите метод, которыи проверяет является ли слова палиндромом
 * 3. Напишите метод, которыи заменяет в тексте все слова "бяка" на "ягода"
 * 4. Имеется 2 строки, напишите метод возвращающи количество вхождении однои строки в другую
 * 5. Напишите метод, которыи проверяет является ли строка IP адресом
 */


public class StringUtils {

    public static boolean isPalindrome(String str) {

        char[] charsOfStrings = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charsOfStrings[i] = str.charAt(i);
        }

        int countOfOccurances = 0;
        int j = 0;
        for (int k = charsOfStrings.length - 1; k >= 0; k--) {
            if (!(Character.toLowerCase(charsOfStrings[j]) == Character.toLowerCase(charsOfStrings[k]))) {
                countOfOccurances++;
                break;
            }
            j++;
        }
        if (countOfOccurances > 0) {
            System.out.println("Заданное слово " + str + " не является палиндромом!");
            return false;
        } else {
            System.out.println("Заданное слово " + str + " является палиндромом!");
            return true;
        }
    }

    public static String replaceString(String str, String substringFrom, String substringTo) {
        Pattern pattern = Pattern.compile(substringFrom);
        return str.replaceAll(String.valueOf(pattern), substringTo);
    }


    public static int calculateNumberOfOccurrences(String strWhereToFind, String strWhatToFind) {
        Pattern pattern = Pattern.compile(strWhatToFind);
        Matcher matcher = pattern.matcher(strWhereToFind);
        int countOfOccurrences = 0;
        while (matcher.find()) {
            countOfOccurrences++;
        }
        return countOfOccurrences;
    }

    public static boolean isIPAddress(String str) {
        Pattern pattern = Pattern.compile("^((25[0-5]|2[4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[4]\\d|[01]?\\d\\d?)$");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            System.out.println("Строка \"" + str + "\" является IP адресом");
            return true;
        } else {
            System.out.println("Строка \"" + str + "\" не является IP адресом");
            return false;
        }
    }
}
