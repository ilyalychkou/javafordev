package com.javafordev.lesson6.task6.objects.travel.vouchers;

import com.javafordev.lesson6.task6.objects.travel.options.Nutrition;
import com.javafordev.lesson6.task6.objects.travel.options.Transport;
import com.javafordev.lesson6.task6.utils.UserRequest;

import java.util.List;

public class CruiseTravelVoucher extends TravelVoucher {

    private List<String> countriesOfStay;

    public CruiseTravelVoucher(double price, int duration, Transport transport, Nutrition nutrition, List<String> countriesOfStay) {
        super(price, duration, transport, nutrition);
        this.countriesOfStay = countriesOfStay;
    }

    public CruiseTravelVoucher(UserRequest userRequest) {
        super(userRequest);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CruiseTravelVoucher that = (CruiseTravelVoucher) o;

        return countriesOfStay != null ? countriesOfStay.equals(that.countriesOfStay) : that.countriesOfStay == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (countriesOfStay != null ? countriesOfStay.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CruiseTravelVoucher{" +
                "countriesOfStay=" + countriesOfStay +
                '}';
    }

    public List<String> getCountriesOfStay() {
        return countriesOfStay;
    }

    public void setCountriesOfStay(List<String> countriesOfStay) {
        this.countriesOfStay = countriesOfStay;
    }
}
