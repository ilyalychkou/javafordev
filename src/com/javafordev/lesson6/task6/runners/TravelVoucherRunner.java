package com.javafordev.lesson6.task6.runners;

import com.javafordev.lesson6.task6.constants.NutritionType;
import com.javafordev.lesson6.task6.constants.TransportType;
import com.javafordev.lesson6.task6.constants.TravelType;
import com.javafordev.lesson6.task6.constants.UserConstants;
import com.javafordev.lesson6.task6.objects.TravelVoucher;
import com.javafordev.lesson6.task6.services.TravelVoucherService;
import com.javafordev.lesson6.task6.utils.TravelVoucherCommandLineUtils;

import java.util.ArrayList;

public class TravelVoucherRunner {

    public static void main(String[] args) {

        TravelVoucherCommandLineUtils.inputParameterForTravelVoucherService();

        int durationToFilter = UserConstants.getTravelVoucherDuration();
        double priceToFilter = UserConstants.getTravelVoucherPrice();
        TransportType transportToFilter = UserConstants.getTravelVoucherTransportType();

        ArrayList<TravelVoucher> travelVouchers = new ArrayList<>();
        travelVouchers.add(new TravelVoucher(7, 34.5, TravelType.EXCURSION, TransportType.SHIP, NutritionType.BREAKFAST_AND_SUPPER));
        travelVouchers.add(new TravelVoucher(10, 155.0, TravelType.RECREATION, TransportType.AIRPLANE, NutritionType.BREAKFAST));
        travelVouchers.add(new TravelVoucher(21, 2133.25, TravelType.TREATMENT, TransportType.TRAIN, NutritionType.ALL_INCLUSIVE));
        travelVouchers.add(new TravelVoucher(3, 578.9, TravelType.SHOPPING, TransportType.BUS, NutritionType.BREAKFAST));
        travelVouchers.add(new TravelVoucher(30, 13000.0, TravelType.CRUISE, TransportType.SHIP, NutritionType.ALL_INCLUSIVE));

        TravelVoucherService travelVoucherService = new TravelVoucherService(travelVouchers);

        ArrayList<TravelVoucher> filteredByDuration = travelVoucherService.findAllByDuration(durationToFilter);
        System.out.println("Список путевок длительностью >= заданнои пользователем : " + filteredByDuration);
        System.out.println();

        ArrayList<TravelVoucher> filteredByPrice = travelVoucherService.findAllByPrice(priceToFilter);
        System.out.println("Список путевок стоимостью <= заданнои пользователем : " + filteredByPrice);
        System.out.println();

        ArrayList<TravelVoucher> filteredByTransport = travelVoucherService.findAllByTransport(transportToFilter);
        System.out.println("Список путевок c типом транспорта, заданным пользователем : " + filteredByTransport);
        System.out.println();

        TravelVoucherService travelVoucherServiceFilteredByTransport = new TravelVoucherService(filteredByTransport);

        ArrayList<TravelVoucher> filteredByDurationAndTransport = travelVoucherServiceFilteredByTransport.findAllByDuration(durationToFilter);
        System.out.println("Список путевок c длительноситью  и типом транспорта, заданным пользователем : " + filteredByDurationAndTransport);
        System.out.println();

        ArrayList<TravelVoucher> sortedByDuration = travelVoucherService.sortByDuration();
        System.out.println("Список путевок отсортированныи по длительности : " + sortedByDuration);

        ArrayList<TravelVoucher> sortedByPrice = travelVoucherService.sortByPrice();
        System.out.println("Список путевок отсортированныи по стоимости : " + sortedByPrice);

    }

}
