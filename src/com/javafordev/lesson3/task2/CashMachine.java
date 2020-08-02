package com.javafordev.lesson3.task2;

/**
 * 2.Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
 * банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
 * 50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
 * снимающую деньги. На вход передается сумма денег. На выход – булевское
 * значение (операция удалась или нет). При снятии денег функция должна
 * рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
 * конструктор с тремя параметрами – количеством купюр.
 */

public class CashMachine {
    //поля класса
    private int countOf20Denomination;
    private int countOf50Denomination;
    private int countOf100Denomination;

    //конструктор с вх параметрами - количество купюр каждого номинала
    public CashMachine(int countOf20, int countOf50, int countOf100) {
        if (countOf20 < 0 || countOf50 < 0 || countOf100 < 0) {
            System.out.println("Для одного из параметров введено отрицательное количество. Проверьте передаваемые в конструктов параметры. ");
        } else {
            this.countOf20Denomination = countOf20;
            this.countOf50Denomination = countOf50;
            this.countOf100Denomination = countOf100;
        }
    }

    // метод для добавления денег и вычисления текущего баланса, возвращаемы тип - void
    public void addMoneyToCashMaсhine(int countOf20, int countOf50, int countOf100) {
        if (countOf20 < 0 || countOf50 < 0 || countOf100 < 0) {
            System.out.println("Для одного из параметров введено отрицательное количество. Проверьте передаваемые в метод параметры. ");
        } else {
            int balance = this.calculateBalance();
            System.out.println("Баланс банкомата до добавления денег: " + balance);
            //апдеит значении полеи объекта при добавлении денег
            this.countOf20Denomination += countOf20;
            this.countOf50Denomination += countOf50;
            this.countOf100Denomination += countOf100;
            balance = this.calculateBalance();
            System.out.println("Баланс банкомата после добавления денег: " + balance);
        }
    }

    //метод для снятия денег, возвращаемы тип - boolean
    public boolean getMoneyFromCashMachine(int sumOfMoney) {
        boolean isSuccess;
        int balance = this.calculateBalance();
        if (sumOfMoney <= balance) {
            if (sumOfMoney < 20) {
                System.out.println("Запрашиваемая сумма < 20. Доступные номиналы - 20, 50, 100.");
                isSuccess = false;
            } else {
                isSuccess = this.calculateCountOfBanknotesToIssue(sumOfMoney);
            }
        } else {
            System.out.println("Запрашиваемая сумма " + sumOfMoney + " превышает баланс банкомата: " + this.calculateBalance());
            isSuccess = false;
        }
        return isSuccess;
    }

    public boolean calculateCountOfBanknotesToIssue(int sumOfMoney) {
        int tempSumOfMoney = sumOfMoney;
        int countOf100ToIssue = calculateCountOfDenominationByValue(tempSumOfMoney, 100, this.countOf100Denomination);
        tempSumOfMoney = calculateTempSum(tempSumOfMoney, countOf100ToIssue, 100);
        int countOf50ToIssue = calculateCountOfDenominationByValue(tempSumOfMoney, 50, this.countOf50Denomination);
        tempSumOfMoney = calculateTempSum(tempSumOfMoney, countOf50ToIssue, 50);
        int countOf20ToIssue = calculateCountOfDenominationByValue(tempSumOfMoney, 20, this.countOf20Denomination);
        tempSumOfMoney = calculateTempSum(tempSumOfMoney, countOf20ToIssue, 20);
        if (tempSumOfMoney == 0) {
            System.out.println("Запрашиваемую сумму " + sumOfMoney + " невозможно выдать доступным количеством номиналом.");
            return false;
        } else {
            System.out.println("Запрашиваемая сумма " + sumOfMoney + " доступна к выдаче....");
            System.out.printf("Количество банкнот номиналом %d:  %d \n", 100, countOf100ToIssue);
            System.out.printf("Количество банкнот номиналом %d:  %d \n", 50, countOf50ToIssue);
            System.out.printf("Количество банкнот номиналом %d:  %d \n", 20, countOf20ToIssue);
            return true;
        }
    }

    public int calculateBalance() {
        return this.countOf20Denomination * 20 + this.countOf50Denomination * 50 + this.countOf100Denomination * 100;
    }

    public int calculateCountOfDenominationByValue(int sumOfMoney, int denomination, int currentQuantityOfDenomination) {
        int countOfDenomination = sumOfMoney / denomination;

        if (currentQuantityOfDenomination < countOfDenomination) {
            countOfDenomination = currentQuantityOfDenomination;
            if (denomination == 20) {
            }
        }
        return countOfDenomination;
    }

    public int calculateTempSum(int sumOfMoney, int countOfDenomination, int denomination) {
        return sumOfMoney - countOfDenomination * denomination;
    }

}
