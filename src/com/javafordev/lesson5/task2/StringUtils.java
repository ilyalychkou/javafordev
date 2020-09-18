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

        boolean isPalindrome = true;
        int j = 0;
        for (int k = str.length() - 1; k >= 0; k--) {
            if (!(Character.toLowerCase(str.charAt(j)) == Character.toLowerCase(str.charAt(k)))) {
                System.out.println("Заданное слово " + str + " не является палиндромом!");
                isPalindrome = false;
                break;
            }
            j++;
        }

        if (isPalindrome) {
            System.out.println("Заданное слово " + str + " является палиндромом!");
        }

        return isPalindrome;
    }

    public static boolean isPalindromeViaReverse(String str) {

        String reversStr = new StringBuffer(str).reverse().toString();
        boolean isPalindrome = false;

        if (str.equalsIgnoreCase(reversStr)) {
            isPalindrome = true;
        }
        if (isPalindrome) {
            System.out.println("Заданное слово " + str + " является палиндромом!");
        } else {
            System.out.println("Заданное слово " + str + " не является палиндромом!");
        }
        return isPalindrome;
    }

    public static String replaceString(String str, String substringFrom, String substringTo) {
        Validator.validateElement(str);
        Validator.validateElement(substringFrom);
        Validator.validateElement(substringTo);
        return str.replace(substringFrom, substringTo);
    }


    public static int calculateNumberOfOccurrences(String strWhereToFind, String strWhatToFind) {
        Validator.validateElement(strWhereToFind);
        Validator.validateElement(strWhatToFind);
        Pattern pattern = Pattern.compile(strWhatToFind);
        Matcher matcher = pattern.matcher(strWhereToFind);
        int countOfOccurrences = 0;
        while (matcher.find()) {
            countOfOccurrences++;
        }
        return countOfOccurrences;
    }

    public static boolean isIPAddress(String str) {

        Pattern pattern = Pattern.compile("^(([1]\\d\\d|[2][0-5][0-5]|2[0-4]\\d|[01]?\\d\\d?|\\d)\\.){3}([1]\\d\\d|[2][0-5][0-5]|2[0-4]\\d|[01]?\\d\\d?|\\d)$");
        Matcher matcher = pattern.matcher(str);

        boolean isIPAddress = false;
        if (matcher.matches()) {
            System.out.println("Строка \"" + str + "\" является IP адресом");
            isIPAddress = true;
        } else {
            System.out.println("Строка \"" + str + "\" не является IP адресом");
        }
        return isIPAddress;
    }
}
