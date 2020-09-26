package com.javafordev.lesson6.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextUtils {

    public static String readTextFromFile(String localPathToFile) throws FileNotFoundException {
        Path filePath = Paths.get(System.getProperty("user.dir"), localPathToFile);
        File file = new File(String.valueOf(filePath));
        Scanner scanner = new Scanner(file);
        String text = scanner.nextLine();
        scanner.close();
        return text;
    }

    public static String removeRedundantSymbolsAtTheEnd(String word) {
        String editedWord;
        Pattern pattern = Pattern.compile("[.|,|:|+|$|%|&|^|*|@|!|?]");
        Matcher matcher = pattern.matcher(word);
        if (matcher.find()) {
            editedWord = word.substring(0, word.length() - 1);
        } else {
            editedWord = word;
        }
        return editedWord;
    }

    public static ArrayList<String> fillListByWords(String text) {
        String[] arrayOfWords = text.split(" ");

        for (int i = 0; i < arrayOfWords.length; i++) {
            arrayOfWords[i] = TextUtils.removeRedundantSymbolsAtTheEnd(arrayOfWords[i].toLowerCase());
        }
        return new ArrayList<>(Arrays.asList(arrayOfWords));
    }

    public static HashMap<String, Integer> createFrequencyDictionary(String text, ArrayList<String> words) {
        int listOfWordsSize = words.size();
        HashMap<String, Integer> frequencyDictionary = new HashMap<>();
        Pattern[] patterns = new Pattern[listOfWordsSize];
        Matcher[] matchers = new Matcher[listOfWordsSize];
        int[] countOfOccurrences = new int[listOfWordsSize];

        for (int i = 0; i < words.size(); i++) {
            countOfOccurrences[i] = 0;
            patterns[i] = Pattern.compile(TextValidator.validateString(words.get(i).toLowerCase()));
            matchers[i] = patterns[i].matcher(text.toLowerCase());
            while (matchers[i].find()) {
                countOfOccurrences[i]++;
            }
            frequencyDictionary.put(words.get(i), countOfOccurrences[i]);
        }
        return frequencyDictionary;
    }


    public static ArrayList<String> removeDuplicates(ArrayList<String> listOfWords) {
        ArrayList<String> listOfWordsWithoutDuplicates = new ArrayList<>();
        for (String element : listOfWords) {
            if (!listOfWordsWithoutDuplicates.contains(element)) {
                listOfWordsWithoutDuplicates.add(element);
            }
        }
        return listOfWordsWithoutDuplicates;
    }


}
