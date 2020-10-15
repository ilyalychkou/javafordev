package com.javafordev.lesson7.task3;

import java.util.List;

public class Region {

    private String regionName;
    private double regionArea;
    private List<District> districts;

    public Region(String regionName, double regionArea, List<District> districts) {
        this.regionName = regionName;
        this.regionArea = regionArea;
        this.districts = districts;
    }

    @Override
    public String toString() {
        return "Region{" +
                "regionName='" + regionName + '\'' +
                ", regionArea=" + regionArea +
                ", districts=" + districts +
                '}';
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public double getRegionArea() {
        return regionArea;
    }

    public void setRegionArea(double regionArea) {
        this.regionArea = regionArea;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }
}
