package com.javafordev.lesson4.task1;

public class AirlineRunner {
    /**
     * Тестовые значения:
     * при создании объектов
     * 1. параметр dayOfWeek - Sun, Mon, Tue, Wed, Thu, Fri, Sat, пустое, цифра
     * 2. параметр destination - Oslo, Ottawa, Minsk, пустое, несоответствует названию города - "ahfiewm", не латиница - "Братислава"
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
        String firstFilterValue = "Tokyo";
        String secondFilterValue = "Fri";
        int departureTimeInHoursToFilter = 5;
        int departureTimeInMinutesToFilter = 22;

        //инициализация массива объектов типа Airline
        Airline[] airlines = new Airline[numberOfAirlines];

        String[] daysOfWeek0 = {"Sun", "Mon"};
        String[] daysOfWeek1 = {"Thu"};
        String[] daysOfWeek2 = {"Mon", "Fri"};
        String[] daysOfWeek3 = {"Mon", "Tue", "Fri", "Sat"};
        String[] daysOfWeek4 = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        airlines[0] = new Airline("Rome", 1675, 'A', 22, 10, daysOfWeek0);
        airlines[1] = new Airline("Warsaw", 1540, 'B', 9, 3, daysOfWeek1);
        airlines[2] = new Airline("Ottawa", 1004, 'A', 7, 37, daysOfWeek2);
        airlines[3] = new Airline("Tokyo", 936, 'C', 16, 21, daysOfWeek3);
        airlines[4] = new Airline("Minsk", 2255, 'B', 4, 22, daysOfWeek4);

        AirlineService airlineService = new AirlineService(airlines);

        System.out.println("Вывод элементов массива отфильтрованного по destination");
        Airline[] airlinesFilteredByDestination = airlineService.findAllByDestination(firstFilterValue);
        AirlineService airlinesFilteredByDestinationService = new AirlineService(airlinesFilteredByDestination);
        airlinesFilteredByDestinationService.printList();
        System.out.println();

        System.out.println("Вывод элементов массива отфильтрованного по dayOfWeek");
        Airline[] airlinesFilteredByDayOfWeek = airlineService.findAllByDayOfWeek(secondFilterValue);
        AirlineService airlinesFilteredByDayOfWeekService = new AirlineService(airlinesFilteredByDayOfWeek);
        airlinesFilteredByDayOfWeekService.printList();
        System.out.println();

        System.out.println("Вывод элементов массива отфильтрованного по dayOfWeek и departureTime");
        Airline[] airlinesFilteredByDayOfWeekAndDepartureTime = airlinesFilteredByDayOfWeekService.findAllByDepartureTime(departureTimeInHoursToFilter, departureTimeInMinutesToFilter);
        AirlineService airlinesFilteredByDayOfWeekAndDepartureTimeService = new AirlineService(airlinesFilteredByDayOfWeekAndDepartureTime);
        airlinesFilteredByDayOfWeekAndDepartureTimeService.printList();
    }
}
