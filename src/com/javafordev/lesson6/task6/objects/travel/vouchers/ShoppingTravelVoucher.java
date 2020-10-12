package com.javafordev.lesson6.task6.objects.travel.vouchers;

import com.javafordev.lesson6.task6.objects.travel.options.Nutrition;
import com.javafordev.lesson6.task6.objects.travel.options.Transport;
import com.javafordev.lesson6.task6.utils.UserRequest;

import java.util.List;

public class ShoppingTravelVoucher extends TravelVoucher {

    private List<String> shops;

    public ShoppingTravelVoucher(double price, int duration, Transport transport, Nutrition nutrition, List<String> shops) {
        super(price, duration, transport, nutrition);
        this.shops = shops;
    }

    public ShoppingTravelVoucher(UserRequest userRequest) {
        super(userRequest);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ShoppingTravelVoucher that = (ShoppingTravelVoucher) o;

        return shops != null ? shops.equals(that.shops) : that.shops == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (shops != null ? shops.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ShoppingTravelVoucher{" +
                "shops=" + shops +
                '}';
    }

    public List<String> getShops() {
        return shops;
    }

    public void setShops(List<String> shops) {
        this.shops = shops;
    }
}
