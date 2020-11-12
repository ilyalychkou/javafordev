package com.javafordev.lesson9.task1.runner;

import com.javafordev.lesson9.task1.model.beer_shop.beer.BeerOrder;
import com.javafordev.lesson9.task1.parser.stax.StAXUtil;
import org.apache.log4j.BasicConfigurator;

import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;

public class StAXBeerParserRunner {

    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        BasicConfigurator.configure();
        String pathToXML = "/Users/Admin/Documents/javafordev/src/com/javafordev/lesson9/task1/data/beer.xml";
        BeerOrder beerOrder = StAXUtil.parseXMLToInitializeObject(pathToXML);
        System.out.println(beerOrder);
    }

}

