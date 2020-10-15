package com.javafordev.lesson7.task3;

public class City {

    private String cityName;
    private CityType cityType;

    public City(String cityName, CityType cityType) {
        this.cityName = cityName;
        this.cityType = cityType;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        if (cityName != null ? !cityName.equals(city.cityName) : city.cityName != null) return false;
        return cityType == city.cityType;
    }

    @Override
    public int hashCode() {
        int result = cityName != null ? cityName.hashCode() : 0;
        result = 31 * result + (cityType != null ? cityType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", cityType=" + cityType +
                '}';
    }

    public City(String cityName, Region regionOfCity, CityType cityType) {
        this.cityName = cityName;
        this.cityType = cityType;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public CityType getCityType() {
        return cityType;
    }

    public void setCityType(CityType cityType) {
        this.cityType = cityType;
    }

}
