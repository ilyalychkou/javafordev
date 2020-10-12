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
        this.getTravelVouchers().sort(new DurationTravelComparator() {
            @Override
            public int compare(TravelVoucher o1, TravelVoucher o2) {
                int returnValue = 0;
                if (o1.getDuration() < o2.getDuration()) {
                    returnValue = -1;
                } else if (o1.getDuration() > o2.getDuration()) {
                    returnValue = 1;
                }
                return returnValue;
            }
        });
        return this.getTravelVouchers();
    }

    @Override
    public List<TravelVoucher> sortByPrice() {
        this.getTravelVouchers().sort(new PriceTravelComparator() {
            @Override
            public int compare(TravelVoucher o1, TravelVoucher o2) {
                int returnValue = 0;
                if (o1.getPrice() < o2.getPrice()) {
                    returnValue = -1;
                } else if (o1.getPrice() > o2.getPrice()) {
                    returnValue = 1;
                }
                return returnValue;
            }
        });
        return this.getTravelVouchers();
    }

}