package com.javafordev.lesson9.task1.parser.dom;

import com.javafordev.lesson9.task1.model.beer_shop.beer.Beer;
import com.javafordev.lesson9.task1.model.beer_shop.beer.Bottling;
import com.javafordev.lesson9.task1.model.beer_shop.beer.Char;
import org.apache.commons.lang3.math.NumberUtils;
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
import java.util.List;

public class DomUtil {

    static List<String> generateListOfIngredients(Node beerNode) throws ParserConfigurationException, IOException, SAXException {

        String pathToXML = "/Users/Admin/Documents/javafordev/src/com/javafordev/lesson9/task1/data/beer.xml";
        File file = new File(pathToXML);
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        List<String> ingredients = new ArrayList<>();

        documentBuilderFactory.setNamespaceAware(true);
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(file);
        NodeList nodeList = document.getDocumentElement().getElementsByTagNameNS("*", "ingredient");

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            Element eElement = (Element) node;
            if (eElement.getNodeName().equals("ingredient")) {
                ingredients.add(beerNode.getChildNodes().item(i).getTextContent());
            }
        }
        return ingredients;
    }

    static Beer parseBeerObject(List<String> listOfIngredients, Element beerElement, String article) {

        Beer beer;
        String elementTextContentForVolume = getElementTextContent(beerElement, "volume");
        String elementTextContentForContent = getElementTextContent(beerElement,  "content");
        if ((NumberUtils.isCreatable(elementTextContentForVolume)) && (NumberUtils.isCreatable(elementTextContentForContent))) {
            Double value = Double.valueOf(elementTextContentForVolume);
            String material = getElementTextContent(beerElement, "material");
            Bottling bottling = new Bottling(value, material);
            Double content = Double.valueOf(elementTextContentForContent);
            Integer nutrition = Integer.valueOf(getElementTextContent(beerElement, "nutrition"));
            String transparency = getElementTextContent(beerElement, "transparency");
            Boolean iSFiltered = Boolean.valueOf(getElementTextContent(beerElement, "filtered"));
            Char beerChar = new Char(content, transparency, iSFiltered, nutrition, bottling);
            beer = new Beer(
                    getElementTextContent(beerElement, "name"),
                    getElementTextContent(beerElement, "type"),
                    Boolean.parseBoolean(getElementTextContent(beerElement, "alcohol")),
                    getElementTextContent(beerElement, "manufacter"),
                    Integer.parseInt(getElementTextContent(beerElement, "quantity")),
                    listOfIngredients,
                    beerChar,
                    Integer.valueOf(article));
        } else {
            throw new NumberFormatException("Method getElementTextContent() return not a number for number element");
        }
        return beer;
    }

    public static String getElementTextContent(Element element, String elementName) {
        NodeList nList = element.getElementsByTagNameNS("*", elementName);
        nList.getLength();
        Node node = nList.item(0);
        String textContent = node.getTextContent();
        return textContent;
    }

}
