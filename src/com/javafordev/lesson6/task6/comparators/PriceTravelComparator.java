package com.javafordev.lesson6.task6.comparators;

import com.javafordev.lesson6.task6.objects.travel.vouchers.TravelVoucher;

import java.util.Comparator;

public class PriceTravelComparator implements Comparator<TravelVoucher> {

    @Override
    public int compare(TravelVoucher o1, TravelVoucher o2) {
        int returnValue = 0;
        if (o1.getPrice() < o2.getPrice()) {
            returnValue = -1;
        } else if (o1.getPrice() > o2.getPrice()) {
            returnValue = 1;
        }
        return returnValue;
    }
}
