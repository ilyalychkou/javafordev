package com.javafordev.lesson6.task2;

import java.util.ArrayList;
import java.util.HashMap;

public class TextRunner {
    public static void main(String[] args) {
        String textToCreateFrequencyDictionary = "В языках программирования управляющие операторы используются для " +
                "реализации переходов и ветвлений в потоке выполнения команд программы в соответствии " +
                "с ее состоянием. Управляющие операторы программы Java можно разделить на следующие " +
                "категории: операторы выбора, операторы цикла и операторы перехода. Операторы выбора " +
                " позволяют программе выбирать различные ветви выполнения команд в соответствии " +
                " с результатом выражения или состоянием переменной. Операторы цикла позволяют программе " +
                " повторять выполнение одного или нескольких операторов (т.е. они образуют циклы). Операторы " +
                "перехода обеспечивают возможность нелинейного выполнения программы. В этой главе мы " +
                " рассмотрим все управляющие операторы Java.";
        String wordOne = "операторы";
        String wordTwo = "управляющие";
        String wordThree = "выбора";
        String wordFour = "Java";
        String wordFive = "ветви";
        String wordSix = "перехода";
        String wordSeven = "состоянием";
        String wordEight = "или";
        String wordNine = "соответствии";
        String wordTen = "позволяют";

        ArrayList<String> words = new ArrayList<>();
        words.add(wordOne);
        words.add(wordTwo);
        words.add(wordThree);
        words.add(wordFour);
        words.add(wordFive);
        words.add(wordSix);
        words.add(wordSeven);
        words.add(wordEight);
        words.add(wordNine);
        words.add(wordTen);

        HashMap<String, Integer> hashMap = TextUtils.createFrequencyDictionary(textToCreateFrequencyDictionary, words);
        TextService textService = new TextService(hashMap);
        System.out.println("Исходныи текст : " + textToCreateFrequencyDictionary);
        System.out.println("Список слов, для которых составлен частотных словарь (его можно легко дополнить) : " + words);
        System.out.println();

        System.out.println("Вывод на печать исходного частотного словаря...");
        textService.printDictionary();
        System.out.println();

        textService.setFrequencyDictionary(textService.sortDictionaryByCountOfOccurrences());
        System.out.println("Вывод на печать отсортированного по количеству вхождении слов (по возрастанию) частотного словаря...");
        textService.printDictionary();

    }
}
