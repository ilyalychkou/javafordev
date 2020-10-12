package com.javafordev.lesson6.task6.objects.mobile;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MobileTariff that = (MobileTariff) o;

        if (quantityOfUsers != that.quantityOfUsers) return false;
        if (Double.compare(that.subscriptionFee, subscriptionFee) != 0) return false;
        if (internetTrafficVolume != that.internetTrafficVolume) return false;
        if (mobileTariffName != null ? !mobileTariffName.equals(that.mobileTariffName) : that.mobileTariffName != null)
            return false;
        return mobileTariffType == that.mobileTariffType;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = mobileTariffName != null ? mobileTariffName.hashCode() : 0;
        result = 31 * result + (mobileTariffType != null ? mobileTariffType.hashCode() : 0);
        result = 31 * result + quantityOfUsers;
        temp = Double.doubleToLongBits(subscriptionFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + internetTrafficVolume;
        return result;
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
