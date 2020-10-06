package com.javafordev.lesson6.task2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

public class TextRunner {
    public static void main(String[] args) throws FileNotFoundException {

        String localPathToFileWithText = "src/com/javafordev/lesson6/task2/TestText.txt";
        String textToCreateFrequencyDictionary = TextUtils.readTextFromFile(localPathToFileWithText);
        ArrayList<String> words = TextUtils.fillListByWords(textToCreateFrequencyDictionary);

        HashMap<String, Integer> hashMap = TextUtils.createFrequencyDictionary(textToCreateFrequencyDictionary, TextUtils.removeDuplicates(words));
        TextService textService = new TextService(hashMap);

        System.out.println("Исходныи текст : " + textToCreateFrequencyDictionary);
        System.out.println("Список слов, для которых составлен частотных словарь : " + TextUtils.removeDuplicates(words));
        System.out.println();

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
