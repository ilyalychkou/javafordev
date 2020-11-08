package com.javafordev.lesson8.task1;

import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 * Задание 1: Дан файл со след строчками:
 * Дата в формате (YYYY-MM-DD) - ФИО
 * Пример: 2020-01-01 - Иванов Иван Иванович
 * 2020-02-02 -  Сидоров Сергей Петрович
 * Нужно создать для каждой даты отдельную папку и положить внутрь данной папки файл со списком людей, соответтсвущих данной дате
 */
public class FileRunner {
    public static void main(String[] args) throws IOException {
        String regexp = "([1-9]?[0-9]{3})-([0|1][0-9])-([0-3][0-9])\\s-\\s([А-Яа-яЁ-ё\\s]+)";
        String fileToParse = "file.txt";
        Path path = Path.of(FileUtil.BASE_PATH_TO_FILE, fileToParse);
        Map<LocalDate, List<Person>> localDateListMap = FileUtil.readDatesAndNamesFromFile(path);
        FileUtil.putListsOfNamesIntoFoldersByDate(localDateListMap);
    }
}
