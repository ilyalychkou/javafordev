package com.javafordev.lesson9.task1.parser.jaxb;

import com.javafordev.lesson9.task1.model.beer_shop.beer.BeerOrder;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class UnMarshallerUtil {

    public static BeerOrder parseBeerOrder(String path) {
        BeerOrder beerOrder = new BeerOrder();
            try {
                JAXBContext jc = JAXBContext.newInstance(BeerOrder.class);
                Unmarshaller u = jc.createUnmarshaller();
                FileReader reader = new FileReader(path);
                beerOrder = (BeerOrder) u.unmarshal(reader);
            } catch (JAXBException exception) {
                exception.printStackTrace();
            } catch (FileNotFoundException exception) {
                exception.printStackTrace();
            }

        return beerOrder;
    }
}
