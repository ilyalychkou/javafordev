package com.javafordev.lesson8.task1;

import java.io.IOException;
import java.nio.file.Path;

/**
 * Задание 1: Дан файл со след строчками:
 * Дата в формате (YYYY-MM-DD) - ФИО
 * Пример: 2020-01-01 - Иванов Иван Иванович
 * 2020-02-02 -  Сидоров Сергей Петрович
 * Нужно создать для каждой даты отдельную папку и положить внутрь данной папки файл со списком людей, соответтсвущих данной дате
 */
public class FileRunner {
    public static void main(String[] args) throws IOException {
        String regexp = "([1-9]?[0-9]{3}-[0|1][0-9]-[0-3][0-9])\\s-\\s([А-Яа-яЁ-ё\\s]+)";
        Path path = Path.of(FileUtil.BASE_PATH_TO_FILE, "file.txt");
        TextReader textReader = FileUtil.readDatesAndNamesFromFile(path, regexp);
        FileUtil.createFoldersWithDateAsName(textReader);
        FileUtil.writeNamesToFolderWithDate(textReader);
    }
}
