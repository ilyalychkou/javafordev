package com.javafordev.lesson6.task6.utils;

import com.javafordev.lesson6.task6.constants.UserConstants;
import com.javafordev.lesson6.task6.validators.NumberValidator;

import java.util.Scanner;
/**
 *
 * Мобильная связь.
 * *
 * *      1) Определить иерархию тарифов мобильной компании.
 * *      2) Создать список тарифов компании.
 * *      3) Подсчитать общую численность клиентов.
 * *      4) Провести сортировку тарифов на основе размера абонентской платы.
 * *      5) Найти тариф в компании, соответствующий заданному диапазону параметров.
 * *          5.1) тип тарифа - для пользователя / для админа +
 * *          5.2) наименование тарифа - для пользователя / для админа
 * *          5.3) количество абонентов - для админа
 * *          5.4) абонентская плата - для пользователя / для админа
 * *          5.5) объем доступного интернет траффика - для пользователя / для админа
 * <p>
 */

public class MobileTariffUtils {

    public static void inputParameterForMobileOperatorService() {
        System.out.print("Консольное приложение (v. 1.0)...");
        System.out.print("Введите исходные параметры для сервиса мобильнои связи...");
        System.out.println();
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите тип мобильного тарифа (smartphone, child, social) : ");
        String mobileTariffTypeToValidate = scan.next();
        UserConstants.setMobileTariffType(mobileTariffTypeToValidate);

        System.out.print("Введите размер абонентскои платы (руб.) : ");
        double mobileTariffSubscriptionFeeToValidate = NumberValidator.validateSubscriptionFee(scan.next());
        UserConstants.setMobileTariffSubscriptionFee(mobileTariffSubscriptionFeeToValidate);

        System.out.print("Введите объем интернет-траффика (Mb) : ");
        int mobileTariffInternetTrafficVolumeToValidate = NumberValidator.validateInternetTrafficVolume(scan.next());
        UserConstants.setMobileTariffInternetTrafficVolume(mobileTariffInternetTrafficVolumeToValidate);
    }


}
