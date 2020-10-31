package com.javafordev.lesson8.task4;

import java.lang.reflect.InvocationTargetException;

public class TextRunner {

    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, InvocationTargetException, IllegalAccessException {

        TextContainer textContainer = new TextContainer("Java is the best programming language!");
        Saver.executeSaveMethod(textContainer);

    }
}
