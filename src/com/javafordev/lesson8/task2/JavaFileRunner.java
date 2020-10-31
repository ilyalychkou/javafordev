package com.javafordev.lesson8.task2;

import java.io.*;
import java.util.Scanner;

/**
 * Задание 2: Прочитать текст Java-программы и удалить из него все «лишние» пробелы
 * и табуляции, оставив только необходимые для разделения операторов.
 * При выполнении следующих задания для вывода результатов создавать  файл средствами класса File. Новый файл должен заменить входной но с другим именем.
 */

public class JavaFileRunner {
    public static void main(String[] args) throws IOException {

        File source = new File(String.join(File.separator, "src", "com", "javafordev", "lesson8", "task2", "Source.java"));
        File result = new File(String.join(File.separator, "src", "com", "javafordev", "lesson8", "task2", "Result.java"));

        try (Scanner scanner = new Scanner(source); BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(result))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine()
                        .replaceAll("(\\t|\\s){2,}", "\t")
                        .replaceAll("\\r{2,}", "");
                if (!line.isEmpty()) {
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                }
            }
            source.delete();
            result.renameTo(source);
        }


    }
}

