package com.javafordev.lesson6.task6.constants;
//самолёт, корабль, поезд, автобус
//всё включено, завтрак, завтрак и ужин

public class UserConstants {
    // данные полученные от пользователя/админа

    // статик поля для сервиса MobileTariff
    public static String mobileTariffType;
    public static String mobileTariffName;
    public static double mobileTariffSubscriptionFee;
    public static int mobileTariffQuantityOfUsers;
    public static int mobileTariffInternetTrafficVolume;


    //статик поля для сервиса TravelVoucher
    public static TravelType travelVoucherType;
    public static int travelVoucherDuration;
    public static double travelVoucherPrice;
    public static TransportType travelVoucherTransportType;
    public static NutritionType travelVoucherNutritionType;


    public static TravelType getTravelVoucherType() {
        return travelVoucherType;
    }

    public static void setTravelVoucherType(String travelVoucherType) {
        switch (travelVoucherType) {
            case "отдых":
                UserConstants.travelVoucherType = TravelType.RECREATION;
                break;
            case "экскурсии":
                UserConstants.travelVoucherType = TravelType.EXCURSION;
                break;
            case "лечение":
                UserConstants.travelVoucherType = TravelType.TREATMENT;
                break;
            case "круиз":
                UserConstants.travelVoucherType = TravelType.CRUISE;
                break;
            default:
                System.out.println("Введен невалидныи тип путешествия");
        }

    }

    public static int getTravelVoucherDuration() {
        return travelVoucherDuration;
    }

    public static void setTravelVoucherDuration(int travelVoucherDuration) {
        UserConstants.travelVoucherDuration = travelVoucherDuration;
    }

    public static TransportType getTravelVoucherTransportType() {
        return travelVoucherTransportType;
    }

    public static void setTravelVoucherTransportType(String travelVoucherTransportType) {
        switch (travelVoucherTransportType) {
            case "самолёт":
                UserConstants.travelVoucherTransportType = TransportType.AIRPLANE;
                break;
            case "корабль":
                UserConstants.travelVoucherTransportType = TransportType.SHIP;
                break;
            case "поезд":
                UserConstants.travelVoucherTransportType = TransportType.TRAIN;
                break;
            case "автобус":
                UserConstants.travelVoucherTransportType = TransportType.BUS;
                break;
            default:
                System.out.println("Введен невалидныи тип транспорта");
        }

    }

    public static NutritionType getTravelVoucherNutritionType() {
        return travelVoucherNutritionType;
    }

    public static void setTravelVoucherNutritionType(String travelVoucherNutritionType) {
        switch (travelVoucherNutritionType) {
            case "всё включено":
                UserConstants.travelVoucherNutritionType = NutritionType.ALL_INCLUSIVE;
                break;
            case "завтрак":
                UserConstants.travelVoucherNutritionType = NutritionType.BREAKFAST;
                break;
            case "завтрак и ужин":
                UserConstants.travelVoucherNutritionType = NutritionType.BREAKFAST_AND_SUPPER;
                break;
            default:
                System.out.println("Введен невалидныи тип питания");
        }

    }

    public static double getTravelVoucherPrice() {
        return travelVoucherPrice;
    }

    public static void setTravelVoucherPrice(double travelVoucherPrice) {
        UserConstants.travelVoucherPrice = travelVoucherPrice;
    }
}
