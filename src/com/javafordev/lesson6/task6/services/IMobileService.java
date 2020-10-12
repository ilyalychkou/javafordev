package com.javafordev.lesson6.task6.services;

import com.javafordev.lesson6.task6.constants.MobileTariffType;
import com.javafordev.lesson6.task6.objects.mobile.MobileTariff;

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
 *
 * *  Мобильная связь.
 * *
 * *      1) Определить иерархию тарифов мобильной компании.
 * *      2) Создать список тарифов компании.
 * *      3) Подсчитать общую численность клиентов.
 * *      4) Провести сортировку тарифов на основе размера абонентской платы.
 * *      5) Найти тариф в компании, соответствующий заданному диапазону параметров.
 * *          5.1) тип тарифа - для пользователя / для админа
 * *          5.2) абонентская плата - для пользователя / для админа
 * *          5.3) количество абонентов - для админа
 * *          5.4) объем доступного интернет траффика - для пользователя / для админа
 */

public interface IMobileService {

    List<MobileTariff> findAllByType(MobileTariffType mobileTariffType);

    List<MobileTariff> findAllBySubscriptionFee(double subscriptionFee);

    List<MobileTariff> findAllByQuantityOfUsers(int quantityOfUsers);

    List<MobileTariff> findInternetTrafficVolume(int internetTrafficVolume);

    List<MobileTariff> sortBySubscriptionFee();

}
