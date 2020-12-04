package com.javafordev.lesson9.task1;

import com.javafordev.lesson9.task1.model.beer_shop.beer.Beer;
import com.javafordev.lesson9.task1.model.beer_shop.beer.BeerOrder;
import com.javafordev.lesson9.task1.model.beer_shop.beer.Bottling;
import com.javafordev.lesson9.task1.model.beer_shop.beer.Char;

import java.util.ArrayList;
import java.util.List;

public class TestUtil {

    public static BeerOrder generateTestBeerOrder() {
        List<Beer> beerList = new ArrayList<>();

        Beer beerOne = new Beer();
        Bottling bottlingOne = new Bottling(5.0, "Plastic");
        Char beerCharOne = new Char();
        beerCharOne.setContent(6.5);
        beerCharOne.setTransparency("25.0%");
        beerCharOne.setFiltered(false);
        beerCharOne.setNutrition(66);
        beerCharOne.setBottling(bottlingOne);

        List<String> listOfIngredientsOne = new ArrayList<>();
        listOfIngredientsOne.add("Malt");
        listOfIngredientsOne.add("Water");
        listOfIngredientsOne.add("Hop");
        listOfIngredientsOne.add("Needles");

        beerOne.setArticle(543);
        beerOne.setName("Raw");
        beerOne.setType("Light");
        beerOne.setAlcohol(true);
        beerOne.setManufacter("Tuborg");
        beerOne.setIngredient(listOfIngredientsOne);
        beerOne.setQuantity(2500);
        beerOne.setChar(beerCharOne);

        Beer beerTwo = new Beer();
        Bottling bottlingTwo = new Bottling(0.33, "Glass");
        Char beerCharTwo = new Char();
        beerCharTwo.setContent(4.5);
        beerCharTwo.setTransparency("50.0%");
        beerCharTwo.setFiltered(true);
        beerCharTwo.setNutrition(43);
        beerCharTwo.setBottling(bottlingTwo);

        List<String> listOfIngredientsTwo = new ArrayList<>();
        listOfIngredientsTwo.add("Water");
        listOfIngredientsTwo.add("Malt");
        listOfIngredientsTwo.add("Hop");
        listOfIngredientsTwo.add("Sugar");

        beerTwo.setArticle(42467);
        beerTwo.setName("Porter And Sea");
        beerTwo.setType("Dark");
        beerTwo.setAlcohol(true);
        beerTwo.setManufacter("Alivaria");
        beerTwo.setIngredient(listOfIngredientsTwo);
        beerTwo.setQuantity(500);
        beerTwo.setChar(beerCharTwo);


        Beer beerThree = new Beer();
        Bottling bottlingThree = new Bottling(0.5, "Tin");

        Char beerCharThree = new Char();
        beerCharThree.setContent(3.5);
        beerCharThree.setTransparency("55.0%");
        beerCharThree.setFiltered(true);
        beerCharThree.setNutrition(20);
        beerCharThree.setBottling(bottlingThree);

        List<String> listOfIngredientsThree = new ArrayList<>();
        listOfIngredientsThree.add("Water");
        listOfIngredientsThree.add("Malt");
        listOfIngredientsThree.add("Hop");
        listOfIngredientsThree.add("Lemon");


        beerThree.setArticle(395672);
        beerThree.setName("Koronet");
        beerThree.setType("Light");
        beerThree.setAlcohol(false);
        beerThree.setManufacter("Lidskoe");
        beerThree.setIngredient(listOfIngredientsThree);
        beerThree.setQuantity(2000);
        beerThree.setChar(beerCharThree);

        beerList.add(beerOne);
        beerList.add(beerTwo);
        beerList.add(beerThree);

        System.out.println(beerList);

        return new BeerOrder(beerList);
    }
}
