package com.javafordev.lesson8.task1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileUtil {

    public static final String BASE_PATH_TO_FILE = String.join(File.separator, "src", "com", "javafordev", "lesson8", "task1");

    public static TextReader readDatesAndNamesFromFile(Path path, String regexp) {
        List<String> dates = new ArrayList<>();
        List<String> names = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        Pattern pattern = Pattern.compile(regexp);

        try {
            strings = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String string : strings) {
            Matcher matcher = pattern.matcher(string);
            while (matcher.find()) {
                dates.add(matcher.group(1));
                names.add(matcher.group(2));
            }
        }
        return new TextReader(dates, names);
    }

    public static void createFoldersWithDateAsName(TextReader textReader) {
        Set<String> distinctDates = new HashSet<>(textReader.getDates());
        for (String distinctDate : distinctDates) {
            new File(String.join(File.separator, BASE_PATH_TO_FILE, distinctDate)).mkdir();
        }
    }

    public static void writeNamesToFolderWithDate(TextReader textReader) throws IOException {
        Set<String> distinctDates = new HashSet<>(textReader.getDates());
        for (int i = 0; i < textReader.getDates().size(); i++) {
            if (distinctDates.contains(textReader.getDates().get(i))) {
                File file = new File(String.join(File.separator, FileUtil.BASE_PATH_TO_FILE, textReader.getDates().get(i), "names.txt"));
                try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file, true))) {
                    fileWriter.append(textReader.getNames().get(i));
                    fileWriter.newLine();
                }
            }
        }

    }
}
