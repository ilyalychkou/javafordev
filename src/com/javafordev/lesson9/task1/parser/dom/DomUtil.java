package com.javafordev.lesson9.task1.parser.dom;

import com.javafordev.lesson9.task1.model.beer_shop.beer.Beer;
import com.javafordev.lesson9.task1.model.beer_shop.beer.Bottling;
import com.javafordev.lesson9.task1.model.beer_shop.beer.Char;
import org.apache.commons.lang3.math.NumberUtils;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

public class DomUtil {

    public static final String TNS = "tns:";

    static List<String> generateListOfIngredients(String stringForTns, Node beerNode) {
        List<String> ingredients = new ArrayList<>();
        int beerNodeLength = beerNode.getChildNodes().getLength();
        for (int i = 0; i < beerNodeLength; i++) {
            if ((beerNode.getChildNodes().item(i).getNodeName()).equals(stringForTns + "ingredient")) {
                ingredients.add(beerNode.getChildNodes().item(i).getTextContent());
            }
        }
        return ingredients;
    }

    static Beer parseBeerObject(List<String> listOfIngredients, String stringForTns, Element beerElement, String article) {

        Beer beer;
        String elementTextContentForVolume = getElementTextContent(beerElement, stringForTns + "volume");
        String elementTextContentForContent = getElementTextContent(beerElement, stringForTns + "content");
        if ((NumberUtils.isCreatable(elementTextContentForVolume)) && (NumberUtils.isCreatable(elementTextContentForContent))) {
            Double value = Double.valueOf(elementTextContentForVolume);
            String material = getElementTextContent(beerElement, stringForTns + "material");
            Bottling bottling = new Bottling(value, material);
            Double content = Double.valueOf(elementTextContentForContent);
            Integer nutrition = Integer.valueOf(getElementTextContent(beerElement, stringForTns + "nutrition"));
            String transparency = getElementTextContent(beerElement, stringForTns + "transparency");
            Boolean iSFiltered = Boolean.valueOf(getElementTextContent(beerElement, stringForTns + "filtered"));
            Char beerChar = new Char(content, transparency, iSFiltered, nutrition, bottling);
            beer = new Beer(
                    getElementTextContent(beerElement, stringForTns + "name"),
                    getElementTextContent(beerElement, stringForTns + "type"),
                    Boolean.parseBoolean(getElementTextContent(beerElement, stringForTns + "alcohol")),
                    getElementTextContent(beerElement, stringForTns + "manufacter"),
                    Integer.parseInt(getElementTextContent(beerElement, stringForTns + "quantity")),
                    listOfIngredients,
                    beerChar,
                    Integer.valueOf(article));
        } else {
            throw new NumberFormatException("Method getElementTextContent() return not a number for number element");
        }
        return beer;
    }

    public static String getElementTextContent(Element element, String elementName) {
        NodeList nList = element.getElementsByTagName(elementName);
        nList.getLength();
        Node node = nList.item(0);
        String textContent = node.getTextContent();
        return textContent;
    }


}
