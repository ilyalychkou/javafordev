package com.javafordev.lesson6.task6.constants;
//самолёт, корабль, поезд, автобус
//всё включено, завтрак, завтрак и ужин

import com.javafordev.lesson6.task6.objects.travel.options.Nutrition;
import com.javafordev.lesson6.task6.objects.travel.options.Transport;

public class UserConstants {
    // данные полученные от пользователя/админа

    // статик поля для сервиса MobileTariff
    private static MobileTariffType mobileTariffType;
    private static String mobileTariffName;
    private static double mobileTariffSubscriptionFee;
    private static int mobileTariffQuantityOfUsers;
    private static int mobileTariffInternetTrafficVolume;


    //статик поля для сервиса TravelVoucher
    private static int travelVoucherDuration;
    private static double travelVoucherPrice;
    private static Transport travelVoucherTransportType;
    private static Nutrition travelVoucherNutritionType;



    public static int getTravelVoucherDuration() {
        return travelVoucherDuration;
    }

    public static void setTravelVoucherDuration(int travelVoucherDuration) {
        UserConstants.travelVoucherDuration = travelVoucherDuration;
    }

    public static Transport getTravelVoucherTransportType() {
        return travelVoucherTransportType;
    }

    public static void setTravelVoucherTransportType(String travelVoucherTransportType) {
        String travelVoucherTransportTypeToLowerCase = travelVoucherTransportType.toLowerCase();
        if (Transport.AIRPLANE.getTransportName().equals(travelVoucherTransportTypeToLowerCase)) {
            UserConstants.travelVoucherTransportType = Transport.valueOf("AIRPLANE");
        } else if (Transport.SHIP.getTransportName().equals(travelVoucherTransportTypeToLowerCase)) {
            UserConstants.travelVoucherTransportType = Transport.valueOf("SHIP");
        } else if (Transport.TRAIN.getTransportName().equals(travelVoucherTransportTypeToLowerCase)) {
            UserConstants.travelVoucherTransportType = Transport.valueOf("TRAIN");
        } else if (Transport.BUS.getTransportName().equals(travelVoucherTransportTypeToLowerCase)) {
            UserConstants.travelVoucherTransportType = Transport.valueOf("BUS");
        } else {
            throw new IllegalArgumentException("Введен невалидныи тип транспорта");
        }
    }

    public static Nutrition getTravelVoucherNutritionType() {
        return travelVoucherNutritionType;
    }

    public static void setTravelVoucherNutritionType(String travelVoucherNutritionType) {

        String travelVoucherNutritionTypeToLowerCase = travelVoucherNutritionType.toLowerCase();
        if (Nutrition.ALL_INCLUSIVE.getNutritionName().equals(travelVoucherNutritionTypeToLowerCase)) {
            UserConstants.travelVoucherNutritionType = Nutrition.valueOf("ALL_INCLUSIVE");
        } else if (Nutrition.BREAKFAST.getNutritionName().equals(travelVoucherNutritionTypeToLowerCase)) {
            UserConstants.travelVoucherNutritionType = Nutrition.valueOf("BREAKFAST");
        } else if (Nutrition.BREAKFAST_AND_SUPPER.getNutritionName().equals(travelVoucherNutritionTypeToLowerCase)) {
            UserConstants.travelVoucherNutritionType = Nutrition.valueOf("BREAKFAST_AND_SUPPER");
        } else {
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

    public static void setMobileTariffType(String mobileTariffType) {
        String mobileTariffTypeToLowerCase = mobileTariffType.toLowerCase();


        if (MobileTariffType.FOR_SMARTPHONE.getMobileTariffName().equals(mobileTariffTypeToLowerCase)) {
            UserConstants.mobileTariffType = MobileTariffType.valueOf("FOR_SMARTPHONE");
        } else if (MobileTariffType.FOR_CHILDREN.getMobileTariffName().equals(mobileTariffTypeToLowerCase)) {
            UserConstants.mobileTariffType = MobileTariffType.valueOf("FOR_CHILDREN");
        } else if (MobileTariffType.SOCIAL.getMobileTariffName().equals(mobileTariffTypeToLowerCase)) {
            UserConstants.mobileTariffType = MobileTariffType.valueOf("SOCIAL");
        } else {
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
