package com.javafordev.lesson9.task1.parser.jaxb;

import com.javafordev.lesson9.task1.model.beer_shop.beer.BeerOrder;
import com.javafordev.lesson9.task1.parser.ParsingStrategy;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JAXBStrategy implements ParsingStrategy {

    static {
        new DOMConfigurator().doConfigure("/Users/Admin/Documents/javafordev/log4j.xml", LogManager.getLoggerRepository());
    }

    final static Logger logger = Logger.getLogger(JAXBStrategy.class);
    @Override
    public BeerOrder parseXML(String pathToXML) throws ParserConfigurationException, IOException, SAXException {
        BeerOrder beerOrder = new BeerOrder();
        try {
            JAXBContext jc = JAXBContext.newInstance(BeerOrder.class);
            Unmarshaller u = jc.createUnmarshaller();
            FileReader reader = new FileReader(pathToXML);
            beerOrder = (BeerOrder) u.unmarshal(reader);
        } catch (JAXBException exception) {
            logger.error("Exception occurred" + exception.getMessage());
        } catch (FileNotFoundException exception) {
            logger.error("Exception occurred" + exception.getMessage());
        }

        return beerOrder;
    }
}
