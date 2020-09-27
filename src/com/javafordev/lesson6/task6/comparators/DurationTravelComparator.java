package com.javafordev.lesson6.task6.comparators;

import com.javafordev.lesson6.task6.objects.TravelVoucher;

import java.util.Comparator;

public class DurationTravelComparator implements Comparator<TravelVoucher> {

    @Override
    public int compare(TravelVoucher o1, TravelVoucher o2) {
        int returnValue = 0;
        if (o1.getDuration() < o2.getDuration()) {
            returnValue = -1;
        } else if (o1.getDuration() > o2.getDuration()) {
            returnValue = 1;
        }
        return returnValue;

    }
}
