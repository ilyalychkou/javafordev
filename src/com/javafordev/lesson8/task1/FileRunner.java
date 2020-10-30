package com.javafordev.lesson8.task1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

/**
 * Задание 1: Дан файл со след строчками:
 * Дата в формате (YYYY-MM-DD) - ФИО
 * Пример: 2020-01-01 - Иванов Иван Иванович
 * 2020-02-02 -  Сидоров Сергей Петрович
 * Нужно создать для каждой даты отдельную папку и положить внутрь данной папки файл со списком людей, соответтсвущих данной дате
 */
public class FileRunner {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("src", "com", "javafordev", "lesson8", "task1", "file.txt");
        FileRunner.createFoldersWithDateAsName(path);
        Set<String> setOfDates = FileRunner.createSetOfDates(path);
        List<String> listOfDates = FileRunner.createListOfDates(path);
        List<String> listOfNames = FileRunner.createListOfNames(path);
        FileRunner.generate(setOfDates, listOfDates, listOfNames);
    }

    public static void createFoldersWithDateAsName(Path path) {
        try {
            try (Scanner scanner = new Scanner(path)) {
                while (scanner.hasNext()) {
                    scanner.nextLine().lines()
                            .map(string -> string.substring(0, 10))
                            .forEach(folderName -> new File(String.join(File.separator, "src", "com", "javafordev", "lesson8", "task1", folderName)).mkdir());
                }
            }
        } catch (IOException exception) {
            System.out.println("Не удалось создать директорию с датой в качестве имени");
            exception.printStackTrace();
        }
    }

    public static Set<String> createSetOfDates(Path path) throws IOException {
        try (Scanner scanner = new Scanner(path)) {
            Set<String> dates = new HashSet<>();
            while (scanner.hasNext()) {
                String date = scanner.nextLine().substring(0, 10);
                dates.add(date);
            }
            return dates;
        }
    }

    public static List<String> createListOfDates(Path path) throws IOException {
        try (Scanner scanner = new Scanner(path)) {
            List<String> dates = new ArrayList<>();
            while (scanner.hasNext()) {
                String date = scanner.nextLine().substring(0, 10);
                dates.add(date);
            }
            return dates;
        }
    }

    public static List<String> createListOfNames(Path path) throws IOException {
        try (Scanner scanner = new Scanner(path)) {
            List<String> names = new ArrayList<>();
            while (scanner.hasNext()) {
                String name = scanner.nextLine().substring(13);
                names.add(name);
            }
            return names;
        }
    }

    public static void generate(Set<String> setOfDates, List<String> listOfDates, List<String> listOfNames) throws IOException {
        for (int i = 0; i < listOfDates.size(); i++) {
            if (setOfDates.contains(listOfDates.get(i))) {
                File file = new File(String.join(File.separator, "src", "com", "javafordev", "lesson8", "task1", listOfDates.get(i), "names.txt"));
                try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file, true))) {
                    fileWriter.append(listOfNames.get(i));
                    fileWriter.newLine();
                }
            }
        }
    }
}
