package com.javafordev.lesson6.task6.runners;

import com.javafordev.lesson6.task6.utils.ArrayUtils;
import com.javafordev.lesson6.task6.constants.TransportType;
import com.javafordev.lesson6.task6.objects.TravelVoucher;
import com.javafordev.lesson6.task6.services.TravelVoucherService;

import static com.javafordev.lesson6.task6.constants.NutritionType.*;
import static com.javafordev.lesson6.task6.constants.TransportType.*;
import static com.javafordev.lesson6.task6.constants.TravelType.*;

public class TravelVoucherRunner {

    public static void main(String[] args) {

        int numberOfVoucher = 5;
        int durationToFilter = 9;
        TransportType transportToFilter = AIRPLANE;

        TravelVoucher[] travelVouchers = new TravelVoucher[numberOfVoucher];
        travelVouchers[0] = new TravelVoucher(7, EXCURSION, SHIP, BREAKFAST_AND_SUPPER);
        travelVouchers[1] = new TravelVoucher(10, RECREATION, AIRPLANE, BREAKFAST);
        travelVouchers[2] = new TravelVoucher(21, TREATMENT, TRAIN, ALL_INCLUSIVE);
        travelVouchers[3] = new TravelVoucher(3, SHOPPING, BUS, BREAKFAST);
        travelVouchers[4] = new TravelVoucher(30, CRUISE, SHIP, ALL_INCLUSIVE);

        TravelVoucherService travelVoucherService = new TravelVoucherService(travelVouchers);

        TravelVoucher[] filteredByDuration = travelVoucherService.findByDuration(durationToFilter);
        ArrayUtils.printArray(filteredByDuration);
        System.out.println();

        TravelVoucher[] filteredByTransport = travelVoucherService.findByTransport(transportToFilter);
        ArrayUtils.printArray(filteredByTransport);
        System.out.println();

        TravelVoucherService travelVoucherServiceFilteredByTransport = new TravelVoucherService(filteredByTransport);

        TravelVoucher[] filteredByDurationAndTransport = travelVoucherServiceFilteredByTransport.findByDuration(durationToFilter);
        ArrayUtils.printArray(filteredByDurationAndTransport);

    }

}
