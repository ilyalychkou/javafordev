package com.javafordev.lesson9.task1.runner;

import com.javafordev.lesson9.task1.validator.ValidatorUtil;
import jdk.internal.org.xml.sax.SAXException;
import org.apache.log4j.BasicConfigurator;

public class BeerValidatorRunner {
    public static void main(String[] args) throws SAXException, org.xml.sax.SAXException {
        BasicConfigurator.configure();
        String pathToXML = "/Users/Admin/Documents/javafordev/src/com/javafordev/lesson9/task1/data/beer.xml";
        String pathToXSD = "/Users/Admin/Documents/javafordev/src/com/javafordev/lesson9/task1/data/beer.xsd";
        ValidatorUtil.validateXMLFile(pathToXML, pathToXSD);
    }


}
