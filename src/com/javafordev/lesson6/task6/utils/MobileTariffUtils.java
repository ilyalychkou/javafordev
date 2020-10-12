package com.javafordev.lesson6.task6.utils;

import com.javafordev.lesson6.task6.constants.UserConstants;
import com.javafordev.lesson6.task6.validators.NumberValidator;

import java.util.Scanner;

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
