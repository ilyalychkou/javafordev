package com.javafordev.lesson6.task6.runners;

import com.javafordev.lesson6.task6.constants.MobileTariffType;
import com.javafordev.lesson6.task6.constants.UserConstants;
import com.javafordev.lesson6.task6.objects.MobileTariff;
import com.javafordev.lesson6.task6.services.MobileTariffImplService;
import com.javafordev.lesson6.task6.utils.MobileTariffCommandLineUtils;

import java.util.ArrayList;
import java.util.List;

public class MobileTariffRunner {

    public static void main(String[] args) {

        System.out.println(MobileTariffType.valueOf("FOR_SMARTPHONE").getMobileTariffName());
        System.out.println("$%^&*()_(*&^%$%^&*()_");

        MobileTariffCommandLineUtils.inputParameterForMobileOperatorService();

        MobileTariffType mobileTariffTypeToFilter = UserConstants.getMobileTariffType();
        double subscriptionFeeToFilter = UserConstants.getMobileTariffSubscriptionFee();
        int internetTrafficVolumeToFilter = UserConstants.getMobileTariffInternetTrafficVolume();

        List<MobileTariff> mobileTariffs = new ArrayList<>();
        mobileTariffs.add(new MobileTariff("Start", MobileTariffType.FOR_SMARTPHONE, 1500, 7.5, 750));
        mobileTariffs.add(new MobileTariff("Turbo", MobileTariffType.FOR_SMARTPHONE, 345, 21.3, 5000));
        mobileTariffs.add(new MobileTariff("School", MobileTariffType.FOR_CHILDREN, 560, 5.8, 50));
        mobileTariffs.add(new MobileTariff("Eureka", MobileTariffType.FOR_CHILDREN, 250, 12.2, 1000));
        mobileTariffs.add(new MobileTariff("Granny", MobileTariffType.SOCIAL, 330, 5.0, 35));
        mobileTariffs.add(new MobileTariff("GrannyLight", MobileTariffType.SOCIAL, 1090, 0.0, 0));

        MobileTariffImplService mobileTariffService = new MobileTariffImplService(mobileTariffs);

        System.out.println("Общее количество клиентов мобильнои компании : " + mobileTariffService.calculateQuantityOfUsers());

        System.out.println("Список тарифов до сортировки по размеру абонентскои платы : " + mobileTariffs);
        System.out.println();

        List<MobileTariff> sortedBySubscriptionFee = mobileTariffService.sortBySubscriptionFee();
        System.out.println("Список тарифов отсортированных по размеру абонентскои платы : " + sortedBySubscriptionFee);
        System.out.println();

        List<MobileTariff> filteredByType = mobileTariffService.findAllByType(mobileTariffTypeToFilter);
        System.out.println("Список мобильных тарифов с типом, заданным пользователем : " + filteredByType);
        System.out.println();

        List<MobileTariff> filteredBySubscriptionFee = mobileTariffService.findAllBySubscriptionFee(subscriptionFeeToFilter);
        System.out.println("Список мобильных тарифов с абонементскои платои <= заданнои пользователем : " + filteredBySubscriptionFee);
        System.out.println();

        List<MobileTariff> filteredByInternetTrafficVolume = mobileTariffService.findInternetTrafficVolume(internetTrafficVolumeToFilter);
        System.out.println("Список мобильных тарифов с объемом интернет-траффика >= заданного пользователем : " + filteredByInternetTrafficVolume);
        System.out.println();

    }
}
