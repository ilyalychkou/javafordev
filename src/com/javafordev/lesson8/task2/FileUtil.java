package com.javafordev.lesson8.task2;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileUtil {

    public static final String BASE_PATH_TO_FILE = String.join(File.separator, "src", "com", "javafordev", "lesson8", "task2");

    public static List<String> readLinesFromFile(Path path) {
        List<String> strings = new ArrayList<>();
        try {
            strings = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }

    public static List<String> replaceOddSpacesAndTabs(List<String > strings) {
        return strings.stream()
                .map(string -> string.replaceAll("\\s{2,}\\(", "("))
                .map(string -> string.replaceAll("\\s{2,}new", " new"))
                .map(string -> string.replaceAll("new\\s{2,}", "new "))
                .map(string -> string.replaceAll("\\t{2,}", "\t"))
                .map(string -> string.replaceAll("\\r{2,}", "")).collect(Collectors.toList());
    }

    public static void writeListToFile(Path result, List<String> strings) throws IOException {
        Files.write(result, strings, Charset.defaultCharset());
    }
}
