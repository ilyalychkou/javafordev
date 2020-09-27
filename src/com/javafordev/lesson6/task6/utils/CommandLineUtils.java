package com.javafordev.lesson6.task6.utils;

import com.javafordev.lesson6.task6.constants.UserConstants;
import com.javafordev.lesson6.task6.validators.CommandLineValidator;

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


public class CommandLineUtils {

    private static int serviceType;
    private static int option;

    public static int getServiceType() {
        return serviceType;
    }

    public static void setServiceType(int serviceType) {
        CommandLineUtils.serviceType = serviceType;
    }

    public static int getOption() {
        return option;
    }

    public static void setOption(int option) {
        CommandLineUtils.option = option;
    }


    public static void chooseServiceType() {

        System.out.print("Консольное приложение (v. 1.0)...");
        System.out.println();
        System.out.print("Выберите тип сервиса (1 - туристические путевки, 2 - мобильная связь) : ");
        Scanner scan = new Scanner(System.in);
        int serviceTypeToValidate = Integer.parseInt(scan.next());
        CommandLineValidator.validateServiceType(serviceTypeToValidate);
        CommandLineUtils.setServiceType(serviceTypeToValidate);

        System.out.print("Выберите тип опции (1 - вывод инфо о сервисе, 2 - сортировка данных, 3 - поиск по параметрам) : ");
        int optionToValidate = Integer.parseInt(scan.next());
        CommandLineValidator.validateOption(optionToValidate);
        CommandLineUtils.setOption(optionToValidate);
    }

    //    public static void inputParameterForOption(int serviceType, int option, String[] inputParameters) {
    public static void inputParameterForService(int serviceType) {
        System.out.print("Введите исходные параметры для сервиса " + serviceType);
        System.out.println();
        Scanner scan = new Scanner(System.in);

        switch (serviceType) {
            case 1:

                System.out.print("Введите тип отдыха (доступные варианты - отдых, экскурсии, лечение, шопинг, круиз) : ");
                String travelVoucherTypeToValidate = scan.next();
                UserConstants.setTravelVoucherType(travelVoucherTypeToValidate);

                System.out.print("Введите длительность отдыха : ");
                int travelVoucherDurationToValidate = Integer.parseInt(scan.next());
                UserConstants.setTravelVoucherDuration(travelVoucherDurationToValidate);

                System.out.print("Введите стоимость отдыха : ");
                double travelVoucherPriceToValidate = Double.parseDouble(scan.next());
                UserConstants.setTravelVoucherPrice(travelVoucherPriceToValidate);

                System.out.print("Введите вид транспорта (доступные варианты - самолёт, корабль, поезд, автобус) : ");
                String travelVoucherTransportTypeToValidate = scan.next();
                UserConstants.setTravelVoucherTransportType(travelVoucherTransportTypeToValidate);

                System.out.print("Введите вид питания (доступные варианты - всё включено, завтрак, завтрак и ужин) : ");
                String travelVoucherNutritionTypeToValidate = scan.next();
                UserConstants.setTravelVoucherNutritionType(travelVoucherNutritionTypeToValidate);
                break;

            case 2:

                System.out.print("Введите тип мобильного тарифа (1 - для смартфонов, 2 - для детеи, 3 - социальныи) : ");
                String mobileTariffTypeToValidate = scan.next();
                UserConstants.mobileTariffType = mobileTariffTypeToValidate;

                System.out.print("Введите размер абонентскои платы (руб.) : ");
                double mobileTariffSubscriptionFeeToValidate = Double.parseDouble(scan.next());
                UserConstants.mobileTariffSubscriptionFee = mobileTariffSubscriptionFeeToValidate;

                System.out.print("Введите объем интернет-траффика (Mb) : ");
                int mobileTariffInternetTrafficVolumeToValidate = Integer.parseInt(scan.next());
                UserConstants.mobileTariffInternetTrafficVolume = mobileTariffInternetTrafficVolumeToValidate;
                break;

            default:
                CommandLineValidator.validateServiceType(serviceType);
        }

    }

}
