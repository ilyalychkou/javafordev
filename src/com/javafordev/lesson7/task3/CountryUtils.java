package com.javafordev.lesson7.task3;

import java.util.List;

public class CountryUtils {

    public static void printInfoAboutCapital(Country country) {
        List<City> cities = country.getCities();
        for (City city : cities) {
            if (city.getCityType().equals(CityType.CAPITAL)) {
                System.out.println(city.getCityName() + " - столица государства " + country.getCountryName());
            }

        }
    }


    public static void printInfoAboutRegions(Country country) {
        System.out.println(country.getCountryName() + " состоит из  " + country.getRegions().size() + " областеи");
    }

    public static void printInfoAboutRegionCenters(Country country) {
        System.out.println("Областными центрами государства " + country.getCountryName() + " являются: ");
        List<City> cities = country.getCities();
        for (City city : cities) {
            if (city.getCityType().equals(CityType.REGION_CENTER) || city.getCityType().equals(CityType.CAPITAL)) {
                System.out.println(city.getCityName() + " областнои центр");
            }
        }
    }

    public static double calculateArea(Country country) {
        double countryArea = 0;
        List<Region> regions = country.getRegions();
        for (Region region : regions) {
            countryArea += region.getRegionArea();
        }
        return countryArea;
    }

}

