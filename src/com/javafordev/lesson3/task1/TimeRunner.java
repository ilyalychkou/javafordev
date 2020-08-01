package com.javafordev.lesson3.task1;


public class TimeRunner {

    public static void main(String[] args) {

        //инициализация объектов
        Time time1 = new Time(-3663);
        Time time2 = new Time(-1, 0, -3);

        //определение общего количества секунд для объектов
        System.out.println("Общее количество секунд объекта time1: " + time1.calculateWholeAmountOfSeconds());
        System.out.println("Общее количество секунд объекта time2: " + time2.calculateWholeAmountOfSeconds());

        // сравнение 2 объектов
        /**
         тестовые значения для метода получения денег
         1) 60 секунд и и 60 секунд
         2) 2 минуты и 120 секунд
         3) 1 час и 3600 секунд
         4) 1 час, 2 минуты, 3 секунды и 3723 секунд
         5) отрицательные значения для любого их передаваемых значении.
         текущая обработка - 1)вывожу сообщение-подсказку + 2) беру по модулю
         если вводить с консоли, то можно блокировать и просить ввести корректное значение заново
         */

        //сравнение 2 объектов, меняя вызывающии и передаваемыи объекты местами
        System.out.println(time1.equals(time2));
        System.out.println(time2.equals(time1));

        //вывод инфо по каждому из объектов
        time1.printInfo();
        time2.printInfo();
    }
}
