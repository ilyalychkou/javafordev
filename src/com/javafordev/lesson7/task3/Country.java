package com.javafordev.lesson7.task3;

import java.util.List;

public class Country {

    private String name;
    private List<Region> regions;
    private List<City> cities;

    public Country(String countryName, List<Region> regions, List<City> cities) {
        this.name = countryName;
        this.regions = regions;
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + name + '\'' +
                ", regions=" + regions +
                ", cities=" + cities +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
