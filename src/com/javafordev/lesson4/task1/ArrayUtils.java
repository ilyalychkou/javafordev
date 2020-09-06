package com.javafordev.lesson4.task1;

public class ArrayUtils {

    public static Airline[] removeNullElementsFromAirlines(Airline[] airlines) {
        int countOfNotNullElements = 0;
        for (Airline element : airlines) {
            if (element != null) {
                countOfNotNullElements++;
            }
        }

        Airline[] fitleredAirlinesWithoutNullElements = new Airline[countOfNotNullElements];
        int i = 0;
        for (Airline element : airlines) {
            if (element != null) {
                fitleredAirlinesWithoutNullElements[i] = element;
                i++;
            }
        }
        return fitleredAirlinesWithoutNullElements;
    }
}
