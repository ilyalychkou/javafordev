package com.javafordev.lesson9.task1.runner;

import com.javafordev.lesson9.task1.model.beer_shop.beer.BeerOrder;
import com.javafordev.lesson9.task1.parser.sax.SAXUtil;

public class SAXBeerParserRunner {

    public static void main(String[] args) {
        String pathToXML = "/Users/Admin/Documents/javafordev/src/com/javafordev/lesson9/task1/data/beer.xml";
        BeerOrder beerOrder = SAXUtil.parseXMLToInitializeObject(pathToXML);
        System.out.println(beerOrder);
    }

}
