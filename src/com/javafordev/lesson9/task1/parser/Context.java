package com.javafordev.lesson9.task1.parser;

import com.javafordev.lesson9.task1.model.beer_shop.beer.BeerOrder;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;

public class Context {

    private ParsingStrategy parsingStrategy;

    public Context(ParsingStrategy parsingStrategy) {
        this.parsingStrategy = parsingStrategy;
    }

    public BeerOrder contextInterface(String pathToXML) throws IOException, SAXException, ParserConfigurationException, XMLStreamException {
        return parsingStrategy.parseXML(pathToXML);
    }

}
