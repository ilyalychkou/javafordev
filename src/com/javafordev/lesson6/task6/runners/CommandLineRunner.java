package com.javafordev.lesson6.task6.runners;

import com.javafordev.lesson6.task6.constants.TransportType;
import com.javafordev.lesson6.task6.constants.UserConstants;
import com.javafordev.lesson6.task6.objects.TravelVoucher;
import com.javafordev.lesson6.task6.services.TravelVoucherService;
import com.javafordev.lesson6.task6.utils.CommandLineUtils;

import java.util.ArrayList;

import static com.javafordev.lesson6.task6.constants.NutritionType.*;
import static com.javafordev.lesson6.task6.constants.TransportType.*;
import static com.javafordev.lesson6.task6.constants.TravelType.*;

public class CommandLineRunner {
    public static void main(String[] args) {

        CommandLineUtils.chooseServiceType();
        System.out.println();
        System.out.println("Выбран тип сервиса - " + CommandLineUtils.getServiceType());
        System.out.println("Выбрана опция - " + CommandLineUtils.getOption());
        System.out.println();
        CommandLineUtils.inputParameterForService(CommandLineUtils.getServiceType());

        //from TravelVoucherRunner
        int durationToFilter = UserConstants.getTravelVoucherDuration();
        double priceToFilter = UserConstants.getTravelVoucherPrice();;
        TransportType transportToFilter = UserConstants.getTravelVoucherTransportType();

        ArrayList<TravelVoucher> travelVouchers = new ArrayList<>();
        travelVouchers.add(new TravelVoucher(7, 34.5, EXCURSION, SHIP, BREAKFAST_AND_SUPPER));
        travelVouchers.add(new TravelVoucher(10, 155.0, RECREATION, AIRPLANE, BREAKFAST));
        travelVouchers.add(new TravelVoucher(21, 2133.25, TREATMENT, TRAIN, ALL_INCLUSIVE));
        travelVouchers.add(new TravelVoucher(3, 578.9, SHOPPING, BUS, BREAKFAST));
        travelVouchers.add(new TravelVoucher(30, 13000.0, CRUISE, SHIP, ALL_INCLUSIVE));

        TravelVoucherService travelVoucherService = new TravelVoucherService(travelVouchers);

//        ArrayList<TravelVoucher> filteredByDuration = travelVoucherService.findAllByDuration(durationToFilter);
//        System.out.println(filteredByDuration);
//        System.out.println();

        ArrayList<TravelVoucher> filteredByPrice = travelVoucherService.findAllByPrice(priceToFilter);
        System.out.println(filteredByPrice);
        System.out.println();

//        ArrayList<TravelVoucher> filteredByTransport = travelVoucherService.findAllByTransport(transportToFilter);
//        System.out.println(filteredByTransport);
//        System.out.println();
//
//        TravelVoucherService travelVoucherServiceFilteredByTransport = new TravelVoucherService(filteredByTransport);
//
//        ArrayList<TravelVoucher> filteredByDurationAndTransport = travelVoucherServiceFilteredByTransport.findAllByDuration(durationToFilter);
//        System.out.println(filteredByDurationAndTransport);
//        System.out.println();
//
//
//        ArrayList<TravelVoucher> sortedByDuration = travelVoucherService.sortByDuration();
//        System.out.println(sortedByDuration);
//
//        ArrayList<TravelVoucher> sortedByPrice = travelVoucherService.sortByPrice();
//        System.out.println(sortedByPrice);



    }
}
