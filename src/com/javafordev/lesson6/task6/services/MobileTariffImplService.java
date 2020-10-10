package com.javafordev.lesson6.task6.services;

import com.javafordev.lesson6.task6.comparators.SubscriptionFeeComparator;
import com.javafordev.lesson6.task6.constants.MobileTariffType;
import com.javafordev.lesson6.task6.objects.MobileTariff;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MobileTariffImplService implements IMobileService {

    private List<MobileTariff> mobileTariffs;

    public MobileTariffImplService(List<MobileTariff> mobileTariffs) {
        this.mobileTariffs = mobileTariffs;
    }

    public List<MobileTariff> getMobileTariffs() {
        return mobileTariffs;
    }

    public void setMobileTariffs(List<MobileTariff> mobileTariffs) {
        this.mobileTariffs = mobileTariffs;
    }

    @Override
    public List<MobileTariff> findAllByType(MobileTariffType mobileTariffType) {
        List<MobileTariff> filteredByMobileTariffType = new ArrayList<>();
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
    public List<MobileTariff> findAllBySubscriptionFee(double subscriptionFee) {
        List<MobileTariff> filteredBySubscriptionFee = new ArrayList<>();
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
    public List<MobileTariff> findAllByQuantityOfUsers(int quantityOfUsers) {
        List<MobileTariff> filteredByQuantityOfUsers = new ArrayList<>();
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
    public List<MobileTariff> findInternetTrafficVolume(int internetTrafficVolume) {
        List<MobileTariff> filteredByInternetTrafficVolume = new ArrayList<>();
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
    public List<MobileTariff> sortBySubscriptionFee() {
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
