package com.javafordev.lesson6.task6.objects;

public class MobileTariff {

    private String name;
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
}
