package com.javafordev.lesson6.task6.services;

import com.javafordev.lesson6.task6.comparators.DurationTravelComparator;
import com.javafordev.lesson6.task6.comparators.PriceTravelComparator;
import com.javafordev.lesson6.task6.objects.travel.options.Nutrition;
import com.javafordev.lesson6.task6.objects.travel.options.Transport;
import com.javafordev.lesson6.task6.objects.travel.vouchers.TravelVoucher;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Туристические путевки.
 * 1) Сформировать набор предложений клиенту по выбору туристической путевки различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 * 2) Учитывать возможность выбора транспорта, питания и числа дней.
 * 3) Реализовать выбор и сортировку путевок.
 */

public class TravelVoucherImplService implements ITravelService {

    private List<TravelVoucher> travelVouchers;

    public TravelVoucherImplService(List<TravelVoucher> travelVouchers) {
        this.travelVouchers = travelVouchers;
    }

    public List<TravelVoucher> getTravelVouchers() {
        return travelVouchers;
    }

    public void setTravelVouchers(List<TravelVoucher> travelVouchers) {
        this.travelVouchers = travelVouchers;
    }

    @Override
    public List<TravelVoucher> findAllByTransport(Transport transport) {
        List<TravelVoucher> filteredByTransport = new ArrayList<>();
        Iterator<TravelVoucher> iterator = this.getTravelVouchers().iterator();
        while (iterator.hasNext()) {
            TravelVoucher currentElement = iterator.next();
            if (currentElement.getTransport().equals(transport)) {
                filteredByTransport.add(currentElement);
            }
        }
        return filteredByTransport;
    }

    @Override
    public List<TravelVoucher> findAllByNutrition(Nutrition nutrition) {
        List<TravelVoucher> filteredByNutrition = new ArrayList<>();
        Iterator<TravelVoucher> iterator = this.getTravelVouchers().iterator();
        while (iterator.hasNext()) {
            TravelVoucher currentElement = iterator.next();
            if (currentElement.getNutrition().equals(nutrition)) {
                filteredByNutrition.add(currentElement);
            }
        }
        return filteredByNutrition;
    }

    public List<TravelVoucher> findAllByDuration(int duration) {
        List<TravelVoucher> filteredByDuration = new ArrayList<>();
        Iterator<TravelVoucher> iterator = this.getTravelVouchers().iterator();
        while (iterator.hasNext()) {
            TravelVoucher currentElement = iterator.next();
            if (currentElement.getDuration() >= duration) {
                filteredByDuration.add(currentElement);
            }
        }
        return filteredByDuration;
    }

    @Override
    public List<TravelVoucher> findAllByPrice(double travelPrice) {
        List<TravelVoucher> filteredByPrice = new ArrayList<>();
        Iterator<TravelVoucher> iterator = this.getTravelVouchers().iterator();
        while (iterator.hasNext()) {
            TravelVoucher currentElement = iterator.next();
            if (currentElement.getPrice() <= travelPrice) {
                filteredByPrice.add(currentElement);
            }
        }
        return filteredByPrice;
    }

    @Override
    public List<TravelVoucher> sortByDuration() {
        this.getTravelVouchers().sort(new DurationTravelComparator());
        return this.getTravelVouchers();
    }

    @Override
    public List<TravelVoucher> sortByPrice() {
        this.getTravelVouchers().sort(new PriceTravelComparator());
        return this.getTravelVouchers();
    }

}
