package com.javafordev.lesson6.task6.utils;

import com.javafordev.lesson6.task6.constants.UserConstants;

import java.util.Scanner;

/**
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
 * <p>
 * *  Туристические путевки.
 * *      1) Сформировать набор предложений клиенту по выбору туристической путевки различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 * *      2) Учитывать возможность выбора транспорта, питания и числа дней.
 * *      3) Реализовать выбор и сортировку путевок.
 */


public class TravelVoucherCommandLineUtils {

    public static void inputParameterForTravelVoucherService() {
        System.out.print("Консольное приложение (v. 1.0)...");
        System.out.println();
        System.out.print("Введите исходные параметры для сервиса туристических путевок...");
        System.out.println();
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите тип отдыха (доступные варианты : 1 - отдых, 2 - экскурсии, 3 - лечение, 4 - шопинг, 5 - круиз) : ");
        int travelVoucherTypeToValidate = Integer.parseInt(scan.next());
        UserConstants.setTravelVoucherType(travelVoucherTypeToValidate);

        System.out.print("Введите длительность отдыха : ");
        int travelVoucherDurationToValidate = Integer.parseInt(scan.next());
        UserConstants.setTravelVoucherDuration(travelVoucherDurationToValidate);

        System.out.print("Введите стоимость отдыха : ");
        double travelVoucherPriceToValidate = Double.parseDouble(scan.next());
        UserConstants.setTravelVoucherPrice(travelVoucherPriceToValidate);

        System.out.print("Введите вид транспорта (доступные варианты : 1-самолёт, 2-корабль, 3-поезд, 4-автобус) : ");
        int travelVoucherTransportTypeToValidate = Integer.parseInt(scan.next());
        UserConstants.setTravelVoucherTransportType(travelVoucherTransportTypeToValidate);

        System.out.print("Введите вид питания (доступные варианты : 1-всё включено, 2-завтрак, 3-завтрак и ужин) : ");
        int travelVoucherNutritionTypeToValidate = Integer.parseInt(scan.next());
        UserConstants.setTravelVoucherNutritionType(travelVoucherNutritionTypeToValidate);
    }

}

