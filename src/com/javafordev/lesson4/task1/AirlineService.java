package com.javafordev.lesson4.task1;

import java.util.Arrays;

import static com.javafordev.lesson4.task1.Validator.validateInputParameterForArray;

public class AirlineService {

    private Airline[] airlines;

    public AirlineService(Airline[] airlines) {
        this.airlines = validateInputParameterForArray(airlines);
    }

    public Airline[] getAirlines() {
        return airlines;
    }

    public void setAirlines(Airline[] airlines) {
        this.airlines = validateInputParameterForArray(airlines);
    }

    @Override
    public String toString() {
        return "AirlineService{" +
                "airlines=" + Arrays.toString(this.getAirlines()) +
                '}';
    }

    public Airline[] findAllByDestination(String destination) {
        Airline[] filteredAirlines = new Airline[this.airlines.length];
        int i = 0;
        for (Airline element : this.airlines) {
            if (element.getDestination().equals(destination)) {
                filteredAirlines[i] = element;
                i++;
            }
        }

        Airline[] fitleredAirlinesWithoutNullElements = ArrayUtils.removeNullElementsFromAirlines(filteredAirlines);

        if (fitleredAirlinesWithoutNullElements.length == 0) {
            System.out.println("Не удалось наити объект массива airlines, которыи соответствует фильтру");
        }
        return fitleredAirlinesWithoutNullElements;
    }

    public Airline[] findAllByDayOfWeek(String dayOfWeek) {
        Airline[] filteredAirlines = new Airline[this.airlines.length];
        int j = 0;
        for (Airline element : this.airlines) {
            for (int k = 0; k < element.getDaysOfWeek().length; k++) {
                if (element.getDaysOfWeek()[k].equals(dayOfWeek)) {
                    filteredAirlines[j] = element;
                    j++;
                }
            }
        }

        Airline[] fitleredAirlinesWithoutNullElements = ArrayUtils.removeNullElementsFromAirlines(filteredAirlines);

        if (fitleredAirlinesWithoutNullElements.length == 0) {
            System.out.println("Не удалось наити объект массива airlines, которыи соответствует фильтру");
        }
        return fitleredAirlinesWithoutNullElements;
    }

    //метод для поиска объектов из массива airlines по фильтру departureTime
    public Airline[] findAllByDepartureTime(int departureTimeInHours, int departureTimeInMinutes) {
        Airline[] filteredAirlines = new Airline[this.airlines.length];
        int timeInMinutesToFilter = departureTimeInHours * 60 + departureTimeInMinutes;
        int i = 0;
        for (Airline element : this.airlines) {
            int timeInMinutes = element.convertHoursAndMinutesInMinutes();
            if (timeInMinutes > timeInMinutesToFilter) {
                filteredAirlines[i] = element;
                i++;
            }
        }
        Airline[] fitleredAirlinesWithoutNullElements = ArrayUtils.removeNullElementsFromAirlines(filteredAirlines);

        if (fitleredAirlinesWithoutNullElements.length == 0) {
            System.out.println("Не удалось наити объект массива airlines, которыи соответствует фильтру");
        }
        return fitleredAirlinesWithoutNullElements;
    }

    public void printList() {
        for (Airline element : this.airlines) {
            System.out.println(element);
        }
    }
}
