package com.javafordev.lesson3.task1;

/**
 * 1. Создать класс и объекты описывающие промежуток времени.
 * Сам промежуток в классе должен задаваться тремя свойствами: секундами, минутами, часами.
 * Сделать методы для получения полного количества секунд в объекте, сравнения двух объектов.
 * Создать два конструктора: получающий общее количество секунд, и часы, минуты и секундыпо отдельности.
 * Сделать метод для вывода данных.
 */

public class Time {

    // поля класса
    private int seconds;
    private int minutes;
    private int hours;

    // 1) конструктор, получающий общее количество секунд
    public Time(int wholeAmountOfSeconds) {
        if (wholeAmountOfSeconds < 0) {
            System.out.println("Введено общее количество секунд < 0. Количество секунд не может быть отрицательным. Проверьте передаваемыи в конструктор параметр. ");
        } else {
            // здесь не выделял отдельные методы чтобы вернуть каждыи из параметров, решил, что это избыточно
            int sec = wholeAmountOfSeconds % 60;
            int m = (wholeAmountOfSeconds - sec) / 60;
            int min = m % 60;
            int h = (m - min) / 60;

            this.hours = h;
            this.minutes = min;
            this.seconds = sec;
        }
    }

    // 2) конструктор, получающий часы, минуты и секунды по отдельности
    public Time(int hours, int minutes, int seconds) {

        if (hours < 0 || minutes < 0 || seconds < 0) {
            System.out.println("Для одного из параметров введено отрицательное количество. Проверьте передаваемые в конструктов параметры. ");

        } else {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }

    }

    //метод для получения полного количества секунд, возвращаемы тип - int (решил, что хватит тк int это около 2 миллиардов)
    // возвращаемыи тип - int
    public int calculateWholeAmountOfSeconds() {
        return this.seconds + this.minutes * 60 + this.hours * 3600;
    }


    //метод для вывода данных об объекте, возвращаемы тип - void
    public void printInfo() {
        System.out.println("Данные об объекте - часов: " + this.hours + " минут: " + this.minutes + " секунд: " + this.seconds);

    }

    // метод сравнивающи объекты - объект, для которого вызывается метод и объект которыи передается в качестве входного параметра
    // возвращаемыи тип - boolean
    public boolean equals(Time time) {
        boolean isEqual = false;
        if (this.calculateWholeAmountOfSeconds() == time.calculateWholeAmountOfSeconds()) {
            isEqual = true;
        }
        return isEqual;
    }

}
