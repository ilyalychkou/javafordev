package com.javafordev.lesson6.task6.utils;

import com.javafordev.lesson6.task6.constants.UserConstants;

import java.util.Scanner;

public class MobileTariffCommandLineUtils {

    public static void inputParameterForMobileOperatorService() {
        System.out.print("Консольное приложение (v. 1.0)...");
        System.out.print("Введите исходные параметры для сервиса мобильнои связи...");
        System.out.println();
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите тип мобильного тарифа (1 - для смартфонов, 2 - для детеи, 3 - социальныи) : ");
        int mobileTariffTypeToValidate = Integer.parseInt(scan.next());
        UserConstants.setMobileTariffType(mobileTariffTypeToValidate);

        System.out.print("Введите размер абонентскои платы (руб.) : ");
        double mobileTariffSubscriptionFeeToValidate = Double.parseDouble(scan.next());
        UserConstants.setMobileTariffSubscriptionFee(mobileTariffSubscriptionFeeToValidate);

        System.out.print("Введите объем интернет-траффика (Mb) : ");
        int mobileTariffInternetTrafficVolumeToValidate = Integer.parseInt(scan.next());
        UserConstants.setMobileTariffInternetTrafficVolume(mobileTariffInternetTrafficVolumeToValidate);
    }


}
