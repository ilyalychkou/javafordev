package com.javafordev.lesson5.task2;

import static com.javafordev.lesson5.task1.Validator.validateIndex;
import static com.javafordev.lesson5.task1.Validator.validateIndexForCurrentArray;
import static com.javafordev.lesson5.task2.Validator.validateInputParameterForArray;

/**
 * 1. Напишите метод для поиска самои длиннои строки в массиве
 */

public class StringService {

    String[] strings;

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
        for (int i = 0; i < this.strings.length; i++) {
            if (this.strings[i].length() > maxElementLength) {
                maxElementLength = this.strings[i].length();
                maxElement = this.strings[i];
            }
        }
        return maxElement;
    }

}
