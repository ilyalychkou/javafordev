package com.javafordev.lesson6.task6.objects.travel.options;

public enum Nutrition {

    ALL_INCLUSIVE("all_inclusive"),
    BREAKFAST("breakfast"),
    BREAKFAST_AND_SUPPER("breakfast_and_supper");

    private final String nutritionName;

    Nutrition(String nutritionTypeName) {
        this.nutritionName = nutritionTypeName;
    }

    public String getNutritionName() {
        return nutritionName;
    }
}
