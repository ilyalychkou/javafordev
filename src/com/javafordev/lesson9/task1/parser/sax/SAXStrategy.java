package com.javafordev.lesson9.task1.parser.sax;

import com.javafordev.lesson9.task1.comparator.BeerComparator;
import com.javafordev.lesson9.task1.model.beer_shop.beer.Beer;
import com.javafordev.lesson9.task1.model.beer_shop.beer.BeerOrder;
import com.javafordev.lesson9.task1.parser.ParsingStrategy;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

public class SAXStrategy implements ParsingStrategy {
    @Override
    public BeerOrder parseXML(String pathToXML) throws ParserConfigurationException, IOException, SAXException {
        XMLReader reader = null;
        BeerHandler beerHandler = new BeerHandler();
        BeerOrder beerOrder = null;

        try {
            reader = XMLReaderFactory.createXMLReader();
            reader.setContentHandler(beerHandler);
            reader.parse(pathToXML);

            List<Beer> beerList = beerHandler.getBeerList();
            beerList.sort(new BeerComparator());
            beerOrder = beerHandler.parseBeerOrder(beerList);
        } catch (SAXException exception) {
            System.out.println("ошибка " + reader.getClass() + " " + exception);
        } catch (IOException exception) {
            System.out.println("ошибка I/O потока " + exception);
        }

        return beerOrder;

    }
}
