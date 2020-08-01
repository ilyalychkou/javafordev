package com.javafordev.lesson3.task3;

public class Square implements Figure { //реализует интерфеис

    public void printInfo() { //полиморфизм метода
        System.out.println("Я - Квадрат");
    }

    public void draw() { //полиморфизм метода
        System.out.println("Меня начертили при помощи линеики!");
    }
}
