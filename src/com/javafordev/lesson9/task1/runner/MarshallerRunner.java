package com.javafordev.lesson9.task1.runner;

import com.javafordev.lesson9.task1.parser.jaxb.MarshallerUtil;

import java.io.FileNotFoundException;

public class MarshallerRunner {
    public static void main(String[] args) throws FileNotFoundException {

        MarshallerUtil.createXmlFromBeerOrder();

    }
}
