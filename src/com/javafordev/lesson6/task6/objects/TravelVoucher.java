package com.javafordev.lesson6.task6.objects;

import com.javafordev.lesson6.task6.constants.NutritionType;
import com.javafordev.lesson6.task6.constants.TransportType;
import com.javafordev.lesson6.task6.constants.TravelType;

public class TravelVoucher {

    private int duration;
    private double price;
    private TravelType travelType;
    private TransportType transportType;
    private NutritionType nutritionType;

    public TravelVoucher(int duration, double price, TravelType travelType, TransportType transportType, NutritionType nutritionType) {
        this.duration = duration;
        this.price = price;
        this.travelType = travelType;
        this.transportType = transportType;
        this.nutritionType = nutritionType;
    }

    @Override
    public String toString() {
        return "TravelVoucher{" +
                "duration=" + duration +
                ", price=" + price +
                ", travelType=" + travelType +
                ", transportType=" + transportType +
                ", nutritionType=" + nutritionType +
                '}';
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public TravelType getTravelType() {
        return travelType;
    }

    public void setTravelType(TravelType travelType) {
        this.travelType = travelType;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    public NutritionType getNutritionType() {
        return nutritionType;
    }

    public void setNutritionType(NutritionType nutritionType) {
        this.nutritionType = nutritionType;
    }

}
