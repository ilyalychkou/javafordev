package com.javafordev.lesson6.task6.objects.travel.vouchers;

import com.javafordev.lesson6.task6.objects.travel.options.Nutrition;
import com.javafordev.lesson6.task6.objects.travel.options.Transport;
import com.javafordev.lesson6.task6.utils.UserRequest;

public class RecreationTravelVoucher extends TravelVoucher {

    private int hotelLevel;

    public RecreationTravelVoucher(double price, int duration, Transport transport, Nutrition nutrition, int hotelLevel) {
        super(price, duration, transport, nutrition);
        this.hotelLevel = hotelLevel;
    }

    public RecreationTravelVoucher(UserRequest userRequest) {
        super(userRequest);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        RecreationTravelVoucher that = (RecreationTravelVoucher) o;

        return hotelLevel == that.hotelLevel;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + hotelLevel;
        return result;
    }

    @Override
    public String toString() {
        return "RecreationTravelVoucher{" +
                "hotelLevel=" + hotelLevel +
                '}';
    }

    public int getHotelLevel() {
        return hotelLevel;
    }

    public void setHotelLevel(int hotelLevel) {
        this.hotelLevel = hotelLevel;
    }
}
