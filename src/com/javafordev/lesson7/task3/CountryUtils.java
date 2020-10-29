package com.javafordev.lesson7.task3;

import java.util.Optional;
import java.util.stream.Stream;

public class CountryUtils {

    public static void printInfoAboutCapital(Country country) {
        Optional<City> capital = CountryUtils.findCapital(country);
        System.out.println(capital + " - столица государства " + country.getName());
    }

    public static Optional<City> findCapital(Country country) {
        return country.getCities().stream().filter(City::isCapital).findFirst();
    }

    public static void printInfoAboutRegions(Country country) {
        System.out.println(country.getName() + " состоит из  " + country.getRegions().size() + " областеи");
    }

    public static void printInfoAboutRegionCenters(Country country) {
        System.out.println("Областными центрами государства " + country.getName() + " являются: ");
        Stream<City> regionCenters = CountryUtils.findRegionCenters(country);
        regionCenters.forEach(System.out::println);
    }

    public static Stream<City> findRegionCenters(Country country) {
        return country.getCities().stream().filter(City::isRegionCenter);
    }

    public static double calculateArea(Country country) {
        return country.getRegions().stream().mapToDouble(Region::getArea).sum();
    }

}

