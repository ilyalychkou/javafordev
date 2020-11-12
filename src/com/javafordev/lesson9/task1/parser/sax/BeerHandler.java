package com.javafordev.lesson9.task1.parser.sax;

import com.javafordev.lesson9.task1.model.beer_shop.beer.Beer;
import com.javafordev.lesson9.task1.model.beer_shop.beer.BeerOrder;
import com.javafordev.lesson9.task1.model.beer_shop.beer.Bottling;
import com.javafordev.lesson9.task1.model.beer_shop.beer.Char;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class BeerHandler extends DefaultHandler {

    private List<Beer> beerList = null;
    private List<String> listOfIngredients = null;
    private BeerOrder beerOrder = null;
    private Char beerChar = null;
    private Bottling bottling = null;
    private Beer beer = null;
    private StringBuffer data = null;
    private String stringForTns = "tns:";

    private boolean bName = false;
    private boolean bType = false;
    private boolean bAlcohol = false;
    private boolean bManufacter = false;
    private boolean bQuantity = false;
    private boolean bIngredient = false;
    private boolean bContent = false;
    private boolean bTransparency = false;
    private boolean bFiltered = false;
    private boolean bNutrition = false;
    private boolean bVolume = false;
    private boolean bMaterial = false;

    public void startDocument() {
        System.out.println("Start parsing...");
    }

    public void endDocument() {
        System.out.println("End parsing...");
    }

    public void startElement(String uri, String localName,
                             String qName, Attributes attributes) {
        initElementsForParsing(qName, attributes);
    }

    public void endElement(String uri, String localName, String qName) {
        setValuesForObject(qName);
    }

    public void characters(char ch[], int start, int length) {
        data.append(new String(ch, start, length));
    }

    public void initElementsForParsing(String qName, Attributes attributes) {
        if (qName.equalsIgnoreCase(stringForTns + "Beer")) {
            String article = attributes.getValue("article");
            beer = new Beer();
            beer.setArticle(Integer.parseInt(article));
            if (beerList == null) {
                beerList = new ArrayList<>();
            }
            if (listOfIngredients == null) {
                listOfIngredients = new ArrayList<>();
            }
            if (beerChar == null) {
                beerChar = new Char();
            }

            if (bottling == null) {
                bottling = new Bottling();
            }

        } else if (qName.equalsIgnoreCase(stringForTns + "name")) {
            bName = true;
        } else if (qName.equalsIgnoreCase(stringForTns + "type")) {
            bType = true;
        } else if (qName.equalsIgnoreCase(stringForTns + "alcohol")) {
            bAlcohol = true;
        } else if (qName.equalsIgnoreCase(stringForTns + "manufacter")) {
            bManufacter = true;
        } else if (qName.equalsIgnoreCase(stringForTns + "quantity")) {
            bQuantity = true;
        } else if (qName.equalsIgnoreCase(stringForTns + "ingredient")) {
            bIngredient = true;
        } else if (qName.equalsIgnoreCase(stringForTns + "content")) {
            bContent = true;
        } else if (qName.equalsIgnoreCase(stringForTns + "transparency")) {
            bTransparency = true;
        } else if (qName.equalsIgnoreCase(stringForTns + "filtered")) {
            bFiltered = true;
        } else if (qName.equalsIgnoreCase(stringForTns + "nutrition")) {
            bNutrition = true;
        } else if (qName.equalsIgnoreCase(stringForTns + "volume")) {
            bVolume = true;
        } else if (qName.equalsIgnoreCase(stringForTns + "material")) {
            bMaterial = true;
        }

        data = new StringBuffer();
    }

    public void setValuesForObject(String qName) {
        if (bName) {
            beer.setName(data.toString());
            bName = false;
        } else if (bType) {
            beer.setType(data.toString());
            bType = false;
        } else if (bAlcohol) {
            beer.setAlcohol(Boolean.valueOf(data.toString()));
            bAlcohol = false;
        } else if (bManufacter) {
            beer.setManufacter(data.toString());
            bManufacter = false;
        } else if (bQuantity) {
            beer.setQuantity(Integer.valueOf(data.toString()));
            bQuantity = false;
        } else if (bIngredient) {
            listOfIngredients.add(data.toString());
            beer.setIngredient(listOfIngredients);
            bIngredient = false;
        } else if (bContent) {
            beerChar.setContent(Double.valueOf(data.toString()));
            bContent = false;
        } else if (bTransparency) {
            beerChar.setTransparency(data.toString());
            bTransparency = false;
        } else if (bFiltered) {
            beerChar.setFiltered(Boolean.valueOf(data.toString()));
            bFiltered = false;
        } else if (bNutrition) {
            beerChar.setNutrition(Integer.valueOf(data.toString()));
            bNutrition = false;
        } else if (bVolume) {
            bottling.setVolume(Double.valueOf(data.toString()));
            bVolume = false;
        } else if (bMaterial) {
            bottling.setMaterial(data.toString());
            bMaterial = false;
        }

        if (qName.equalsIgnoreCase(stringForTns + "Beer")) {
            beerChar.setBottling(bottling);
            beer.setChar(beerChar);
            beerList.add(beer);
            listOfIngredients = null;
            beerChar=null;
            bottling=null;
        }
    }

    public List<Beer> getBeerList() {
        return beerList;
    }

    public BeerOrder generateBeerOrder(List<Beer> beerList) {
        return new BeerOrder(beerList);
    }
}

