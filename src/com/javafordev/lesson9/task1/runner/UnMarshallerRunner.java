package com.javafordev.lesson9.task1.runner;

import com.javafordev.lesson9.task1.model.beer_shop.beer.Beer;
import com.javafordev.lesson9.task1.model.beer_shop.beer.BeerOrder;
import com.javafordev.lesson9.task1.parser.jaxb.UnMarshallerUtil;

import java.io.FileNotFoundException;
import java.util.List;

public class UnMarshallerRunner {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "/Users/Admin/Documents/javafordev/src/com/javafordev/lesson9/task1/data/beer.xml";
        BeerOrder beerOrder = UnMarshallerUtil.parseBeerOrder(path);
        System.out.println(beerOrder);
        List<Beer> beer = beerOrder.getBeer();
        System.out.println(beer.get(0).getIngredients().get(0));
        int size = beer.size();
        System.out.println(size);

    }
}
