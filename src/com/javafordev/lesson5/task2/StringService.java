package com.javafordev.lesson5.task2;

import static com.javafordev.lesson5.task2.Validator.validateInputParameterForArray;

/**
 * 1. Напишите метод для поиска самои длиннои строки в массиве
 */

public class StringService {

    private String[] strings;

    public StringService(String[] strings) {
        this.strings = validateInputParameterForArray(strings);
    }

    public String[] getStrings() {
        return this.strings;
    }

    public void setStrings(String[] strings) {
        this.strings = validateInputParameterForArray(strings);
    }

    public String findByMaxLength() {
        int maxElementLength = this.strings[0].length();
        String maxElement = "";
        for (String string : this.strings) {
            if (string.length() > maxElementLength) {
                maxElementLength = string.length();
                maxElement = string;
            }
        }
        return maxElement;
    }

}
