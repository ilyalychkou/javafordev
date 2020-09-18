package com.javafordev.lesson5.task1;

import java.util.Arrays;

/**
 * 1. Получить текущую длину массива - int getLength();
 * 2. Добавить элемент. Длина массива должна увеличиться на 1 - int addElement(Object o);
 * 3. Получить элемент по индексу - Object getElement(int index);
 * 4. Удалить все текущие элементы (длина массива =0) - void removeAllElements();
 * 5. Вернуть массив, где находятся все текущие элементы - String[] getAllElements();
 */

public class ArrayService implements MySuperArray {
    private String[] array;

    public ArrayService(String[] array) {
        this.array = Validator.validateInputParameterForArray(array);
    }

    public ArrayService(int arrayLength) {
        Validator.validateArrayLength(arrayLength);
        this.array = new String[arrayLength];
    }

    public String[] getArray() {
        return this.array;
    }

    public void setArray(String[] array) {
        this.array = Validator.validateInputParameterForArray(array);
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
        int validatedIndex = Validator.validateIndex(index);
        Validator.validateIndexForCurrentArray(this.array, validatedIndex);
        return this.array[validatedIndex];
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
