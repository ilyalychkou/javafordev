package com.javafordev.lesson6.task6.objects.travel.vouchers;

import com.javafordev.lesson6.task6.objects.travel.options.Nutrition;
import com.javafordev.lesson6.task6.objects.travel.options.Transport;
import com.javafordev.lesson6.task6.utils.UserRequest;

public class TravelVoucher {

    private double price;
    private int duration;
    private Transport transport;
    private Nutrition nutrition;
    private UserRequest userRequest;

    public TravelVoucher(double price, int duration, Transport transport, Nutrition nutrition) {
        this.price = price;
        this.duration = duration;
        this.transport = transport;
        this.nutrition = nutrition;
    }

    public TravelVoucher(UserRequest userRequest) {
        this.userRequest = userRequest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TravelVoucher that = (TravelVoucher) o;

        if (Double.compare(that.price, price) != 0) return false;
        if (duration != that.duration) return false;
        if (transport != that.transport) return false;
        return nutrition == that.nutrition;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(price);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + duration;
        result = 31 * result + (transport != null ? transport.hashCode() : 0);
        result = 31 * result + (nutrition != null ? nutrition.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TravelVoucher{" +
                "price=" + price +
                ", duration='" + duration + '\'' +
                ", transport=" + transport +
                ", nutrition=" + nutrition +
                '}';
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
}
