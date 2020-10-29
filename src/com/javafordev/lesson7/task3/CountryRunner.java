package com.javafordev.lesson7.task3;

import java.util.List;

/**
 * Создать объект класса Государство, используя классы Область, Район, Город.
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

public class CountryRunner {

    public static void main(String[] args) {

        List<City> logoiskDistrictCities = List.of(
        new City("Вяча", "Минская", "Логойский", false, false),
        new City("Дубница", "Минская", "Логойский", false, false));

        List<City> slutskDistrictCities = List.of(
        new City("Замостье", "Минская", "Слуцкий", false, false),
        new City("Весея", "Минская", "Слуцкий", false, false));

        List<City> pinskDistrictCities = List.of(
        new City("Логишин", "Минская", "Слуцкий", false, false),
        new City("Рудка", "Минская", "Слуцкий", false, false));

        List<City> baranovichiDistrictCities = List.of(
        new City("Вольно", "Брестская", "Барановичский", false, false),
        new City("Ишколдь", "Брестский", "Барановичский", false, false));

        List<City> volkovyskDistrictCities = List.of(
        new City("Араны", "Гродненская", "Волковысский", false, false),
        new City("Бобры", "Гродненская", "Волковысский", false, false));

        List<City> lidaDistrictCities = List.of(
        new City("Пацуки", "Гродненская", "Лидский", false, false),
        new City("Ямонты", "Гродненская", "Лидский", false, false));

        List<District> minskDistricts = List.of(
        new District("Логоиский", "Минская", logoiskDistrictCities),
        new District("Слуцкий", "Минская", slutskDistrictCities));

        List<District> brestDistricts = List.of(
        new District("Пинский", "Брестская", pinskDistrictCities),
        new District("Барановичский", "Брестская", baranovichiDistrictCities));

        List<District> grodnoDistricts = List.of(
        new District("Волковыский", "Гродненская",volkovyskDistrictCities ),
        new District("Лидский", "Гродненская", lidaDistrictCities));

        List<City> minskRegionCities = List.of(
        new City("Минск", "Минская", "Минский", true, true),
        new City("Логоиск", "Минская", "Логойский", false, false));

        List<City> brestRegionCities = List.of(
        new City("Береза", "Брестская", "Поставы", false, false),
        new City("Брест", "Брестская", "Брестский", false, true));

        List<City> grodnoRegionCities = List.of(
        new City("Гродно", "Гродненская", "Гродненский", false, true),
        new City("Зельва", "Гродненская", "Зельвенский", false, false));

        List<Region> countryRegions = List.of(
        new Region("Минская", 40.2, minskDistricts, minskRegionCities),
        new Region("Брестская", 32.8, brestDistricts, brestRegionCities),
        new Region("Гродненская", 25.1, grodnoDistricts, grodnoRegionCities));

        List<City> cities = List.of(
        new City("Минск", "Минская", "Минский", true, true),
        new City("Гродно", "Гродненская", "Гродненский", false, true),
        new City("Брест", "Брестская", "Брестский", false, true),
        new City("Зельва", "Гродненская", "Зельвенский", false, false),
        new City("Логоиск", "Минская", "Логойский", false, false),
        new City("Береза", "Брестская", "Поставы", false, false));

        Country country = new Country("Беларусь", countryRegions, cities);

        System.out.println("Вывод инфо о государстве " + country.getName());
        System.out.println();
        CountryUtils.printInfoAboutCapital(country);
        CountryUtils.printInfoAboutRegions(country);
        System.out.println("Площадь государства " + country.getName() + " составляет " + CountryUtils.calculateArea(country));
        System.out.println();
        CountryUtils.printInfoAboutRegionCenters(country);

    }
}
