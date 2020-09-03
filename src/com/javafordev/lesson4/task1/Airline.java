package com.javafordev.lesson4.task1;

import java.util.Arrays;

import static com.javafordev.lesson4.task1.Validator.*;

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
    private String[] daysOfWeek;


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

    public String[] getDaysOfWeek() {
        return this.daysOfWeek;
    }

    public void setDestination(String destination) {
        this.destination = validateDestination(destination);
    }

    public void setNumberOfFlight(int numberOfFlight) {
        this.numberOfFlight = validateNumberOfFlight(numberOfFlight);
    }

    public void setPlaneType(char planeType) {
        this.planeType = planeType;
    }

    public void setDepartureTimeInHours(int departureTimeInHours) {
        this.departureTimeInHours = validateDepartureTimeInHours(departureTimeInHours);
    }

    public void setDepartureTimeInMinutes(int departureTimeInMinutes) {
        this.departureTimeInMinutes = validateDepartureTimeInMinutes(departureTimeInMinutes);
    }

    public void setDaysOfWeek(String[] daysOfWeek) {
        this.daysOfWeek = new String[daysOfWeek.length];
        for (int i = 0; i < daysOfWeek.length; i++) {
            this.daysOfWeek[i] = daysOfWeek[i];
        }
    }

    public Airline(String destination, int numberOfFlight, char planeType, int departureTimeInHours, int departureTimeInMinutes, String[] daysOfWeek) {

        this.destination = validateDestination(destination);
        this.numberOfFlight = validateNumberOfFlight(numberOfFlight);
        this.departureTimeInHours = validateDepartureTimeInHours(departureTimeInHours);
        this.departureTimeInMinutes = validateDepartureTimeInMinutes(departureTimeInMinutes);
        this.planeType = planeType;
        this.daysOfWeek = new String[daysOfWeek.length];
        for (int i = 0; i < daysOfWeek.length; i++) {
            this.daysOfWeek[i] = daysOfWeek[i];
        }
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
                ", daysOfWeek='" + Arrays.toString(this.getDaysOfWeek()) + '\'' +
                '}';
    }

    public int convertHoursAndMinutesInMinutes() {
        return this.getDepartureTimeInHours() * 60 + this.getDepartureTimeInMinutes();
    }

}
