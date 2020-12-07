package com.javafordev.lesson9.task1.parser.jaxb;

import com.javafordev.lesson9.task1.model.beer_shop.beer.Beer;
import com.javafordev.lesson9.task1.model.beer_shop.beer.BeerOrder;
import com.javafordev.lesson9.task1.model.beer_shop.beer.Bottling;
import com.javafordev.lesson9.task1.model.beer_shop.beer.Char;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MarshallerUtil {

    public static void createXmlFromBeerOrder() throws FileNotFoundException {

        try {
            JAXBContext context = JAXBContext.newInstance(BeerOrder.class);
            Marshaller m = context.createMarshaller();
            BeerOrder beerOrder = new BeerOrder();
            String pathToMarshallXML = "/Users/Admin/Documents/javafordev/src/com/javafordev/lesson9/task1/data/beer_marshaller.xml";

            Bottling bottling = new Bottling(0.5, "Glass");
            Char beerChar = new Char(4.5, "55%", true, 43, bottling);
            List<String> listOfIngredients = new ArrayList<>();
            listOfIngredients.add("Water");
            listOfIngredients.add("Malt");
            listOfIngredients.add("Hop");
            listOfIngredients.add("Sugar");

            Beer beer = new Beer("Porter", "Dark", true, "Alivaria", 1000, listOfIngredients, beerChar, 12314345);
            beerOrder.getBeer().add(beer);

            m.marshal(beerOrder, new FileOutputStream(pathToMarshallXML));
            m.marshal(beerOrder, System.out);
        } catch (JAXBException exception) {
            exception.printStackTrace();
        }

    }
}
