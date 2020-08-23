package com.javafordev.lesson4.task1;

import java.util.Arrays;


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
     * 1. параметр dayOfWeek - Sun, Mon, Tue, Wed, Thu, Fri, Sat, пустое, цифра
     * 2. параметр destination - Oslo, Ottawa, Minsk, пустое, несоответствует названию города - "ahfiewm"
     * 3. фильтр по departureTime - < заданного, = заданному, > заданного
     */
    public static void main(String[] args) {

        int numberOfAirlines = 5;
        String firstFilterName = "destination";
        String firstFilterValue = "Minsk";
        String secondFilterName = "dayOfWeek";
        String secondFilterValue = "Wed";
        int departureTimeInHoursToFilter = 1;
        int departureTimeInMinutesToFilter = 22;

        //инициализация массива объектов типа Airline
        Airline[] airlines = new Airline[numberOfAirlines];

        airlines[0] = new Airline("Oslo", 1675, 'A', 22, 10, "Sun", "Mon");
        airlines[1] = new Airline("Warsaw", 1540, 'B', 9, 3, "Thu");
        airlines[2] = new Airline("Ottawa", 1004, 'A', 7, 37, "Mon", "Fri");
        airlines[3] = new Airline("Tokyo", 936, 'C', 16, 21, "Mon", "Tue", "Fri", "Sat");
        airlines[4] = new Airline("Minsk", 2255, 'B', 4, -21, "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");

        AirlineService airlineService = new AirlineService(airlines);

        System.out.println("Вывод элементов массива отфильтрованного по destination");
        Airline[] airlinesFilteredByDestination = airlineService.findAirlinesByFilter(airlineService.getAirlines(), firstFilterName, firstFilterValue);
        System.out.println(Arrays.toString(airlinesFilteredByDestination));
        System.out.println();

        System.out.println("Вывод элементов массива отфильтрованного по dayOfWeek");
        Airline[] airlinesFilteredByDayOfWeek = airlineService.findAirlinesByFilter(airlineService.getAirlines(), secondFilterName, secondFilterValue);
        System.out.println(Arrays.toString(airlinesFilteredByDayOfWeek));
        System.out.println();

        AirlineService airlineServiceFilteredByDayOfWeek = new AirlineService(airlinesFilteredByDayOfWeek);

        System.out.println("Вывод элементов массива отфильтрованного по dayOfWeek и departureTime");
        Airline[] airlinesFilteredByDayOfWeekAndDepartureTime = airlineService.findAirlinesByDepartureTime(airlineServiceFilteredByDayOfWeek.getAirlines(), departureTimeInHoursToFilter, departureTimeInMinutesToFilter);
        System.out.println(Arrays.toString(airlinesFilteredByDayOfWeekAndDepartureTime));

    }
}
