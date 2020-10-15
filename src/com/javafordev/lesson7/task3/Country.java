package com.javafordev.lesson7.task3;

import java.util.List;

public class Country {

    private String countryName;
    private List<Region> regions;
    private List<City> cities;

    public Country(String countryName, List<Region> regions, List<City> cities) {
        this.countryName = countryName;
        this.regions = regions;
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", regions=" + regions +
                ", cities=" + cities +
                '}';
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
