package com.javafordev.lesson7.task3;

import java.util.ArrayList;
import java.util.List;

/**
 *  Создать объект класса Государство, используя классы Область, Район, Город.
 *  Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 *
 */

public class CountryRunner {

    public static void main(String[] args) {

        List<District> minskDistricts = new ArrayList<>();
        minskDistricts.add(new District("Логоиски"));
        minskDistricts.add(new District("Слуцкии"));
        minskDistricts.add(new District("Волковыскии"));

        List<District> brestDistricts = new ArrayList<>();
        brestDistricts.add(new District("Пинскии"));
        brestDistricts.add(new District("Барановичскии"));
        brestDistricts.add(new District("Кобринскии"));

        List<District> grodnoDistricts = new ArrayList<>();
        grodnoDistricts.add(new District("Волковыскии"));
        grodnoDistricts.add(new District("Лидскии"));
        grodnoDistricts.add(new District("Новогрудскии"));

        List<Region> countryRegions = new ArrayList<>();
        countryRegions.add(new Region("Минская", 40.2, minskDistricts));
        countryRegions.add(new Region("Брестская", 32.8, brestDistricts));
        countryRegions.add(new Region("Гродненская", 25.1, grodnoDistricts));

        List<City> cities = new ArrayList<>();
        cities.add(new City("Минск", CityType.CAPITAL));
        cities.add(new City("Гродно", CityType.REGION_CENTER));
        cities.add(new City("Брест", CityType.REGION_CENTER));
        cities.add(new City("Зельва", CityType.TOWN));
        cities.add(new City("Логоиск", CityType.TOWN));

        Country country = new Country("Беларусь", countryRegions, cities);

        System.out.println("Вывод инфо о государстве " + country.getCountryName());
        System.out.println();
        CountryUtils.printInfoAboutCapital(country);
        CountryUtils.printInfoAboutRegions(country);
        System.out.println("Пложащь государства " + country.getCountryName() + " составляет "  + CountryUtils.calculateArea(country));
        System.out.println();
        CountryUtils.printInfoAboutRegionCenters(country);

    }
}
