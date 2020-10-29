package com.javafordev.lesson7.task3;

import java.util.List;

public class District {

    private String name;
    private String region;
    private List<City> cities;

    public District(String name, String region, List<City> cities) {
        this.name = name;
        this.region = region;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        District district = (District) o;

        if (name != null ? !name.equals(district.name) : district.name != null) return false;
        if (region != null ? !region.equals(district.region) : district.region != null) return false;
        return cities != null ? cities.equals(district.cities) : district.cities == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (cities != null ? cities.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "District{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", cities=" + cities +
                '}';
    }
}
