package com.javafordev.lesson6.task6.utils;

import com.javafordev.lesson6.task6.objects.travel.options.Excursion;
import com.javafordev.lesson6.task6.objects.travel.options.Nutrition;
import com.javafordev.lesson6.task6.objects.travel.options.Transport;
import com.javafordev.lesson6.task6.objects.travel.options.Treatment;

public class UserRequest {

    private String travelType;
    private double price;
    private int duration;
    private Transport transport;
    private Nutrition nutrition;

    private Excursion excursion;
    private Treatment treatment;
    private String countryOfStay;
    private String shop;
    private int hotelLevel;

    public UserRequest(String travelType, double price, int duration, Transport transport, Nutrition nutrition) {
        this.travelType = travelType;
        this.price = price;
        this.duration = duration;
        this.transport = transport;
        this.nutrition = nutrition;
    }

    @Override
    public String toString() {
        return "UserRequest{" +
                "travelType='" + travelType + '\'' +
                ", price=" + price +
                ", duration=" + duration +
                ", transport=" + transport +
                ", nutrition=" + nutrition +
                ", excursion=" + excursion +
                ", treatment=" + treatment +
                ", countryOfStay='" + countryOfStay + '\'' +
                ", shop='" + shop + '\'' +
                ", hotelLevel=" + hotelLevel +
                '}';
    }

    public String getTravelType() {
        return travelType;
    }

    public void setTravelType(String travelType) {
        this.travelType = travelType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Nutrition getNutrition() {
        return nutrition;
    }

    public void setNutrition(Nutrition nutrition) {
        this.nutrition = nutrition;
    }

    public Excursion getExcursion() {
        return excursion;
    }

    public void setExcursion(Excursion excursion) {
        this.excursion = excursion;
    }

    public Treatment getTreatment() {
        return treatment;
    }

    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }

    public String getCountryOfStay() {
        return countryOfStay;
    }

    public void setCountryOfStay(String countryOfStay) {
        this.countryOfStay = countryOfStay;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public int getHotelLevel() {
        return hotelLevel;
    }

    public void setHotelLevel(int hotelLevel) {
        this.hotelLevel = hotelLevel;
    }
}
