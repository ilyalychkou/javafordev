package com.javafordev.lesson9.task1.parser.dom;

import com.javafordev.lesson9.task1.comparator.BeerComparator;
import com.javafordev.lesson9.task1.model.beer_shop.beer.Beer;
import com.javafordev.lesson9.task1.model.beer_shop.beer.BeerOrder;
import com.javafordev.lesson9.task1.parser.ParsingStrategy;
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

public class DomStrategy implements ParsingStrategy {

    @Override
    public BeerOrder parseXML(String pathToXML) throws ParserConfigurationException, IOException, SAXException {

        List<Beer> beerList = new ArrayList<>();

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setNamespaceAware(true);
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(new File(pathToXML));

        NodeList beerNodeList = document.getDocumentElement().getElementsByTagNameNS("*", "Beer");

        for (int i = 0; i < beerNodeList.getLength(); i++) {
            Node beerNode = beerNodeList.item(i);
            Element beerElement = (Element) beerNode;
            String article = ((Element) beerNode).getAttribute("article");
            List<String> listOfIngredients = DomUtil.generateListOfIngredients(beerNode);
            Beer beer = DomUtil.parseBeerObject(listOfIngredients, beerElement, article);
            beerList.add(beer);
        }
        beerList.sort(new BeerComparator());
        return new BeerOrder(beerList);
    }

}
