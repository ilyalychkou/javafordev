package com.javafordev.lesson6.task6.objects;

import com.javafordev.lesson6.task6.constants.NutritionType;
import com.javafordev.lesson6.task6.constants.TransportType;
import com.javafordev.lesson6.task6.constants.TravelType;

public class TravelVoucher {

    private int duration;
    private TravelType travelType;
    private TransportType transportType;
    private NutritionType nutritionType;

    public TravelVoucher(int duration, TravelType traverType, TransportType transportType, NutritionType nutritionType) {
        this.duration = duration;
        this.travelType = traverType;
        this.transportType = transportType;
        this.nutritionType = nutritionType;
    }


    @Override
    public String toString() {
        return "TravelVoucher{" +
                "duration=" + duration +
                ", travelType=" + travelType +
                ", transportType=" + transportType +
                ", nutritionType=" + nutritionType +
                '}';
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setTravelType(TravelType travelType) {
        this.travelType = travelType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    public void setNutritionType(NutritionType nutritionType) {
        this.nutritionType = nutritionType;
    }

    public int getDuration() {
        return duration;
    }

    public TravelType getTravelType() {
        return travelType;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public NutritionType getNutritionType() {
        return nutritionType;
    }
}
