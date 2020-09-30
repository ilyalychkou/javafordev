package com.javafordev.lesson6.task6.objects;

import com.javafordev.lesson6.task6.constants.MobileTariffType;

public class MobileTariff {

    private String name;
    private MobileTariffType mobileTariffType;
    private int quantityOfUsers;
    private double subscriptionFee;
    private double priceForInternationalCall;
    private double priceForInternationalMessage;
    private int internetTrafficVolume;

    public MobileTariff(String name, int quantityOfUsers, double subscriptionFee, double priceForInternationalCall, double priceForInternationalMessage, int internetTrafficVolume) {
        this.name = name;
        this.quantityOfUsers = quantityOfUsers;
        this.subscriptionFee = subscriptionFee;
        this.priceForInternationalCall = priceForInternationalCall;
        this.priceForInternationalMessage = priceForInternationalMessage;
        this.internetTrafficVolume = internetTrafficVolume;
    }

    public double getSubscriptionFee() {
        return subscriptionFee;
    }

    public void setSubscriptionFee(double subscriptionFee) {
        this.subscriptionFee = subscriptionFee;
    }

    public MobileTariffType getMobileTariffType() {
        return mobileTariffType;
    }

    public void setMobileTariffType(MobileTariffType mobileTariffType) {
        this.mobileTariffType = mobileTariffType;
    }

    public int getQuantityOfUsers() {
        return quantityOfUsers;
    }

    public void setQuantityOfUsers(int quantityOfUsers) {
        this.quantityOfUsers = quantityOfUsers;
    }

    public int getInternetTrafficVolume() {
        return internetTrafficVolume;
    }

    public void setInternetTrafficVolume(int internetTrafficVolume) {
        this.internetTrafficVolume = internetTrafficVolume;
    }
}
