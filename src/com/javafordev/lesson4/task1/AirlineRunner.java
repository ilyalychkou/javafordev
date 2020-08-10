package com.javafordev.lesson4.task1;

public class AirlineRunner {
/**
 * Тестовые значения:
 * при создании объектов
 * 1. параметр dayOfWeek - Sun, Mon, Tue, Wed, Thu, Fri, Sat, пустое, цифра
 * 2. параметр destination - Oslo, Ottawa, Minsk, пустое, несоответствует названию города - "ahfiewm"
 * 3. параметр departureTimeInHours - 0, 2, 23, 24, 7, <0
 * 4. параметр departureTimeInMinutes - 0, 7, 15, 59, 60, <0
 * 5. параметр numberOfFlight - <0,
 * при проверке методов фильтрации
 *  1. параметр dayOfWeek - Sun, Mon, Tue, Wed, Thu, Fri, Sat, пустое, цифра
 * 2. параметр destination - Oslo, Ottawa, Minsk, пустое, несоответствует названию города - "ahfiewm"
 * 3. фильтр по departureTime - < заданного, = заданному, > заданного
 */
    public static void main(String[] args) {

        int numberOfAirlines = 5;
        String dayOfWeekToFilter = "Fri";
        String destinationToFilter = "Oslo";
        int departureTimeInHoursToFilter = 5;
        int departureTimeInMinutesToFilter = 22;
        //инициализация массива объектов типа Airline
        Airline[] airlines = new Airline[numberOfAirlines];

        airlines[0] = new Airline("Oslo", 0, 'A', 22, 10, "Fri");
        airlines[1] = new Airline("Warsaw", 1540, 'B', 9, 3, "Mon");
        airlines[2] = new Airline("Ottawa", 1004, 'A', 7, 37, "Tue");
        airlines[3] = new Airline("Tokyo", 936, 'C', 16, 21, "Wed");
        airlines[4] = new Airline("Minsk", 2255, 'B', 4, 21, "Fri");

        //вывод списка объектов из массива airlines для заданного destinationToFilter
        Airline.printAirlinesByDestination(airlines, destinationToFilter);
        System.out.println();

        //вывод списка объектов из массива airlines для заданного dayOfWeekToFilter
        Airline.printAirlinesByDayOfWeek(airlines, dayOfWeekToFilter);
        System.out.println();

        //вывод списка объектов из массива airlines для заданного dayOfWeekToFilter и departureTime > заданного
        Airline.printAirlinesByDayOfWeekAndDepartureTime(airlines, dayOfWeekToFilter, departureTimeInHoursToFilter, departureTimeInMinutesToFilter);
        System.out.println();

    }
}
