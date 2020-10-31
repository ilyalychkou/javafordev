package com.javafordev.lesson8.task4;

import java.lang.reflect.InvocationTargetException;

public class Saver {

    public static void executeSaveMethod(TextContainer textContainer) throws NoSuchMethodException, NoSuchFieldException, InvocationTargetException, IllegalAccessException {
        String method = textContainer.getClass().getDeclaredField("string").getAnnotation(SaveText.class).method();
        textContainer.getClass().getMethod(method).invoke(textContainer);
    }
}
