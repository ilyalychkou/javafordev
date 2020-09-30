package com.javafordev.lesson6.task6.constants;
//самолёт, корабль, поезд, автобус
//всё включено, завтрак, завтрак и ужин

public class UserConstants {
    // данные полученные от пользователя/админа

    // статик поля для сервиса MobileTariff
    private static MobileTariffType mobileTariffType;
    private static String mobileTariffName;
    private static double mobileTariffSubscriptionFee;
    private static int mobileTariffQuantityOfUsers;
    private static int mobileTariffInternetTrafficVolume;


    //статик поля для сервиса TravelVoucher
    private static TravelType travelVoucherType;
    private static int travelVoucherDuration;
    private static double travelVoucherPrice;
    private static TransportType travelVoucherTransportType;
    private static NutritionType travelVoucherNutritionType;


    public static TravelType getTravelVoucherType() {
        return travelVoucherType;
    }

    public static void setTravelVoucherType(int travelVoucherType) {
        switch (travelVoucherType) {
            case 1:
                UserConstants.travelVoucherType = TravelType.RECREATION;
                break;
            case 2:
                UserConstants.travelVoucherType = TravelType.EXCURSION;
                break;
            case 3:
                UserConstants.travelVoucherType = TravelType.TREATMENT;
                break;
            case 4:
                UserConstants.travelVoucherType = TravelType.SHOPPING;
                break;
            case 5:
                UserConstants.travelVoucherType = TravelType.CRUISE;
                break;
            default:
                throw new IllegalArgumentException("Введен невалидныи тип путешествия");
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

    public static void setTravelVoucherTransportType(int travelVoucherTransportType) {
        switch (travelVoucherTransportType) {
            case 1:
                UserConstants.travelVoucherTransportType = TransportType.AIRPLANE;
                break;
            case 2:
                UserConstants.travelVoucherTransportType = TransportType.SHIP;
                break;
            case 3:
                UserConstants.travelVoucherTransportType = TransportType.TRAIN;
                break;
            case 4:
                UserConstants.travelVoucherTransportType = TransportType.BUS;
                break;
            default:
                throw new IllegalArgumentException("Введен невалидныи тип транспорта");
        }

    }

    public static NutritionType getTravelVoucherNutritionType() {
        return travelVoucherNutritionType;
    }

    public static void setTravelVoucherNutritionType(int travelVoucherNutritionType) {
        switch (travelVoucherNutritionType) {
            case 1:
                UserConstants.travelVoucherNutritionType = NutritionType.ALL_INCLUSIVE;
                break;
            case 2:
                UserConstants.travelVoucherNutritionType = NutritionType.BREAKFAST;
                break;
            case 3:
                UserConstants.travelVoucherNutritionType = NutritionType.BREAKFAST_AND_SUPPER;
                break;
            default:
                throw new IllegalArgumentException("Введен невалидныи тип питания");
        }

    }

    public static double getTravelVoucherPrice() {
        return travelVoucherPrice;
    }

    public static void setTravelVoucherPrice(double travelVoucherPrice) {
        UserConstants.travelVoucherPrice = travelVoucherPrice;
    }

    public static MobileTariffType getMobileTariffType() {
        return mobileTariffType;
    }

    public static void setMobileTariffType(int mobileTariffType) {
        switch (mobileTariffType) {
            case 1:
                UserConstants.mobileTariffType = MobileTariffType.FOR_SMARTPHONE;
                break;
            case 2:
                UserConstants.mobileTariffType = MobileTariffType.FOR_CHILDREN;
                break;
            case 3:
                UserConstants.mobileTariffType = MobileTariffType.SOCIAL;
                break;
            default:
                throw new IllegalArgumentException("Введен невалидныи тип мобильного тарифа");
        }
    }

    public static String getMobileTariffName() {
        return mobileTariffName;
    }

    public static void setMobileTariffName(String mobileTariffName) {
        UserConstants.mobileTariffName = mobileTariffName;
    }

    public static double getMobileTariffSubscriptionFee() {
        return mobileTariffSubscriptionFee;
    }

    public static void setMobileTariffSubscriptionFee(double mobileTariffSubscriptionFee) {
        UserConstants.mobileTariffSubscriptionFee = mobileTariffSubscriptionFee;
    }

    public static int getMobileTariffQuantityOfUsers() {
        return mobileTariffQuantityOfUsers;
    }

    public static void setMobileTariffQuantityOfUsers(int mobileTariffQuantityOfUsers) {
        UserConstants.mobileTariffQuantityOfUsers = mobileTariffQuantityOfUsers;
    }

    public static int getMobileTariffInternetTrafficVolume() {
        return mobileTariffInternetTrafficVolume;
    }

    public static void setMobileTariffInternetTrafficVolume(int mobileTariffInternetTrafficVolume) {
        UserConstants.mobileTariffInternetTrafficVolume = mobileTariffInternetTrafficVolume;
    }
}
