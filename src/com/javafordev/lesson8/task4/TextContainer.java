package com.javafordev.lesson8.task4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

/**
 * Задание 4:
 * Написать класс TextContainer, который содержит в себе строку. С помощью механизма аннотаций указать
 * 1) в какой файл должен сохраниться текст 2) метод, который выполнит сохранение. Написать класс Saver,
 * который сохранит объект класса TextContainer.
 */
public class TextContainer {

    @SaveText(file = "java.txt", method = "saveTextToFile")
    private String string;

    public TextContainer(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "TextContainer{" +
                "string='" + string + '\'' +
                '}';
    }

    public void saveTextToFile() throws NoSuchFieldException, IllegalAccessException {

        String fileName = generateFileName(this);
        File file = new File(String.join(File.separator, "src", "com", "javafordev", "lesson8", "task4", fileName));
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file))) {
            fileWriter.append(this.getString());
            fileWriter.append(System.lineSeparator());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static String generateFileName(TextContainer textContainer) throws NoSuchFieldException, IllegalAccessException {

        Field field = textContainer.getClass().getDeclaredField("string");
        field.setAccessible(true);
        field.get(textContainer);

        return textContainer
                .getClass()
                .getDeclaredField("string")
                .getAnnotation(SaveText.class)
                .file();
    }
}
