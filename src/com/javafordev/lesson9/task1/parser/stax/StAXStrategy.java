package com.javafordev.lesson9.task1.parser.stax;

import com.javafordev.lesson9.task1.comparator.BeerComparator;
import com.javafordev.lesson9.task1.model.beer_shop.beer.Beer;
import com.javafordev.lesson9.task1.model.beer_shop.beer.BeerOrder;
import com.javafordev.lesson9.task1.model.beer_shop.beer.Bottling;
import com.javafordev.lesson9.task1.model.beer_shop.beer.Char;
import com.javafordev.lesson9.task1.parser.ParsingStrategy;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.xml.sax.SAXException;

import javax.xml.namespace.QName;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StAXStrategy implements ParsingStrategy {

    static {
        new DOMConfigurator().doConfigure("/Users/Admin/Documents/javafordev/log4j.xml", LogManager.getLoggerRepository());
    }

    final static Logger logger = Logger.getLogger(StAXStrategy.class);
    @Override
    public BeerOrder parseXML(String pathToXML) throws ParserConfigurationException, IOException, SAXException, XMLStreamException {


        logger.info("Parsing started....");
        logger.setLevel(Level.INFO);
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        XMLEventReader reader = null;
        try {
            reader = xmlInputFactory.createXMLEventReader(new FileInputStream(pathToXML));
        } catch (XMLStreamException exception) {
            logger.error("Error occurred : " + exception.getMessage(), new XMLStreamException());
        } catch (FileNotFoundException exception) {
            logger.error("Error occurred : " + exception.getMessage(), new FileNotFoundException());
        }
        Beer beer = null;
        List<String> listOfIngredients = null;
        Char beerChar = null;
        Bottling bottling = null;
        List<Beer> beerList = new ArrayList<>();

        while (reader.hasNext()) {
            XMLEvent nextEvent = reader.nextEvent();
            if (nextEvent.isStartElement()) {
                StartElement startElement = nextEvent.asStartElement();

                if (beerChar == null) {
                    beerChar = new Char();
                }

                if (bottling == null) {
                    bottling = new Bottling();
                }

                switch (startElement.getName().getLocalPart()) {
                    case "Beer":
                        beer = new Beer();
                        Attribute article = startElement.getAttributeByName(new QName("article"));
                        if (article != null) {
                            beer.setArticle(Integer.parseInt(article.getValue()));
                        }
                        break;


                    case "name":
                        nextEvent = reader.nextEvent();
                        beer.setName(nextEvent.asCharacters().getData());
                        break;
                    case "type":
                        nextEvent = reader.nextEvent();
                        beer.setType(nextEvent.asCharacters().getData());
                        break;
                    case "alcohol":
                        nextEvent = reader.nextEvent();
                        beer.setAlcohol(Boolean.valueOf(nextEvent.asCharacters().getData()));
                        break;
                    case "manufacter":
                        nextEvent = reader.nextEvent();
                        beer.setManufacter(nextEvent.asCharacters().getData());
                        break;
                    case "quantity":
                        nextEvent = reader.nextEvent();
                        beer.setQuantity(Integer.parseInt(nextEvent.asCharacters().getData()));
                        break;
                    case "ingredient":
                        nextEvent = reader.nextEvent();
                        if (listOfIngredients == null) {
                            listOfIngredients = new ArrayList<>();
                        }
                        listOfIngredients.add(nextEvent.asCharacters().getData());
                        break;
                    case "volume":
                        nextEvent = reader.nextEvent();
                        bottling.setVolume(Double.parseDouble(nextEvent.asCharacters().getData()));
                        break;
                    case "material":
                        nextEvent = reader.nextEvent();
                        bottling.setMaterial(nextEvent.asCharacters().getData());
                        break;
                    case "content":
                        nextEvent = reader.nextEvent();
                        beerChar.setContent(Double.parseDouble(nextEvent.asCharacters().getData()));
                        break;
                    case "transparency":
                        nextEvent = reader.nextEvent();
                        beerChar.setTransparency(nextEvent.asCharacters().getData());
                        break;
                    case "filtered":
                        nextEvent = reader.nextEvent();
                        beerChar.setFiltered(Boolean.valueOf(nextEvent.asCharacters().getData()));
                        break;
                    case "nutrition":
                        nextEvent = reader.nextEvent();
                        beerChar.setNutrition(Integer.valueOf(nextEvent.asCharacters().getData()));
                        break;
                }
            }

            if (nextEvent.isEndElement()) {
                EndElement endElement = nextEvent.asEndElement();
                if (endElement.getName().getLocalPart().equals("Beer")) {
                    beerChar.setBottling(bottling);
                    beer.setChar(beerChar);
                    beer.setIngredient(listOfIngredients);
                    beerList.add(beer);
                    listOfIngredients = null;
                    beerChar=null;
                    bottling=null;

                }
            }
        }
        beerList.sort(new BeerComparator());
        logger.info("Parsing finished....");
        System.out.println(beerList);
        return new BeerOrder(beerList);
    }
}
