package com.javafordev.lesson3.task2;

public class CashMachineRunner {

    public static void main(String[] args) {
        CashMachine cashMachine1 = new CashMachine(2, 2, 1);
        cashMachine1.addMoneyToCashMaсhine(102, 12, 2);
        /**
        тестовые значения для метода получения денег
         1) 0
         2) < баланса, = балансу, > баланса
         3) кратность номиналу - 20, 50, 100, 1170, 1500, 450, 40, 67, 1, 19, 30, 40, 50, 70, 80, 90, 130, 170, 190, 21, 31, 51, 111
         4) доступно ли требуемое кол-во номиналов - >= доступного количества, <доступного количества
         5) отрицательные значения любого из параметров
        */
        cashMachine1.getMoneyFromCashMachine(2123);

    }


    }















