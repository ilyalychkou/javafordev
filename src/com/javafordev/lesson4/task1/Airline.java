package com.javafordev.lesson4.task1;

import static com.javafordev.lesson4.task1.Validator.validateInputParameterForString;
import static com.javafordev.lesson4.task1.Validator.validateStringParameterForNumber;

/**
 * 1)Создать класс Airline:
 * Пункт назначения, +
 * Номер рейса, +
 * Тип самолета, +
 * Время вылета, +
 * Дни недели. +
 * Создать массив объектов. Вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного
 */

public class Airline {

    private String destination;
    private int numberOfFlight;
    private char planeType;
    private int departureTimeInHours;
    private int departureTimeInMinutes;
    private String dayOfWeek;
    // 1)public т.к. массив содержит общедоступные данные
    // 2)static т.к. массив с днями это поле класса, для отдельного объекта оно не нужно
    public static String[] daysOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    public String getDestination() {
        return destination;
    }

    public int getNumberOfFlight() {
        return numberOfFlight;
    }

    public char getPlaneType() {
        return planeType;
    }

    public int getDepartureTimeInHours() {
        return departureTimeInHours;
    }

    public int getDepartureTimeInMinutes() {
        return departureTimeInMinutes;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDestination(String destination) {
        this.destination = validateInputParameterForString("destination", destination);
    }

    public void setNumberOfFlight(int numberOfFlight) {
        this.numberOfFlight = validateStringParameterForNumber("numberOfFlight", numberOfFlight);
    }

    public void setPlaneType(char planeType) {
        this.planeType = planeType;
    }

    public void setDepartureTimeInHours(int departureTimeInHours) {
        this.departureTimeInHours = validateStringParameterForNumber("departureTimeInHours", departureTimeInHours);
    }

    public void setDepartureTimeInMinutes(int departureTimeInMinutes) {
        this.departureTimeInMinutes = validateStringParameterForNumber("departureTimeInMinutes", departureTimeInMinutes);
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Airline(String destination, int numberOfFlight, char planeType, int departureTimeInHours, int departureTimeInMinutes) {

        this.destination = validateInputParameterForString("destination", destination);
        this.numberOfFlight = validateStringParameterForNumber("numberOfFlight", numberOfFlight);
        this.departureTimeInHours = validateStringParameterForNumber("departureTimeInHours", departureTimeInHours);
        this.departureTimeInMinutes = validateStringParameterForNumber("departureTimeInMinutes", departureTimeInMinutes);
        this.planeType = planeType;
    }

    //метод toString()
    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + this.getDestination() + '\'' +
                ", numberOfFlight=" + this.getNumberOfFlight() +
                ", planeType=" + this.getPlaneType() +
                ", departureTimeInHours=" + this.getDepartureTimeInHours() +
                ", departureTimeInMinutes=" + this.getDepartureTimeInMinutes() +
                ", dayOfWeek='" + this.getDayOfWeek() + '\'' +
                '}';
    }

    public int convertHoursAndMinutesInMinutes() {
        return this.getDepartureTimeInHours() * 60 + this.getDepartureTimeInMinutes();
    }

}
