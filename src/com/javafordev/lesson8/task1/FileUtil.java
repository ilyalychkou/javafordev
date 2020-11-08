package com.javafordev.lesson8.task1;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileUtil {

    public static final String BASE_PATH_TO_FILE = String.join(File.separator, "src", "com", "javafordev", "lesson8", "task1");

    public static Map<LocalDate, List<Person>> readDatesAndNamesFromFile(Path path, String regexp) {
        Pattern pattern = Pattern.compile(regexp);
        List<String> strings = fillListOfStrings(path);

        List<Person> persons = new ArrayList<>();
        for (String string : strings) {
            Matcher matcher = pattern.matcher(string);
            while (matcher.find()) {
                persons.add(new Person(FileUtil.generateLocalDateFromString(matcher.group(1), matcher.group(2), matcher.group(3)), matcher.group(4)));
            }
        }

        Map<LocalDate, List<Person>> personsByDates = new HashMap();
        for (Person person : persons) {
            personsByDates.computeIfAbsent(person.getLocalDate(), key -> new ArrayList<>()).add(person);
        }
        return personsByDates;
    }


    public static void putListsOfNamesIntoFoldersByDate(Map<LocalDate, List<Person>> personsByDates) throws IOException {
        for (Map.Entry<LocalDate, List<Person>> entry : personsByDates.entrySet()) {
            new File(String.join(File.separator, BASE_PATH_TO_FILE, entry.getKey().toString())).mkdir();
            Path path = Path.of(String.join(File.separator, FileUtil.BASE_PATH_TO_FILE, entry.getKey().toString(), "names.txt"));
            FileUtil.writeListToFile(path, entry.getValue());
        }
    }


    public static LocalDate generateLocalDateFromString(String group1, String group2, String group3) {
        return LocalDate.of(Integer.parseInt(group1), Integer.parseInt(group2), Integer.parseInt(group3));
    }

    public static List<String> fillListOfStrings(Path path) {
        List<String> strings = new ArrayList<>();
        try {
            strings = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }

    public static void writeListToFile(Path path, List<Person> persons) throws IOException {
        List<String> names = new ArrayList<>();
        for (Person person : persons) {
            names.add(person.getName());
        }
        Files.write(path, names, Charset.defaultCharset());
    }
}
