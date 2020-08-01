package com.javafordev.lesson3.task3;

public class Circle implements Figure { //реализует интерфеис

    public void printInfo() { //полиморфизм метода
        System.out.println("Я - Круг");
    }
    public void draw() { //полиморфизм метода
        System.out.println("Меня начертили при помощи циркуля!");
    }
}
