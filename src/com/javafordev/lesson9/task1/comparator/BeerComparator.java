package com.javafordev.lesson9.task1.comparator;

import com.javafordev.lesson9.task1.model.beer_shop.beer.Beer;

import java.util.Comparator;

public class BeerComparator implements Comparator<Beer> {

    @Override
    public int compare(Beer o1, Beer o2) {
        return o1.getArticle() - o2.getArticle();
    }
}
