package com.javafordev.lesson4.task1;

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

    public Airline(String destination, int numberOfFlight, char planeType, int departureTimeInHours, int departureTimeInMinutes, String dayOfWeek) {

        if (destination.equals("")) {
            System.out.println("Для параметра destination задано пустое значение. "
                    + "Допустимые значения - латиница, не пустая строка");
            this.destination = " ";
        } else {
            this.destination = destination;
        }

        if (numberOfFlight <= 0) {
            System.out.println("Для параметра numberOfFlight задано отрицательное или нулевое значение. "
                    + "Допустимые значения - целые положительные числа");
        } else {
            this.numberOfFlight = numberOfFlight;
        }

        if (departureTimeInHours < 0 || departureTimeInHours > 23) {
            System.out.println("Для параметра departureTimeInHours задано недопустимое значение. "
                    + "Допустимые значения - целые положительные числа от 0 до 23");
        } else {
            this.departureTimeInHours = departureTimeInHours;
        }

        if (departureTimeInMinutes < 0 || departureTimeInMinutes > 59) {
            System.out.println("Для параметра departureTimeInMinutes задано недопустимое значение. "
                    + "Допустимые значения - целые положительные числа от 0 до 59");
        } else {
            this.departureTimeInMinutes = departureTimeInMinutes;
        }

        this.planeType = planeType;
        this.dayOfWeek = dayOfWeek;
    }

    //метод toString()
    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", numberOfFlight=" + numberOfFlight +
                ", planeType=" + planeType +
                ", departureTimeInHours=" + departureTimeInHours +
                ", departureTimeInMinutes=" + departureTimeInMinutes +
                ", dayOfWeek='" + dayOfWeek + '\'' +
                '}';
    }

    //метод для выводы объектов из массива airlines по параметру destination
    public static void printAirlinesByDestination(Airline[] airlines, String destination) {
        int countOfResults = 0;
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].destination.equals(destination)) {
                System.out.println(airlines[i].toString());
                countOfResults++;
            }
        }
        if (countOfResults == 0) {
            System.out.println("Не удалось наити объект массива airlines, которыи соответствует фильтру");
        }
    }

    //метод для выводы объектов из массива airlines по параметру dayOfWeek
    public static void printAirlinesByDayOfWeek(Airline[] airlines, String dayOfWeek) {
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].dayOfWeek.equals(dayOfWeek))
                System.out.println(airlines[i].toString());
        }
    }

    //метод для фильтра массива airlines по параметру dayOfWeek и departureTime>заданного
    public static void printAirlinesByDayOfWeekAndDepartureTime(Airline[] airlines, String dayOfWeek, int departureTimeInHours, int departureTimeInMinutes) {
        int timeInMinutesToFilter = departureTimeInHours * 60 + departureTimeInMinutes;
        for (int i = 0; i < airlines.length; i++) {
            int timeInMinutes = airlines[i].convertHoursAndMinutesInMinutes();
            if (airlines[i].dayOfWeek.equals(dayOfWeek) && timeInMinutes > timeInMinutesToFilter)
                System.out.println(airlines[i].toString());
        }
    }

    public int convertHoursAndMinutesInMinutes() {
        return this.departureTimeInHours * 60 + this.departureTimeInMinutes;
    }
}
