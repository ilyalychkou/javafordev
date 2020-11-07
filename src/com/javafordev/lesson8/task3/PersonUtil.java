package com.javafordev.lesson8.task3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Path;

public class PersonUtil {

    public static void writeObject(Path path) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            Person person = new Person("Stanislav", 22);
            objectOutputStream.writeObject(person);
        }
    }
}
