package com.javafordev.lesson4.task1;

import java.util.Arrays;

public class AirlineService {

    private Airline[] airlines;

    public AirlineService(Airline[] airlines) {
        this.airlines = airlines;
    }

    public Airline[] getAirlines() {
        return airlines;
    }

    public void setAirlines(Airline[] airlines) {

        for (Airline element : airlines) {
            if (element==null) {
                System.out.println("Массив содержит null объекты");
                this.airlines = this.removeNullElementsFromAirlines(airlines);
            }
        }
        this.airlines = airlines;
    }

    @Override
    public String toString() {
        return "AirlineService{" +
                "airlines=" + Arrays.toString(airlines) +
                '}';
    }

    //метод для поиска объектов из массива airlines по фильтру - 1) destination, 2)dayOfWeek, 3) можно добавить другои - planeType, numberOfFlight
    public Airline[] findAirlinesByFilter(Airline[] airlines, String filterName, String filterValue) {
        Airline[] filteredAirlines = new Airline[airlines.length];
        switch (filterName) {
            case "destination":
                int i = 0;
                for (Airline element : airlines) {
                    if (element.getDestination().equals(filterValue)) {
                        filteredAirlines[i] = element;
                        i++;
                    }
                }
                break;
            case "dayOfWeek":
                int j = 0;
                for (Airline element : airlines) {
                    if (element.getDayOfWeek().equals(filterValue)) {
                        filteredAirlines[j] = element;
                        j++;
                    }
                }
                break;
            default:
                System.out.println("Невозможно выполнить фильтрация по заданному параметру!");
        }

        Airline[] fitleredAirlinesWithoutNullElements = removeNullElementsFromAirlines(filteredAirlines);

        if (fitleredAirlinesWithoutNullElements.length == 0) {
            System.out.println("Не удалось наити объект массива airlines, которыи соответствует фильтру");
        }
        return fitleredAirlinesWithoutNullElements;
    }

    //метод для поиска объектов из массива airlines по фильтру departureTime
    public Airline[] findAirlinesByDepartureTime(Airline[] airlines, int departureTimeInHours, int departureTimeInMinutes) {
        Airline[] filteredAirlines = new Airline[airlines.length];
        int timeInMinutesToFilter = departureTimeInHours * 60 + departureTimeInMinutes;
        int i = 0;
        for (Airline element : airlines) {
            int timeInMinutes = element.convertHoursAndMinutesInMinutes();
            if (timeInMinutes > timeInMinutesToFilter) {
                filteredAirlines[i] = element;
                i++;
            }
        }
        Airline[] fitleredAirlinesWithoutNullElements = removeNullElementsFromAirlines(filteredAirlines);

        if (fitleredAirlinesWithoutNullElements.length == 0) {
            System.out.println("Не удалось наити объект массива airlines, которыи соответствует фильтру");
        }
        return fitleredAirlinesWithoutNullElements;
    }

    public Airline[] removeNullElementsFromAirlines(Airline[] airlines) {
        int countOfNotNullElements = 0;
        for (Airline element : airlines) {
            if (element != null) {
                countOfNotNullElements++;
            }
        }

        Airline[] fitleredAirlinesWithoutNullElements = new Airline[countOfNotNullElements];
        int i = 0;
        for (Airline element : airlines) {
            if (element != null) {
                fitleredAirlinesWithoutNullElements[i] = element;
                i++;
            }
        }
        return fitleredAirlinesWithoutNullElements;
    }
}
