package com.javafordev.lesson6.task6.services;

import com.javafordev.lesson6.task6.constants.NutritionType;
import com.javafordev.lesson6.task6.constants.TransportType;
import com.javafordev.lesson6.task6.constants.TravelType;
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
 *          5.1) тип тарифа - для пользователя / для админа
 *          5.2) абонентская плата - для пользователя / для админа
 *          5.3) количество абонентов - для админа
 *          5.4) объем доступного интернет траффика - для пользователя / для админа
 *
 *  Туристические путевки.
 *      1) Сформировать набор предложений клиенту по выбору туристической путевки различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 *      2) Учитывать возможность выбора транспорта, питания и числа дней.
 *      3) Реализовать выбор и сортировку путевок.
 *
 *
 *
 *  Выделение параметров:
 *
 *  Мобильная связь:
 *      > Пользовательскии тип - MobileTariff (Str)
 *      > ArrayList<MobileTariff>  listOfmobileTarrifs
 *
 *
 *      Консольное приложение:
 *      1. Выберите тип сервиса (1 - туристические путевки, 2 - мобильная связь)
 *
 *
 *
 *
 *
 *
 */

public interface ITravelVoucherServiceAction {

    ArrayList<TravelVoucher> findAllByTransport(TransportType transportType);
    ArrayList<TravelVoucher> findAllByDuration(int duration);
    ArrayList<TravelVoucher> findAllByPrice(double travelPrice);
    ArrayList<TravelVoucher> findAllByNutrition(NutritionType nutritionType);
    ArrayList<TravelVoucher> findAllByTravelType(TravelType travelType);


    ArrayList<TravelVoucher> sortByDuration();
    ArrayList<TravelVoucher> sortByPrice();


}
