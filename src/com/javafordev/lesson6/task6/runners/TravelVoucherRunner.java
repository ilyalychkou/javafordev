package com.javafordev.lesson6.task6.runners;

import com.javafordev.lesson6.task6.objects.travel.options.Excursion;
import com.javafordev.lesson6.task6.objects.travel.options.Nutrition;
import com.javafordev.lesson6.task6.objects.travel.options.Transport;
import com.javafordev.lesson6.task6.objects.travel.options.Treatment;
import com.javafordev.lesson6.task6.objects.travel.vouchers.*;
import com.javafordev.lesson6.task6.services.TravelVoucherImplService;
import com.javafordev.lesson6.task6.utils.TravelVoucherUtils;
import com.javafordev.lesson6.task6.utils.UserRequest;

import java.util.ArrayList;
import java.util.List;

public class TravelVoucherRunner {

    public static void main(String[] args) {

        UserRequest userRequest = TravelVoucherUtils.inputParameterForTravelVoucherService();
        System.out.println(userRequest);
        TravelVoucher travelVoucher = TravelVoucherUtils.initiateTravelVoucher(userRequest);

        int durationToFilter = userRequest.getDuration();
        double priceToFilter = userRequest.getPrice();
        Transport transportToFilter = userRequest.getTransport();

        List<String> listOfShops = new ArrayList<>();
        listOfShops.add("Ecco");
        listOfShops.add("Columbia");
        listOfShops.add("Philips");
        listOfShops.add("Apple");
        listOfShops.add("Nestle");


        List<String> southCountries = new ArrayList<>();
        southCountries.add("Croatia");
        southCountries.add("France");
        southCountries.add("Italy");
        southCountries.add("Portugal");
        southCountries.add("Spain");

        List<String> northCountries = new ArrayList<>();
        northCountries.add("Denmark");
        northCountries.add("Finland");
        northCountries.add("Iceland");
        northCountries.add("Norway");
        northCountries.add("Sweden");

        List<TravelVoucher> cruiseTravelVoucher = new ArrayList<>();
        cruiseTravelVoucher.add(new CruiseTravelVoucher(134.5,  7, Transport.SHIP, Nutrition.BREAKFAST, southCountries));
        cruiseTravelVoucher.add(new CruiseTravelVoucher(267.9,  12, Transport.SHIP, Nutrition.ALL_INCLUSIVE, northCountries));
        TravelVoucherImplService cruiseTravelVoucherService = new TravelVoucherImplService(cruiseTravelVoucher);

        List<TravelVoucher> excursionTravelVoucher = new ArrayList<>();
        excursionTravelVoucher.add(new ExcursionTravelVoucher(199.0,  9, Transport.AIRPLANE, Nutrition.BREAKFAST_AND_SUPPER, Excursion.ART));
        excursionTravelVoucher.add(new ExcursionTravelVoucher(204.3,  6, Transport.TRAIN, Nutrition.ALL_INCLUSIVE, Excursion.HISTORIC));
        excursionTravelVoucher.add(new ExcursionTravelVoucher(112.7,  4, Transport.BUS, Nutrition.BREAKFAST, Excursion.NATURE));
        TravelVoucherImplService excursionTravelVoucherService = new TravelVoucherImplService(excursionTravelVoucher);

        List<TravelVoucher> treatmentTravelVoucher = new ArrayList<>();
        treatmentTravelVoucher.add(new TreatmentTravelVoucher(1100.0,  5, Transport.BUS, Nutrition.ALL_INCLUSIVE, Treatment.AEROTHERAPY));
        treatmentTravelVoucher.add(new TreatmentTravelVoucher(3214.1,  15, Transport.AIRPLANE, Nutrition.BREAKFAST, Treatment.PHYSIOTHERAPY));
        treatmentTravelVoucher.add(new TreatmentTravelVoucher(2890.4,  11, Transport.AIRPLANE, Nutrition.BREAKFAST_AND_SUPPER, Treatment.BALNEOTHERAPY));
        TravelVoucherImplService treatmentTravelVoucherService = new TravelVoucherImplService(treatmentTravelVoucher);

        List<TravelVoucher> recreationTravelVoucher = new ArrayList<>();
        treatmentTravelVoucher.add(new RecreationTravelVoucher(350.0,  4, Transport.BUS, Nutrition.BREAKFAST, 3));
        treatmentTravelVoucher.add(new RecreationTravelVoucher(850.0,  5, Transport.TRAIN, Nutrition.BREAKFAST_AND_SUPPER, 4));
        treatmentTravelVoucher.add(new RecreationTravelVoucher(1570.0,  7, Transport.AIRPLANE, Nutrition.ALL_INCLUSIVE, 5));
        TravelVoucherImplService recreationTravelVoucherService = new TravelVoucherImplService(recreationTravelVoucher);

        List<TravelVoucher> shoppingTravelVoucher = new ArrayList<>();
        treatmentTravelVoucher.add(new ShoppingTravelVoucher(350.0,  3, Transport.BUS, Nutrition.BREAKFAST, listOfShops));
        treatmentTravelVoucher.add(new ShoppingTravelVoucher(878.3,  5, Transport.TRAIN, Nutrition.BREAKFAST_AND_SUPPER, listOfShops));
        treatmentTravelVoucher.add(new ShoppingTravelVoucher(456.1,  2, Transport.AIRPLANE, Nutrition.ALL_INCLUSIVE, listOfShops));
        TravelVoucherImplService shoppingTravelVoucherService = new TravelVoucherImplService(shoppingTravelVoucher);

        List<TravelVoucher> filteredByDuration = treatmentTravelVoucherService.findAllByDuration(durationToFilter);
        System.out.println("Список путевок длительностью >= заданнои пользователем : " + filteredByDuration);
        System.out.println();

        List<TravelVoucher> filteredByPrice = treatmentTravelVoucherService.findAllByPrice(priceToFilter);
        System.out.println("Список путевок стоимостью <= заданнои пользователем : " + filteredByPrice);
        System.out.println();

        List<TravelVoucher> filteredByTransport = treatmentTravelVoucherService.findAllByTransport(transportToFilter);
        System.out.println("Список путевок c типом транспорта, заданным пользователем : " + filteredByTransport);
        System.out.println();

        TravelVoucherImplService travelVoucherServiceFilteredByTransport = new TravelVoucherImplService(filteredByTransport);

        List<TravelVoucher> filteredByDurationAndTransport = travelVoucherServiceFilteredByTransport.findAllByDuration(durationToFilter);
        System.out.println("Список путевок c длительноситью  и типом транспорта, заданным пользователем : " + filteredByDurationAndTransport);
        System.out.println();

        List<TravelVoucher> sortedByDuration = treatmentTravelVoucherService.sortByDuration();
        System.out.println("Список путевок отсортированныи по длительности : " + sortedByDuration);
        System.out.println();

        List<TravelVoucher> sortedByPrice = treatmentTravelVoucherService.sortByPrice();
        System.out.println("Список путевок отсортированныи по стоимости : " + sortedByPrice);

    }

}
