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

    public static void setTravelVoucherType(String travelVoucherType) {
        String travelTypeToLowerCase = travelVoucherType.toLowerCase();
        if (TravelType.RECREATION.getTravelTypeName().equals(travelTypeToLowerCase)) {
            UserConstants.travelVoucherType = TravelType.valueOf("RECREATION");
        } else if (TravelType.EXCURSION.getTravelTypeName().equals(travelTypeToLowerCase)) {
            UserConstants.travelVoucherType = TravelType.valueOf("EXCURSION");
        } else if (TravelType.TREATMENT.getTravelTypeName().equals(travelTypeToLowerCase)) {
            UserConstants.travelVoucherType = TravelType.valueOf("TREATMENT");
        } else if (TravelType.CRUISE.getTravelTypeName().equals(travelTypeToLowerCase)) {
            UserConstants.travelVoucherType = TravelType.valueOf("CRUISE");
        } else if (TravelType.SHOPPING.getTravelTypeName().equals(travelTypeToLowerCase)) {
            UserConstants.travelVoucherType = TravelType.valueOf("SHOPPING");
        } else {
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

    public static void setTravelVoucherTransportType(String travelVoucherTransportType) {
        String travelVoucherTransportTypeToLowerCase = travelVoucherTransportType.toLowerCase();
        if (TransportType.AIRPLANE.getTransportTypeName().equals(travelVoucherTransportTypeToLowerCase)) {
            UserConstants.travelVoucherTransportType = TransportType.valueOf("AIRPLANE");
        } else if (TransportType.SHIP.getTransportTypeName().equals(travelVoucherTransportTypeToLowerCase)) {
            UserConstants.travelVoucherTransportType = TransportType.valueOf("SHIP");
        } else if (TransportType.TRAIN.getTransportTypeName().equals(travelVoucherTransportTypeToLowerCase)) {
            UserConstants.travelVoucherTransportType = TransportType.valueOf("TRAIN");
        } else if (TransportType.BUS.getTransportTypeName().equals(travelVoucherTransportTypeToLowerCase)) {
            UserConstants.travelVoucherTransportType = TransportType.valueOf("BUS");
        } else {
            throw new IllegalArgumentException("Введен невалидныи тип транспорта");
        }
    }

    public static NutritionType getTravelVoucherNutritionType() {
        return travelVoucherNutritionType;
    }

    public static void setTravelVoucherNutritionType(String travelVoucherNutritionType) {

        String travelVoucherNutritionTypeToLowerCase = travelVoucherNutritionType.toLowerCase();
        if (NutritionType.ALL_INCLUSIVE.getNutritionTypeName().equals(travelVoucherNutritionTypeToLowerCase)) {
            UserConstants.travelVoucherNutritionType = NutritionType.valueOf("ALL_INCLUSIVE");
        } else if (NutritionType.BREAKFAST.getNutritionTypeName().equals(travelVoucherNutritionTypeToLowerCase)) {
            UserConstants.travelVoucherNutritionType = NutritionType.valueOf("BREAKFAST");
        } else if (NutritionType.BREAKFAST_AND_SUPPER.getNutritionTypeName().equals(travelVoucherNutritionTypeToLowerCase)) {
            UserConstants.travelVoucherNutritionType = NutritionType.valueOf("BREAKFAST_AND_SUPPER");
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
