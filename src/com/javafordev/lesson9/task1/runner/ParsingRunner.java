package com.javafordev.lesson9.task1.runner;

import com.javafordev.lesson9.task1.model.beer_shop.beer.BeerOrder;
import com.javafordev.lesson9.task1.parser.Context;
import com.javafordev.lesson9.task1.parser.dom.DomStrategy;
import com.javafordev.lesson9.task1.parser.sax.SAXStrategy;
import com.javafordev.lesson9.task1.parser.stax.StAXStrategy;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;

public class ParsingRunner {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, XMLStreamException {
        String pathToXML = "/Users/Admin/Documents/javafordev/src/com/javafordev/lesson9/task1/data/beer.xml";

        DomStrategy domStrategy = new DomStrategy();
        Context domContext = new Context(domStrategy);
        BeerOrder beerOrderByDom = domContext.contextInterface(pathToXML);
        System.out.println(beerOrderByDom);

        SAXStrategy saxStrategy = new SAXStrategy();
        Context saxContext = new Context(saxStrategy);
        BeerOrder beerOrderBySax = saxContext.contextInterface(pathToXML);
        System.out.println(beerOrderBySax);

        StAXStrategy stAXStrategy = new StAXStrategy();
        Context contextByStAX = new Context(stAXStrategy);
        BeerOrder beerOrderByStAX = contextByStAX.contextInterface(pathToXML);
        System.out.println(beerOrderByStAX);

    }


}
