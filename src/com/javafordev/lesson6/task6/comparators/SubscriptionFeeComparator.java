package com.javafordev.lesson6.task6.comparators;

import com.javafordev.lesson6.task6.objects.mobile.MobileTariff;

import java.util.Comparator;

public class SubscriptionFeeComparator implements Comparator<MobileTariff> {

    @Override
    public int compare(MobileTariff o1, MobileTariff o2) {
        int returnValue = 0;
        if (o1.getSubscriptionFee() < o2.getSubscriptionFee()) {
            returnValue = -1;
        } else if (o1.getSubscriptionFee() > o2.getSubscriptionFee()) {
            returnValue = 1;
        }
        return returnValue;
    }
}
