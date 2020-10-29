package com.javafordev.lesson7.task3;

public class City {

    private String name;
    private String region;
    private String district;
    private boolean isCapital;
    private boolean isRegionCenter;

    public City(String name, String region, String district, boolean isCapital, boolean isRegionCenter) {
        this.name = name;
        this.region = region;
        this.district = district;
        this.isCapital = isCapital;
        this.isRegionCenter = isRegionCenter;
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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public boolean isRegionCenter() {
        return isRegionCenter;
    }

    public void setRegionCenter(boolean regionCenter) {
        isRegionCenter = regionCenter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        if (isCapital != city.isCapital) return false;
        if (isRegionCenter != city.isRegionCenter) return false;
        if (name != null ? !name.equals(city.name) : city.name != null) return false;
        if (region != null ? !region.equals(city.region) : city.region != null) return false;
        return district != null ? district.equals(city.district) : city.district == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (isCapital ? 1 : 0);
        result = 31 * result + (isRegionCenter ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return name;
    }
}
