package com.javafordev.lesson7.task3;

import java.util.List;

public class Region {

    private String name;
    private double area;
    private List<District> districts;
    private List<City> cities;

    public Region(String name, double area, List<District> districts, List<City> cities) {
        this.name = name;
        this.area = area;
        this.districts = districts;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
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

        Region region = (Region) o;

        if (Double.compare(region.area, area) != 0) return false;
        if (name != null ? !name.equals(region.name) : region.name != null) return false;
        if (districts != null ? !districts.equals(region.districts) : region.districts != null) return false;
        return cities != null ? cities.equals(region.cities) : region.cities == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(area);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (districts != null ? districts.hashCode() : 0);
        result = 31 * result + (cities != null ? cities.hashCode() : 0);
        return result;
    }


}
