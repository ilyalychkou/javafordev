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

import static com.javafordev.lesson9.task1.parser.dom.DomUtil.TNS;

public class DomStrategy implements ParsingStrategy {

    @Override
    public BeerOrder parseXML(String pathToXML) throws ParserConfigurationException, IOException, SAXException {

        List<Beer> beerList = new ArrayList<>();

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.parse(new File(pathToXML));

        Element rootElement = document.getDocumentElement();
        NodeList beerNodeList = rootElement.getElementsByTagName(TNS + "Beer");

        for (int i = 0; i < beerNodeList.getLength(); i++) {
            Node beerNode = beerNodeList.item(i);
            Element beerElement = (Element) beerNode;
            String article = ((Element) beerNode).getAttribute("article");
            List<String> listOfIngredients = DomUtil.generateListOfIngredients(TNS, beerNode);
            Beer beer = DomUtil.parseBeerObject(listOfIngredients, TNS, beerElement, article);
            beerList.add(beer);
        }

        beerList.sort(new BeerComparator());

        return new BeerOrder(beerList);


    }



}
