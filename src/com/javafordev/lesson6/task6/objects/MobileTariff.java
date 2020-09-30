package com.javafordev.lesson6.task6.objects;

import com.javafordev.lesson6.task6.constants.MobileTariffType;

public class MobileTariff {

    private String mobileTariffName;
    private MobileTariffType mobileTariffType;
    private int quantityOfUsers;
    private double subscriptionFee;
    private int internetTrafficVolume;

    public MobileTariff(String name, MobileTariffType mobileTariffType, int quantityOfUsers, double subscriptionFee, int internetTrafficVolume) {
        this.mobileTariffName = name;
        this.mobileTariffType = mobileTariffType;
        this.quantityOfUsers = quantityOfUsers;
        this.subscriptionFee = subscriptionFee;
        this.internetTrafficVolume = internetTrafficVolume;
    }

    public String getMobileTariffName() {
        return mobileTariffName;
    }

    public void setMobileTariffName(String mobileTariffName) {
        this.mobileTariffName = mobileTariffName;
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

    @Override
    public String toString() {
        return "MobileTariff{" +
                "mobileTariffName='" + mobileTariffName + '\'' +
                ", mobileTariffType=" + mobileTariffType +
                ", quantityOfUsers=" + quantityOfUsers +
                ", subscriptionFee=" + subscriptionFee +
                ", internetTrafficVolume=" + internetTrafficVolume +
                '}';
    }
}
