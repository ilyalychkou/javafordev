package com.javafordev.lesson6.task6.services;

import com.javafordev.lesson6.task6.constants.NutritionType;
import com.javafordev.lesson6.task6.constants.TransportType;
import com.javafordev.lesson6.task6.constants.TravelType;
import com.javafordev.lesson6.task6.objects.TravelVoucher;

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
 * Туристические путевки.
 * 1) Сформировать набор предложений клиенту по выбору туристической путевки различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 * 2) Учитывать возможность выбора транспорта, питания и числа дней.
 * 3) Реализовать выбор и сортировку путевок.
 */

public interface ITravelService<T> {

    List<TravelVoucher> findAllByTransport(TransportType transportType);

    List<TravelVoucher> findAllByDuration(int duration);

    List<TravelVoucher> findAllByPrice(double travelPrice);

    List<TravelVoucher> findAllByNutrition(NutritionType nutritionType);

    List<TravelVoucher> findAllByTravelType(TravelType travelType);

    List<TravelVoucher> sortByDuration();

    List<TravelVoucher> sortByPrice();

}
