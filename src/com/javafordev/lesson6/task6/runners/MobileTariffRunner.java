package com.javafordev.lesson6.task6.runners;

import com.javafordev.lesson6.task6.constants.MobileTariffType;
import com.javafordev.lesson6.task6.constants.UserConstants;
import com.javafordev.lesson6.task6.objects.MobileTariff;
import com.javafordev.lesson6.task6.services.MobileTariffService;
import com.javafordev.lesson6.task6.utils.MobileTariffCommandLineUtils;

import java.util.ArrayList;

public class MobileTariffRunner {

    public static void main(String[] args) {

        MobileTariffCommandLineUtils.inputParameterForMobileOperatorService();

        MobileTariffType mobileTariffTypeToFilter = UserConstants.getMobileTariffType();
        double subscriptionFeeToFilter = UserConstants.getMobileTariffSubscriptionFee();
        int internetTrafficVolumeToFilter = UserConstants.getMobileTariffInternetTrafficVolume();

        ArrayList<MobileTariff> mobileTariffs = new ArrayList<>();
        mobileTariffs.add(new MobileTariff("Start", MobileTariffType.FOR_SMARTPHONE, 1500, 7.5, 750));
        mobileTariffs.add(new MobileTariff("Turbo", MobileTariffType.FOR_SMARTPHONE, 345, 21.3, 5000));
        mobileTariffs.add(new MobileTariff("School", MobileTariffType.FOR_CHILDREN, 560, 5.8, 50));
        mobileTariffs.add(new MobileTariff("Eureka", MobileTariffType.FOR_CHILDREN, 250, 12.2, 1000));
        mobileTariffs.add(new MobileTariff("Granny", MobileTariffType.SOCIAL, 330, 5.0, 35));
        mobileTariffs.add(new MobileTariff("GrannyLight", MobileTariffType.SOCIAL, 1090, 0.0, 0));

        MobileTariffService mobileTariffService = new MobileTariffService(mobileTariffs);

        System.out.println("Общее количество клиентов мобильнои компании : " + mobileTariffService.calculateQuantityOfUsers());

        System.out.println("Список тарифов до сортировки по размеру абонентскои платы : " + mobileTariffs);
        System.out.println();

        ArrayList<MobileTariff> sortedBySubscriptionFee = mobileTariffService.sortBySubscriptionFee();
        System.out.println("Список тарифов отсортированных по размеру абонентскои платы : " + sortedBySubscriptionFee);
        System.out.println();

        ArrayList<MobileTariff> filteredByType = mobileTariffService.findAllByType(mobileTariffTypeToFilter);
        System.out.println("Список мобильных тарифов с типом, заданным пользователем : " + filteredByType);
        System.out.println();

        ArrayList<MobileTariff> filteredBySubscriptionFee = mobileTariffService.findAllBySubscriptionFee(subscriptionFeeToFilter);
        System.out.println("Список мобильных тарифов с абонементскои платои <= заданнои пользователем : " + filteredBySubscriptionFee);
        System.out.println();

        ArrayList<MobileTariff> filteredByInternetTrafficVolume = mobileTariffService.findInternetTrafficVolume(internetTrafficVolumeToFilter);
        System.out.println("Список мобильных тарифов с объемом интернет-траффика >= заданного пользователем : " + filteredByInternetTrafficVolume);
        System.out.println();

    }
}
