package com.javafordev.lesson6.task6.objects.travel.vouchers;

import com.javafordev.lesson6.task6.objects.travel.options.Excursion;
import com.javafordev.lesson6.task6.objects.travel.options.Nutrition;
import com.javafordev.lesson6.task6.objects.travel.options.Transport;
import com.javafordev.lesson6.task6.utils.UserRequest;

public class ExcursionTravelVoucher extends TravelVoucher {

    private Excursion excursion;

    public ExcursionTravelVoucher(double price, int duration, Transport transport, Nutrition nutrition, Excursion excursion) {
        super(price, duration, transport, nutrition);
        this.excursion = excursion;
    }

    public ExcursionTravelVoucher(UserRequest userRequest) {
        super(userRequest);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ExcursionTravelVoucher that = (ExcursionTravelVoucher) o;

        return excursion == that.excursion;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (excursion != null ? excursion.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ExcursionTravelVoucher{" +
                "excursion=" + excursion +
                '}';
    }

    public Excursion getExcursion() {
        return excursion;
    }

    public void setExcursion(Excursion excursion) {
        this.excursion = excursion;
    }
}
