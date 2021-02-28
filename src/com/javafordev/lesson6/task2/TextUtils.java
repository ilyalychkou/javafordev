package com.javafordev.lesson6.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TextUtils {

    public static String readTextFromFile(String localPathToFile) throws FileNotFoundException {
        Path filePath = Paths.get(System.getProperty("user.dir"), localPathToFile);
        File file = new File(String.valueOf(filePath));
        StringBuffer text = new StringBuffer();
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            text.append(scanner.nextLine());
        }
        scanner.close();
        return new String(text);
    }

    public static ArrayList<String> tokenizeText(String text) {

        ArrayList<String> tokens = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(text, " .,:+$%&^*@!?{}[]()");
        while (tokenizer.hasMoreElements()) {
            tokens.add(tokenizer.nextToken());
        }
        return tokens;
    }

    public static HashMap<String, Integer> createFrequencyDictionary(String text) {
        HashMap<String, Integer> frequencyDictionary = new HashMap<>();
        ArrayList<String> tokens = TextUtils.tokenizeText(text);
        for (String token : tokens) {
            if (token.length() >= 2) {
                frequencyDictionary.compute(token, (key, value) -> (value == null) ? 1 : value + 1);
            }
        }
            return frequencyDictionary;
    }
}
