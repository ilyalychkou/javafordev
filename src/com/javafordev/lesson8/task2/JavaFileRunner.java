package com.javafordev.lesson8.task2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

/**
 * Задание 2: Прочитать текст Java-программы и удалить из него все «лишние» пробелы
 * и табуляции, оставив только необходимые для разделения операторов.
 * При выполнении следующих задания для вывода результатов создавать  файл средствами класса File. Новый файл должен заменить входной но с другим именем.
 */

public class JavaFileRunner {

    public static void main(String[] args) throws IOException {

        Path source = Path.of(String.join(File.separator, com.javafordev.lesson8.task2.FileUtil.BASE_PATH_TO_FILE, "Source.java"));
        Path result = Path.of(String.join(File.separator, com.javafordev.lesson8.task2.FileUtil.BASE_PATH_TO_FILE, "Result.java"));

        List<String> strings = FileUtil.readLinesFromFile(source);
        List<String> list = FileUtil.replaceOddSpacesAndTabs(strings);
        FileUtil.writeListToFile(result, list);

        source.toFile().delete();
        result.toFile().renameTo(source.toFile());
    }
}

