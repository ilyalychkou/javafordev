package com.javafordev.lesson4.task1;

import java.util.Date;

/**
 *1)Создать класс Airline:
 * Пункт назначения, +
 * Номер рейса, +
 * Тип самолета, +
 * Время вылета, +
 * Дни недели. +
 * Создать массив объектов. Вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых
 * больше заданного
 * */

public class Airline {
    //поля класса
    private String destination;
    private int numberOfFlight;
    private char planeType;
    private Date departureTime;
    private int dayOfWeek;

    //конструктор
    public Airline(String destination, int numberOfFlight, char planeType, Date departureTime, int dayOfWeek) {
        if (destination.equals("")) {

        }
        this.destination = destination;
        this.numberOfFlight = numberOfFlight;
        this.planeType = planeType;
        this.departureTime = departureTime;
        this.dayOfWeek = dayOfWeek;
    }
}
