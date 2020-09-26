package com.javafordev.lesson6.task6.utils;

import com.javafordev.lesson6.task6.objects.TravelVoucher;

public class ArrayUtils {

    public static void printArray(TravelVoucher[] travelVouchers) {
        for (TravelVoucher element: travelVouchers) {
            System.out.println(element);
        }
    }

    public static TravelVoucher[] removeNullElementsFromTravelVouchers(TravelVoucher[] travelVouchers) {
        int countOfNotNullElements = 0;
        for (TravelVoucher element : travelVouchers) {
            if (element != null) {
                countOfNotNullElements++;
            }
        }

        TravelVoucher[] fitleredTravelVouchersWithoutNullElements = new TravelVoucher[countOfNotNullElements];
        int i = 0;
        for (TravelVoucher element : travelVouchers) {
            if (element != null) {
                fitleredTravelVouchersWithoutNullElements[i] = element;
                i++;
            }
        }
        return fitleredTravelVouchersWithoutNullElements;
    }
}
