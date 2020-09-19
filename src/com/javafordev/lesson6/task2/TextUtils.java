package com.javafordev.lesson6.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextUtils {

    public static HashMap<String, Integer> createFrequencyDictionary(String text, ArrayList<String> words) {
        int listOfWordsSize = words.size();
        HashMap<String, Integer> frequencyDictionary = new HashMap<>();
        Pattern[] patterns = new Pattern[listOfWordsSize];
        Matcher[] matchers = new Matcher[listOfWordsSize];
        int[] countOfOccurrences = new int[listOfWordsSize];

        for (int i = 0; i < words.size(); i++) {
            countOfOccurrences[i] = 0;
            patterns[i] = Pattern.compile(words.get(i).toLowerCase());
            matchers[i] = patterns[i].matcher(text.toLowerCase());
            while (matchers[i].find()) {
                countOfOccurrences[i]++;
            }
            frequencyDictionary.put(words.get(i), countOfOccurrences[i]);
        }
        return frequencyDictionary;
    }
}
