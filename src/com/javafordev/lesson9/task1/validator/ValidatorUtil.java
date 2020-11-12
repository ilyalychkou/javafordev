package com.javafordev.lesson9.task1.validator;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class ValidatorUtil {

    static {
        new DOMConfigurator().doConfigure("/Users/Admin/Documents/javafordev/log4j.xml", LogManager.getLoggerRepository());
    }
    final static Logger logger = Logger.getLogger(ValidatorUtil.class);

    public static void validateXMLFile(String pathToXML, String pathToXSD) {

        File schemaFile = new File(pathToXSD);
        Source xmlFile = new StreamSource(new File(pathToXML));
        SchemaFactory schemaFactory = SchemaFactory
                .newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        try {
            Schema schema = schemaFactory.newSchema(schemaFile);
            Validator validator = schema.newValidator();
            validator.validate(xmlFile);
            logger.info(xmlFile.getSystemId() + " XML файл валиден");
        } catch (org.xml.sax.SAXException e) {
            logger.error(xmlFile.getSystemId() + " XML файл не валиден, по причине :" + e);
        } catch (IOException e) {

        }
    }
}
