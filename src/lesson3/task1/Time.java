package lesson3.task1;

/**
 * 1. Создать класс и объекты описывающие промежуток времени.
 * Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
 * Сделать методы для получения полного количества секунд в объекте, сравнения двух объектов.
 * Создать два конструктора: получающий общее количество секунд, и часы, минуты и секундыпо отдельности.
 * Сделать метод для вывода данных.
 */

public class Time {

    // поля класса
    private long wholeAmountOfSeconds;
    private long seconds;
    private long minutes;
    private int hours;

    // 1) конструктор, получающий общее количество секунд
    public Time(long wholeEmountOfSeconds) {
        this.wholeAmountOfSeconds = wholeEmountOfSeconds;
    }

    // 2) конструктор, получающий часы, минуты и секунды по отдельности
    public Time(int hours, long minutes, long seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

    }

    //метод для получения полного количества секунд, возвращаемы тип - long
    public long calculateWholeAmountOfSeconds() {
        if (this.wholeAmountOfSeconds == 0 && (this.seconds != 0 || this.minutes != 0 || this.hours != 0)) {
            return this.seconds + this.minutes * 60 + this.hours * 3600;
        } else {
            return this.wholeAmountOfSeconds;
        }

    }

    //метод для сравнения объектов, созданных конструкторами 1) и 2), по параметру - общее количество секунд, возвращаемы тип - boolean
    public static boolean compare(Time time1, Time time2) {
        boolean isEqual = false;
        if (time1.wholeAmountOfSeconds == time2.calculateWholeAmountOfSeconds()) {
            isEqual = true;
        }
        return isEqual;
    }


    //метод для вывода данных, возвращаемы тип - void
    public void printInfo() {
        // определяем по какому конструктору объект создан, вывод инфо объекте
        if (this.wholeAmountOfSeconds == 0 && (this.seconds != 0 || this.minutes != 0 || this.hours != 0)) {
            System.out.println("Данные об объекте, созданном конструктором 2) - часов: " + this.hours + " минут: " + this.minutes + " секунд: " + this.seconds);
        } else {
            System.out.println("Данные об объекте, созданном конструктором 1) - общее количество секунд: " + this.wholeAmountOfSeconds);
        }

    }
}
