package com.javafordev.lesson6.task6.services;

import com.javafordev.lesson6.task6.comparators.DurationTravelComparator;
import com.javafordev.lesson6.task6.comparators.PriceTravelComparator;
import com.javafordev.lesson6.task6.constants.NutritionType;
import com.javafordev.lesson6.task6.constants.TransportType;
import com.javafordev.lesson6.task6.constants.TravelType;
import com.javafordev.lesson6.task6.objects.TravelVoucher;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Доп задание на интерфейс / абстрактный класс:
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * • Использовать возможности ООП: классы, наследование, полиморфизм, инкапсуляция.
 * • Каждый класс должен иметь отражающее смысл название и информативный состав.
 * • Наследование должно применяться только тогда, когда это имеет смысл.
 * • При кодировании должны быть использованы соглашения об оформлении кода java code convention.
 * • Классы должны быть грамотно разложены по пакетам.
 * • Консольное меню должно быть минимальным.
 * • Для хранения параметров инициализации можно использовать файлы.
 * <p>
 * Мобильная связь.
 * <p>
 * 1) Определить иерархию тарифов мобильной компании.
 * 2) Создать список тарифов компании.
 * 3) Подсчитать общую численность клиентов.
 * 4) Провести сортировку тарифов на основе размера абонентской платы.
 * 5) Найти тариф в компании, соответствующий заданному диапазону параметров.
 * <p>
 * Туристические путевки.
 * 1) Сформировать набор предложений клиенту по выбору туристической путевки различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 * 2) Учитывать возможность выбора транспорта, питания и числа дней.
 * 3) Реализовать выбор и сортировку путевок.
 * <p>
 * <p>
 * Выделение параметров:
 * <p>
 * Мобильная связь:
 * > Пользовательскии тип - MobileTariff (Str)
 * > ArrayList<MobileTariff>  listOfmobileTarrifs
 * <p>
 * <p>
 * Консольное приложение:
 * 1. Выберите тип сервиса (1 - туристические путевки, 2 - мобильная связь)
 */

public class TravelVoucherService implements ITravelVoucherServiceAction {

    private ArrayList<TravelVoucher> travelVouchers;

    public TravelVoucherService(ArrayList<TravelVoucher> travelVouchers) {
        this.travelVouchers = travelVouchers;
    }

    public ArrayList<TravelVoucher> getTravelVouchers() {
        return travelVouchers;
    }

    public void setTravelVouchers(ArrayList<TravelVoucher> travelVouchers) {
        this.travelVouchers = travelVouchers;
    }


    public ArrayList<TravelVoucher> findAllByTransport(TransportType transportType) {
        ArrayList<TravelVoucher> filteredByTransport = new ArrayList<>();
        Iterator<TravelVoucher> iterator = this.getTravelVouchers().iterator();
        while (iterator.hasNext()) {
            TravelVoucher currentElement = iterator.next();
            if (currentElement.getTransportType().equals(transportType)) {
                filteredByTransport.add(currentElement);
            }
        }
        return filteredByTransport;
    }

    public ArrayList<TravelVoucher> findAllByTravelType(TravelType travelType) {
        ArrayList<TravelVoucher> filteredByTravelType = new ArrayList<>();
        Iterator<TravelVoucher> iterator = this.getTravelVouchers().iterator();
        while (iterator.hasNext()) {
            TravelVoucher currentElement = iterator.next();
            if (currentElement.getTravelType().equals(travelType)) {
                filteredByTravelType.add(currentElement);
            }
        }
        return filteredByTravelType;
    }


    public ArrayList<TravelVoucher> findAllByDuration(int duration) {
        ArrayList<TravelVoucher> filteredByDuration = new ArrayList<>();
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
    public ArrayList<TravelVoucher> findAllByPrice(double travelPrice) {
        ArrayList<TravelVoucher> filteredByPrice = new ArrayList<>();
        Iterator<TravelVoucher> iterator = this.getTravelVouchers().iterator();
        while (iterator.hasNext()) {
            TravelVoucher currentElement = iterator.next();
            if (currentElement.getPrice() <= travelPrice) {
                filteredByPrice.add(currentElement);
            }
        }
        return filteredByPrice;
    }


    public ArrayList<TravelVoucher> findAllByNutrition(NutritionType nutritionType) {
        ArrayList<TravelVoucher> filteredByNutrition = new ArrayList<>();
        Iterator<TravelVoucher> iterator = this.getTravelVouchers().iterator();
        while (iterator.hasNext()) {
            TravelVoucher currentElement = iterator.next();
            if (currentElement.getNutritionType().equals(nutritionType)) {
                filteredByNutrition.add(currentElement);
            }
        }
        return filteredByNutrition;
    }

    @Override
    public ArrayList<TravelVoucher> sortByDuration() {
        this.getTravelVouchers().sort(new DurationTravelComparator());
        return this.getTravelVouchers();
    }

    @Override
    public ArrayList<TravelVoucher> sortByPrice() {
        this.getTravelVouchers().sort(new PriceTravelComparator());
        return this.getTravelVouchers();
    }

}