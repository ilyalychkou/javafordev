package com.javafordev.lesson6.task5;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TextUtils {

    public static ArrayList<String> readTextFromFile(String localPathToFile) throws FileNotFoundException {
        ArrayList<String> words = new ArrayList<>();
        Path filePath = Paths.get(System.getProperty("user.dir"), localPathToFile);
        File file = new File(String.valueOf(filePath));
        StringBuffer text = new StringBuffer();
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            words.add(scanner.nextLine());
        }
        scanner.close();
        return words;
    }


    public static List<String> fillList(String textToCreateFrequencyDictionary) {

        List<String> tokens = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(textToCreateFrequencyDictionary);
        while (tokenizer.hasMoreElements()) {
            tokens.add(tokenizer.nextToken());
        }
        return tokens;
    }
}
