package com.javafordev.lesson8.task3;

import java.io.*;
import java.nio.file.Path;

/**
 * Задание 3:
 * Нужно создать простейший класс с полями и методами. Провести с ним процессы сериализации и десериализации.
 */

public class PersonSerializationRunner {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Path path = Path.of("src", "com", "javafordev", "lesson8", "task3", "person.txt");
        writeObject(path);
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()))) {
            Object object = objectInputStream.readObject();

            System.out.println(object);
        }
    }


    public static void writeObject(Path path) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            Person person = new Person("Stanislav", 22);
            objectOutputStream.writeObject(person);
        }
    }


    }

