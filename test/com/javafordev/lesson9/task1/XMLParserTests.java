package com.javafordev.lesson9.task1;

import com.javafordev.lesson9.task1.model.beer_shop.beer.Beer;
import com.javafordev.lesson9.task1.model.beer_shop.beer.BeerOrder;
import com.javafordev.lesson9.task1.parsers.dom.DomUtil;
import com.javafordev.lesson9.task1.parsers.sax.SAXUtil;
import com.javafordev.lesson9.task1.parsers.stax.StAXUtil;
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

    @Test
    public void testNameForFirstBeerByStAX() throws XMLStreamException {
        String pathToXML = "/Users/Admin/Documents/javafordev/src/com/javafordev/lesson9/task1/data/beer.xml";

        Beer beer = new Beer();
        beer.setName("Raw");
        List<Beer> beerList = new ArrayList<>();
        beerList.add(beer);
        BeerOrder expectedBeerOrder = new BeerOrder(beerList);
        String expectedNameForFirstBeer = expectedBeerOrder.getBeer().get(0).getName();
        BeerOrder actualBeerOrder = StAXUtil.parseXMLToInitializeObject(pathToXML);
        String actualNameForFirstBeer = actualBeerOrder.getBeer().get(0).getName();

        Assert.assertEquals("Имя 1-го пива в заказе не соответствует ожидаемому", expectedNameForFirstBeer, actualNameForFirstBeer);

    }

    @Test
    public void testInitializeBeerOrderByStAX() throws XMLStreamException, IOException, SAXException, ParserConfigurationException {
        String pathToXML = "/Users/Admin/Documents/javafordev/src/com/javafordev/lesson9/task1/data/beer.xml";

        BeerOrder expectedBeerOrder = TestUtil.generateTestBeerOrder();
        BeerOrder actualBeerOrderByStAX = StAXUtil.parseXMLToInitializeObject(pathToXML);
        Assert.assertEquals("Содержимое заказа пива не соответствует ожидаемому", expectedBeerOrder, actualBeerOrderByStAX);

    }


    @Test
    public void testInitializeBeerOrderByDom() throws XMLStreamException, IOException, SAXException, ParserConfigurationException {
        String pathToXML = "/Users/Admin/Documents/javafordev/src/com/javafordev/lesson9/task1/data/beer.xml";

        BeerOrder expectedBeerOrder = TestUtil.generateTestBeerOrder();
        BeerOrder actualBeerOrderByDom = DomUtil.parseXMLToInitializeObject(pathToXML);
        Assert.assertEquals("Содержимое заказа пива не соответствует ожидаемому", expectedBeerOrder, actualBeerOrderByDom);

    }

    @Test
    public void testInitializeBeerOrderBySAX() throws XMLStreamException, IOException, SAXException, ParserConfigurationException {
        String pathToXML = "/Users/Admin/Documents/javafordev/src/com/javafordev/lesson9/task1/data/beer.xml";

        BeerOrder expectedBeerOrder = TestUtil.generateTestBeerOrder();
        BeerOrder actualBeerOrderBySAX = SAXUtil.parseXMLToInitializeObject(pathToXML);
        Assert.assertEquals("Содержимое заказа пива не соответствует ожидаемому", expectedBeerOrder, actualBeerOrderBySAX);

    }


}
