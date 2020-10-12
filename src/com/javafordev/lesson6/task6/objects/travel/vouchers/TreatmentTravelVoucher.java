package com.javafordev.lesson6.task6.objects.travel.vouchers;

import com.javafordev.lesson6.task6.objects.travel.options.Nutrition;
import com.javafordev.lesson6.task6.objects.travel.options.Transport;
import com.javafordev.lesson6.task6.objects.travel.options.Treatment;
import com.javafordev.lesson6.task6.utils.UserRequest;

public class TreatmentTravelVoucher extends TravelVoucher {

    private Treatment treatment;

    public TreatmentTravelVoucher(double price, int duration, Transport transport, Nutrition nutrition, Treatment treatment) {
        super(price, duration, transport, nutrition);
        this.treatment = treatment;
    }

    public TreatmentTravelVoucher(UserRequest userRequest) {
        super(userRequest);
    }
}
