package com.javafordev.lesson6.task6.services;

import com.javafordev.lesson6.task6.comparators.SubscriptionFeeComparator;
import com.javafordev.lesson6.task6.constants.MobileTariffType;
import com.javafordev.lesson6.task6.objects.MobileTariff;

import java.util.ArrayList;
import java.util.Iterator;

public class MobileTariffService implements IMobileTariffServiceAction {

    private ArrayList<MobileTariff> mobileTariffs;

    public MobileTariffService(ArrayList<MobileTariff> mobileTariffs) {
        this.mobileTariffs = mobileTariffs;
    }

    public ArrayList<MobileTariff> getMobileTariffs() {
        return mobileTariffs;
    }

    public void setMobileTariffs(ArrayList<MobileTariff> mobileTariffs) {
        this.mobileTariffs = mobileTariffs;
    }

    @Override
    public ArrayList<MobileTariff> findAllByType(MobileTariffType mobileTariffType) {
        ArrayList<MobileTariff> filteredByMobileTariffType = new ArrayList<>();
        Iterator<MobileTariff> iterator = this.getMobileTariffs().iterator();
        while (iterator.hasNext()) {
            MobileTariff currentElement = iterator.next();
            if (currentElement.getMobileTariffType().equals(mobileTariffType)) {
                filteredByMobileTariffType.add(currentElement);
            }
        }
        return filteredByMobileTariffType;
    }

    @Override
    public ArrayList<MobileTariff> findAllBySubscriptionFee(double subscriptionFee) {
        ArrayList<MobileTariff> filteredBySubscriptionFee = new ArrayList<>();
        Iterator<MobileTariff> iterator = this.getMobileTariffs().iterator();
        while (iterator.hasNext()) {
            MobileTariff currentElement = iterator.next();
            if (currentElement.getSubscriptionFee() < subscriptionFee) {
                filteredBySubscriptionFee.add(currentElement);
            }
        }
        return filteredBySubscriptionFee;
    }

    @Override
    public ArrayList<MobileTariff> findAllByQuantityOfUsers(int quantityOfUsers) {
        ArrayList<MobileTariff> filteredByQuantityOfUsers = new ArrayList<>();
        Iterator<MobileTariff> iterator = this.getMobileTariffs().iterator();
        while (iterator.hasNext()) {
            MobileTariff currentElement = iterator.next();
            if (currentElement.getQuantityOfUsers() > quantityOfUsers) {
                filteredByQuantityOfUsers.add(currentElement);
            }
        }
        return filteredByQuantityOfUsers;
    }

    @Override
    public ArrayList<MobileTariff> findInternetTrafficVolume(int internetTrafficVolume) {
        ArrayList<MobileTariff> filteredByInternetTrafficVolume = new ArrayList<>();
        Iterator<MobileTariff> iterator = this.getMobileTariffs().iterator();
        while (iterator.hasNext()) {
            MobileTariff currentElement = iterator.next();
            if (currentElement.getInternetTrafficVolume() >= internetTrafficVolume) {
                filteredByInternetTrafficVolume.add(currentElement);
            }
        }
        return filteredByInternetTrafficVolume;
    }

    @Override
    public ArrayList<MobileTariff> sortBySubscriptionFee() {
        this.getMobileTariffs().sort(new SubscriptionFeeComparator());
        return this.getMobileTariffs();
    }

    public int calculateQuantityOfUsers() {
        int quantityOfUsers = 0;
        Iterator<MobileTariff> iterator = this.getMobileTariffs().iterator();
        while (iterator.hasNext()) {
            quantityOfUsers += iterator.next().getQuantityOfUsers();
        }
        return quantityOfUsers;
    }
}
