package com.javafordev.lesson6.task6.utils;

import com.javafordev.lesson6.task6.objects.travel.options.Excursion;
import com.javafordev.lesson6.task6.objects.travel.options.Nutrition;
import com.javafordev.lesson6.task6.objects.travel.options.Transport;
import com.javafordev.lesson6.task6.objects.travel.options.Treatment;
import com.javafordev.lesson6.task6.objects.travel.vouchers.*;
import com.javafordev.lesson6.task6.validators.NumberValidator;

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


public class TravelVoucherUtils {

    public static UserRequest inputParameterForTravelVoucherService() {
        System.out.print("Консольное приложение (v. 1.0)...");
        System.out.println();
        System.out.print("Введите исходные параметры для сервиса туристических путевок...");
        System.out.println();
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите тип отдыха (recreation, excursion, treatment, cruise, shopping) : ");
        String travelType = scan.next();

        System.out.print("Введите стоимость отдыха : ");
        double price = NumberValidator.validatePrice(scan.next());

        System.out.print("Введите длительность отдыха : ");
        int duration = NumberValidator.validateDuration(scan.next());

        System.out.print("Введите вид транспорта (airplane, ship, train, bus) : ");
        String userTransport = scan.next();
        Transport transport;

        switch (userTransport) {
            case "airplane":
                transport = Transport.AIRPLANE;
                break;
            case "ship":
                transport = Transport.SHIP;
                break;
            case "train":
                transport = Transport.TRAIN;
                break;
            case "bus":
                transport = Transport.BUS;
                break;
            default:
                throw new IllegalArgumentException("Задан некорректныи транспорта");
        }

        System.out.print("Введите вид питания (all_inclusive, breakfast, breakfast_and_supper) : ");
        String userNutrition = scan.next();
        Nutrition nutrition;

        switch (userNutrition) {
            case "all_inclusive":
                nutrition = Nutrition.ALL_INCLUSIVE;
                break;
            case "breakfast":
                nutrition = Nutrition.BREAKFAST;
                break;
            case "breakfast_and_supper":
                nutrition = Nutrition.BREAKFAST_AND_SUPPER;
                break;
            default:
                throw new IllegalArgumentException("Задан некорректныи питания");
        }

        System.out.print("Введите желаемую страну прибывания : ");
        String countryOfStay = scan.next();

        System.out.print("Введите вид экскурсии (art, historic, nature) : ");
        String userExcursion = scan.next();
        Excursion excursion;
        switch (userExcursion) {
            case "art":
                excursion = Excursion.ART;
                break;
            case "historic":
                excursion = Excursion.HISTORIC;
                break;
            case "nature":
                excursion = Excursion.NATURE;
                break;
            default:
                throw new IllegalArgumentException("Задан некорректныи вид экскурсии");
        }

        System.out.print("Введите вид лечения (physiotherapy, balneotherapy, aerotherapy) : ");
        String userTreatment = scan.next();
        Treatment treatment;
        switch (userTreatment) {
            case "physiotherapy":
                treatment = Treatment.PHYSIOTHERAPY;
                break;
            case "balneotherapy":
                treatment = Treatment.BALNEOTHERAPY;
                break;
            case "aerotherapy":
                treatment = Treatment.AEROTHERAPY;
                break;
            default:
                throw new IllegalArgumentException("Задан некорректныи вид экскурсии");
        }

        System.out.print("Введите количество звезд отеля (от 1 до 5) : ");
        int hotelLevel = NumberValidator.validateDuration(scan.next());

        System.out.print("Введите название магазина : ");
        String shop = scan.next();

        return new UserRequest(travelType, price, duration, transport, nutrition, excursion, treatment, countryOfStay, shop, hotelLevel);
    }

    public static TravelVoucher initiateTravelVoucher(UserRequest userRequest) {
        String travelType = userRequest.getTravelType();
        TravelVoucher travelVoucher;

        switch (travelType) {
            case "cruise":
                travelVoucher = new CruiseTravelVoucher(userRequest);
                break;
            case "excursion":
                travelVoucher = new ExcursionTravelVoucher(userRequest);
                break;
            case "treatment":
                travelVoucher = new TreatmentTravelVoucher(userRequest);
                break;
            case "recreation":
                travelVoucher = new RecreationTravelVoucher(userRequest);
                break;
            case "shopping":
                travelVoucher = new ShoppingTravelVoucher(userRequest);
                break;
            default:

                throw new IllegalArgumentException("Задан некорректныи тип отдыха");

        }
        return travelVoucher;
    }
}

