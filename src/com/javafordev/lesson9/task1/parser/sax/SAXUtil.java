package com.javafordev.lesson9.task1.parser.sax;

import com.javafordev.lesson9.task1.comparator.BeerComparator;
import com.javafordev.lesson9.task1.model.beer_shop.beer.Beer;
import com.javafordev.lesson9.task1.model.beer_shop.beer.BeerOrder;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class SAXUtil {

    public static BeerOrder parseXMLToInitializeObject(String pathToXML) {
        XMLReader reader = null;
        BeerHandler beerHandler = new BeerHandler();
        BeerOrder beerOrder = null;

        try {
            reader = XMLReaderFactory.createXMLReader();
            reader.setContentHandler(beerHandler);
            reader.parse(pathToXML);

            List<Beer> beerList = beerHandler.getBeerList();
            Collections.sort(beerList, new BeerComparator());
            beerOrder = beerHandler.generateBeerOrder(beerList);
        } catch (SAXException exception) {
            System.out.println("ошибка " + reader.getClass() + " " + exception);
        } catch (IOException exception) {
            System.out.println("ошибка I/O потока " + exception);
        }

        return beerOrder;
    }
}
