package com.javafordev.lesson9.task1.parser;

import com.javafordev.lesson9.task1.model.beer_shop.beer.BeerOrder;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;

public interface ParsingStrategy {

    BeerOrder parseXML(String pathToXML) throws ParserConfigurationException, IOException, SAXException, XMLStreamException;
}
