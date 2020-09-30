package com.javafordev.lesson6.task6.services;

import com.javafordev.lesson6.task6.constants.MobileTariffType;
import com.javafordev.lesson6.task6.objects.MobileTariff;

import java.util.ArrayList;

/**
 *  *  Мобильная связь.
 *  *
 *  *      1) Определить иерархию тарифов мобильной компании.
 *  *      2) Создать список тарифов компании.
 *  *      3) Подсчитать общую численность клиентов.
 *  *      4) Провести сортировку тарифов на основе размера абонентской платы.
 *  *      5) Найти тариф в компании, соответствующий заданному диапазону параметров.
 *  *          5.1) тип тарифа - для пользователя / для админа
 *  *          5.2) абонентская плата - для пользователя / для админа
 *  *          5.3) количество абонентов - для админа
 *  *          5.4) объем доступного интернет траффика - для пользователя / для админа
 */

public interface IMobileTariffServiceAction {

    ArrayList<MobileTariff> findAllType(MobileTariffType mobileTariffType);
    ArrayList<MobileTariff> findAllBySubscriptionFee(double subscriptionFee);
    ArrayList<MobileTariff> findAllQuantityOfUsers(int quantityOfUsers);
    ArrayList<MobileTariff> findInternetTrafficVolume(int internetTrafficVolume);

    ArrayList<MobileTariff> sortBySubscriptionFee();




}
