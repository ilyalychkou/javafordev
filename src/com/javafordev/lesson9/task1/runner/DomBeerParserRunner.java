package com.javafordev.lesson9.task1.runner;

import com.javafordev.lesson9.task1.model.beer_shop.beer.BeerOrder;
import com.javafordev.lesson9.task1.parser.dom.DomUtil;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class DomBeerParserRunner {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        String pathToXML = "/Users/Admin/Documents/javafordev/src/com/javafordev/lesson9/task1/data/beer.xml";
        BeerOrder beerOrder = DomUtil.parseXMLToInitializeObject(pathToXML);
        System.out.println(beerOrder);
    }

}
