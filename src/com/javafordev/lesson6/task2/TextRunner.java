package com.javafordev.lesson6.task2;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class TextRunner {
    public static void main(String[] args) throws FileNotFoundException {

        String localPathToFileWithText = "src/com/javafordev/lesson6/task2/TestText.txt";
        String textToCreateFrequencyDictionary = TextUtils.readTextFromFile(localPathToFileWithText);

        HashMap<String, Integer> hashMap = TextUtils.createFrequencyDictionary(textToCreateFrequencyDictionary);
        TextService textService = new TextService(hashMap);

        System.out.println("Исходныи текст : " + textToCreateFrequencyDictionary);
        System.out.println("Вывод на печать исходного частотного словаря...");
        System.out.println();
        textService.printDictionary();
        System.out.println();

        textService.setFrequencyDictionary(textService.sortDictionaryByCountOfOccurrences());
        System.out.println("Вывод на печать отсортированного по количеству вхождении слов (по возрастанию) частотного словаря...");
        System.out.println();
        textService.printDictionary();
    }
}
