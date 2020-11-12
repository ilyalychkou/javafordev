package com.javafordev.lesson9.task1.parser.dom;

import com.javafordev.lesson9.task1.comparator.BeerComparator;
import com.javafordev.lesson9.task1.model.beer_shop.beer.Beer;
import com.javafordev.lesson9.task1.model.beer_shop.beer.BeerOrder;
import com.javafordev.lesson9.task1.model.beer_shop.beer.Bottling;
import com.javafordev.lesson9.task1.model.beer_shop.beer.Char;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DomUtil {

    public static BeerOrder parseXMLToInitializeObject(String pathToXML) throws ParserConfigurationException, SAXException, IOException {

        List<Beer> beerList = new ArrayList<>();

        String stringForTns = "tns:";
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.parse(new File(pathToXML));

        Element rootElement = document.getDocumentElement();
        NodeList beerNodeList = rootElement.getElementsByTagName(stringForTns + "Beer");

        for (int i = 0; i < beerNodeList.getLength(); i++) {
            Node beerNode = beerNodeList.item(i);
            Element beerElement = (Element) beerNode;
            String article = ((Element) beerNode).getAttribute("article");
            List<String> listOfIngredients = generateListOfIngredients(stringForTns, beerNode);
            Beer beer = generateBeerObject(listOfIngredients, stringForTns, beerElement, article);
            beerList.add(beer);
        }

        Collections.sort(beerList, new BeerComparator());

        return new BeerOrder(beerList);
    }

    public static List<String> generateListOfIngredients(String stringForTns, Node beerNode) {
        List<String> ingredients = new ArrayList<>();
        int beerNodeLength = beerNode.getChildNodes().getLength();
        for (int i = 0; i < beerNodeLength; i++) {
            if ((beerNode.getChildNodes().item(i).getNodeName()).equals(stringForTns + "ingredient")) {
                ingredients.add(beerNode.getChildNodes().item(i).getTextContent());
            }
        }
        return ingredients;
    }

    public static Beer generateBeerObject(List<String> listOfIngredients, String stringForTns, Element beerElement, String article) {

        Double value = Double.valueOf(getElementTextContent(beerElement, stringForTns + "volume"));
        String material = getElementTextContent(beerElement, stringForTns + "material");
        Bottling bottling = new Bottling(value, material);
        Double content = Double.valueOf(getElementTextContent(beerElement, stringForTns + "content"));
        Integer nutrition = Integer.valueOf(getElementTextContent(beerElement, stringForTns + "nutrition"));
        String transparency = getElementTextContent(beerElement, stringForTns + "transparency");
        Boolean iSFiltered = Boolean.valueOf(getElementTextContent(beerElement, stringForTns + "filtered"));
        Char beerChar = new Char(content,transparency, iSFiltered, nutrition,bottling);
        return new Beer(
                getElementTextContent(beerElement, stringForTns + "name"),
                getElementTextContent(beerElement, stringForTns + "type"),
                Boolean.parseBoolean(getElementTextContent(beerElement, stringForTns + "alcohol")),
                getElementTextContent(beerElement, stringForTns + "manufacter"),
                Integer.parseInt(getElementTextContent(beerElement, stringForTns + "quantity")),
                listOfIngredients,
                beerChar,
                Integer.valueOf(article));
    }

    public static String getElementTextContent(Element element, String elementName) {
        NodeList nList = element.getElementsByTagName(elementName);
        nList.getLength();
        Node node = nList.item(0);
        String textContent = node.getTextContent();
        return textContent;
    }


}
