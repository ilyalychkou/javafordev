package com.javafordev.lesson9.task1;

import com.javafordev.lesson9.task1.model.beer_shop.beer.Beer;
import com.javafordev.lesson9.task1.model.beer_shop.beer.BeerOrder;
import com.javafordev.lesson9.task1.parser.Context;
import com.javafordev.lesson9.task1.parser.ParsingStrategy;
import com.javafordev.lesson9.task1.parser.dom.DomStrategy;
import com.javafordev.lesson9.task1.parser.sax.SAXStrategy;
import com.javafordev.lesson9.task1.parser.stax.StAXStrategy;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RunWith(JUnit4.class)
public class XMLParserTests {

    private ParsingStrategy strategy;
    private Context context;

    @Test
    public void testNameForFirstBeerByStAX() throws XMLStreamException, ParserConfigurationException, SAXException, IOException {
        String pathToXML = "/Users/Admin/Documents/javafordev/src/com/javafordev/lesson9/task1/data/beer.xml";
        strategy = new StAXStrategy();
        context = new Context(strategy);
        Beer beer = new Beer();
        beer.setName("Raw");
        List<Beer> beerList = new ArrayList<>();
        beerList.add(beer);
        BeerOrder expectedBeerOrder = new BeerOrder(beerList);
        String expectedNameForFirstBeer = expectedBeerOrder.getBeer().get(0).getName();
        BeerOrder actualBeerOrder = context.contextInterface(pathToXML);
        String actualNameForFirstBeer = actualBeerOrder.getBeer().get(0).getName();
        Assert.assertTrue("Имя 1-го пива в заказе не соответствует ожидаемому", expectedNameForFirstBeer.equals(actualNameForFirstBeer));
    }

    @Test
    public void testInitializeBeerOrderByStAX() throws XMLStreamException, IOException, SAXException, ParserConfigurationException {
        String pathToXML = "/Users/Admin/Documents/javafordev/src/com/javafordev/lesson9/task1/data/beer.xml";
        strategy = new StAXStrategy();
        context = new Context(strategy);
        BeerOrder expectedBeerOrder = TestUtil.generateTestBeerOrder();
        BeerOrder actualBeerOrderByStAX = context.contextInterface(pathToXML);
        Assert.assertTrue("Содержимое заказа пива не соответствует ожидаемому", expectedBeerOrder.equals(actualBeerOrderByStAX) );
    }


    @Test
    public void testInitializeBeerOrderByDom() throws XMLStreamException, IOException, SAXException, ParserConfigurationException {
        String pathToXML = "/Users/Admin/Documents/javafordev/src/com/javafordev/lesson9/task1/data/beer.xml";
        strategy = new DomStrategy();
        context = new Context(strategy);
        BeerOrder expectedBeerOrder = TestUtil.generateTestBeerOrder();
        BeerOrder actualBeerOrderByDom = context.contextInterface(pathToXML);
        Assert.assertTrue("Содержимое заказа пива не соответствует ожидаемому", expectedBeerOrder.equals(actualBeerOrderByDom));

    }

    @Test
    public void testInitializeBeerOrderBySAX() throws XMLStreamException, IOException, SAXException, ParserConfigurationException {
        String pathToXML = "/Users/Admin/Documents/javafordev/src/com/javafordev/lesson9/task1/data/beer.xml";
        strategy = new SAXStrategy();
        context = new Context(strategy);

        BeerOrder expectedBeerOrder = TestUtil.generateTestBeerOrder();
        BeerOrder actualBeerOrderBySAX = context.contextInterface(pathToXML);
        Assert.assertTrue("Содержимое заказа пива не соответствует ожидаемому", expectedBeerOrder.equals(actualBeerOrderBySAX));

    }


}
