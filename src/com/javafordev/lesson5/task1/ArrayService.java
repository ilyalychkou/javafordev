package com.javafordev.lesson5.task1;

import java.util.Arrays;

import static com.javafordev.lesson5.task1.Validator.*;

/**
 * 1. Получить текущую длину массива - int getLength();
 * 2. Добавить элемент. Длина массива должна увеличиться на 1 - int addElement(Object o);
 * 3. Получить элемент по индексу - Object getElement(int index);
 * 4. Удалить все текущие элементы (длина массива =0) - void removeAllElements();
 * 5. Вернуть массив, где находятся все текущие элементы - String[] getAllElements();
 */

public class ArrayService implements MySuperArray {
    String[] array;

    public ArrayService(String[] array) {
        this.array = validateInputParameterForArray(array);
    }

    public String[] getArray() {
        return this.array;
    }

    public void setArray(String[] array) {
        this.array = validateInputParameterForArray(array);
    }

    @Override
    public String toString() {
        return "ArrayService{" +
                "array=" + Arrays.toString(this.array) +
                '}';
    }

    @Override
    public int getLength() {
        return this.array.length;
    }

    @Override
    public int addElement(String newElement) {
        Validator.validateElement(newElement);
        String[] extendedArrayOfStrings = new String[(this.array.length) + 1];
        for (int j = 0; j < this.array.length; j++) {
            extendedArrayOfStrings[j] = this.array[j];
        }
        extendedArrayOfStrings[extendedArrayOfStrings.length - 1] = newElement;
        this.setArray(extendedArrayOfStrings);
        return extendedArrayOfStrings.length;
    }

    @Override
    public String getElement(int index) {
        int validatedIndex = validateIndex(index);
        validateIndexForCurrentArray(this.array, validatedIndex);
        String elementByIndex = "";
        for (int i = 0; i < this.array.length; i++) {
            elementByIndex = this.array[validatedIndex];
        }
        return elementByIndex;
    }

    @Override
    public void removeAllElements() {
        String[] emptyArrayOfSting = new String[0];
        this.setArray(emptyArrayOfSting);
    }

    @Override
    public String[] getAllElements() {
        return this.array;
    }
}
