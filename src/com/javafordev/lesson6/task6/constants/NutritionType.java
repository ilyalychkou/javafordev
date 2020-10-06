package com.javafordev.lesson6.task6.constants;

public enum NutritionType {

    ALL_INCLUSIVE("all_inclusive"),
    BREAKFAST("breakfast"),
    BREAKFAST_AND_SUPPER("breakfast_and_supper");

    private final String nutritionTypeName;

    NutritionType(String nutritionTypeName) {
        this.nutritionTypeName = nutritionTypeName;
    }

    public String getNutritionTypeName() {
        return nutritionTypeName;
    }
}
