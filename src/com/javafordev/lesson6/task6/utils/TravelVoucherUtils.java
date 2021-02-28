package com.javafordev.lesson6.task6.utils;

import com.javafordev.lesson6.task6.objects.travel.options.Excursion;
import com.javafordev.lesson6.task6.objects.travel.options.Nutrition;
import com.javafordev.lesson6.task6.objects.travel.options.Transport;
import com.javafordev.lesson6.task6.objects.travel.options.Treatment;
import com.javafordev.lesson6.task6.validators.NumberValidator;

import java.util.Scanner;

/**
 * <p>
 * *  Туристические путевки.
 * *      1) Сформировать набор предложений клиенту по выбору туристической путевки различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 * *      2) Учитывать возможность выбора транспорта, питания и числа дней.
 * *      3) Реализовать выбор и сортировку путевок.
 */


public class TravelVoucherUtils {

    public static UserRequest inputBaseParameterForTravelVoucherService() {
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
        Transport transport = Transport.valueOf(userTransport.toUpperCase());

        System.out.print("Введите вид питания (all_inclusive, breakfast, breakfast_and_supper) : ");
        String userNutrition = scan.next();
        Nutrition nutrition = Nutrition.valueOf(userNutrition.toUpperCase());

        return new UserRequest(travelType, price, duration, transport, nutrition);
    }

    public static void inputAdditionalParameterForTravelVoucherService(UserRequest userRequest) {

        String travelType = userRequest.getTravelType();
        Scanner scan = new Scanner(System.in);

        switch (travelType) {
            case "recreation":
                System.out.print("Введите вид лечения (physiotherapy, balneotherapy, aerotherapy) : ");
                String userTreatment = scan.next();
                Treatment treatment = Treatment.valueOf(userTreatment.toUpperCase());
                userRequest.setTreatment(treatment);
                break;
            case "excursion":
                System.out.print("Введите вид экскурсии (art, historic, nature) : ");
                String userExcursion = scan.next();
                Excursion excursion = Excursion.valueOf(userExcursion.toUpperCase());
                userRequest.setExcursion(excursion);
                break;
            case "treatment":
                System.out.print("Введите количество звезд отеля (от 1 до 5) : ");
                int hotelLevel = NumberValidator.validateDuration(scan.next());
                userRequest.setHotelLevel(hotelLevel);
                break;
            case "cruise":
                System.out.print("Введите желаемую страну прибывания : ");
                String countryOfStay = scan.next();
                userRequest.setCountryOfStay(countryOfStay);
                break;
            case "shopping":
                System.out.print("Введите название магазина : ");
                String shop = scan.next();
                userRequest.setShop(shop);
                break;
            default:
                throw new IllegalArgumentException("Задан некорректныи тип отдыха");
        }
    }
}



