package lesson3.task1;


import static lesson3.task1.Time.compare;

public class TimeRunner {

    public static void main(String[] args) {

        //инициализация объектов
        Time time1 = new Time(3723);
        Time time2 = new Time(1, 2, 3);

        //определение общего количества секунд для объекта time1
        System.out.println("Общее количество секунд объекта time1: " + time1.calculateWholeAmountOfSeconds());
        System.out.println("Общее количество секунд объекта time2: " + time2.calculateWholeAmountOfSeconds());

        // сравнение 2 объектов
        /**
         тестовые значения для метода получения денег
         1) 60 секунд и и 60 секунд
         2) 2 минуты и 120 секунд
         3) 1 час и 3600 секунд
         3) 1 час, 2 минуты, 3 секунды и 3723 секунд
         */

        System.out.println(compare(time1, time2));

        //вывод инфо по каждому из объектов
        time1.printInfo();
        time2.printInfo();


    }
}
