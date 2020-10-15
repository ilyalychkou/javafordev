package com.javafordev.lesson7.task3;

public class District {

    private String districtName;

    public District(String districtName) {
        this.districtName = districtName;
    }

    @Override
    public String toString() {
        return "District{" +
                "districtName='" + districtName + '\'' +
                '}';
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }
}
