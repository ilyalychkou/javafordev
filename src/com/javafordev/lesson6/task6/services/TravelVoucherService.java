package com.javafordev.lesson6.task6.services;

import com.javafordev.lesson6.task6.utils.ArrayUtils;
import com.javafordev.lesson6.task6.constants.TransportType;
import com.javafordev.lesson6.task6.objects.TravelVoucher;

import java.util.ArrayList;

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
 *
 *  Мобильная связь.
 *
 *      1) Определить иерархию тарифов мобильной компании.
 *      2) Создать список тарифов компании.
 *      3) Подсчитать общую численность клиентов.
 *      4) Провести сортировку тарифов на основе размера абонентской платы.
 *      5) Найти тариф в компании, соответствующий заданному диапазону параметров.
 *
 *  Туристические путевки.
 *      1) Сформировать набор предложений клиенту по выбору туристической путевки различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 *      2) Учитывать возможность выбора транспорта, питания и числа дней.
 *      3) Реализовать выбор и сортировку путевок.
 *
 *
 *  Выделение параметров:
 *
 *  Мобильная связь:
 *      > Пользовательскии тип - MobileTariff (Str)
 *      > ArrayList<MobileTariff>  listOfmobileTarrifs
 *
 *
 *
 *
 *
 *
 */

public class TravelVoucherService implements Service{

    private TravelVoucher[] travelVouchers;

    public TravelVoucherService(TravelVoucher[] travelVouchers) {
        this.travelVouchers = travelVouchers;
    }

    public TravelVoucher[] findByTransport(TransportType transportType) {
        TravelVoucher[] filteredByTransport = new TravelVoucher[this.travelVouchers.length];

        int i = 0;
        for (TravelVoucher element : this.travelVouchers) {
            if (element.getTransportType().equals(transportType)) {
                filteredByTransport[i] = new TravelVoucher(element.getDuration(), element.getTravelType(),element.getTransportType(), element.getNutritionType());
                i++;
            }
        }
        return ArrayUtils.removeNullElementsFromTravelVouchers(filteredByTransport);
    }

    public TravelVoucher[] findByNutrition(TravelVoucher[] travelVouchers) {
        //need some code to be typed
        return travelVouchers;
    }

    public TravelVoucher[] findByDuration(int duration) {
        TravelVoucher[] filteredByDuration = new TravelVoucher[this.travelVouchers.length];
        int i = 0;
        for (TravelVoucher element : this.travelVouchers) {
            if (element.getDuration() > duration) {
                filteredByDuration[i] = new TravelVoucher(element.getDuration(), element.getTravelType(),element.getTransportType(), element.getNutritionType());
                i++;
            }
        }
        return ArrayUtils.removeNullElementsFromTravelVouchers(filteredByDuration);
    }

    public TravelVoucher[] getTravelVouchers() {
        return travelVouchers;
    }

    public void setTravelVouchers(TravelVoucher[] travelVouchers) {
        this.travelVouchers = travelVouchers;
    }

    @Override
    public ArrayList sort(Object o) {
        return null;
    }

    @Override
    public ArrayList findAllBy(Object o) {
        return null;
    }
}
