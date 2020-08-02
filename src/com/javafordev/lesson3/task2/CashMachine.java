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
    private int firstDenomination = 20;
    private int countOfFirstDenomination;
    private int secondDenomination = 50;
    private int countOfSecondDenomination;
    private int thirdDenomination = 100;
    private int countOfThirdDenomination;

    //конструктор с вх параметрами - количество купюр каждого номинала
    public CashMachine(int countOfFirstDenomination, int countOfSecondDenomination, int countOfThirdDenomination) {
        if (countOfFirstDenomination < 0 || countOfSecondDenomination < 0 || countOfThirdDenomination < 0) {
            System.out.println("Для одного из параметров введено отрицательное количество. Проверьте передаваемые в конструктов параметры. ");
        } else {
            this.countOfFirstDenomination = countOfFirstDenomination;
            this.countOfSecondDenomination = countOfSecondDenomination;
            this.countOfThirdDenomination = countOfThirdDenomination;
        }
    }

    // метод для добавления денег и вычисления текущего баланса, возвращаемы тип - void
    public void addMoneyToCashMaсhine(int countOfFirstDenomination, int countOfSecondDenomination, int countOfThirdDenomination) {
        if (countOfFirstDenomination < 0 || countOfSecondDenomination < 0 || countOfThirdDenomination < 0) {
            System.out.println("Для одного из параметров введено отрицательное количество. Проверьте передаваемые в метод параметры. ");
        } else {
            int balance = this.calculateBalance();
            System.out.println("Баланс банкомата до добавления денег: " + balance);
            //апдеит значении полеи объекта при добавлении денег
            this.countOfFirstDenomination += countOfFirstDenomination;
            this.countOfSecondDenomination += countOfSecondDenomination;
            this.countOfThirdDenomination += countOfThirdDenomination;
            balance = this.calculateBalance();
            System.out.println("Баланс банкомата после добавления денег: " + balance);
        }
    }

    //метод для снятия денег, возвращаемы тип - boolean
    public boolean getMoneyFromCashMachine(int sumOfMoney) {
        boolean isSuccess;
        int balance = this.calculateBalance();
        if (sumOfMoney <= balance) {
            if (sumOfMoney < firstDenomination) {
                System.out.println("Запрашиваемая сумма < " + firstDenomination + ". Доступные номиналы - " + firstDenomination + " , " + secondDenomination + " , " + thirdDenomination + " .");
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
        int countOf100ToIssue = calculateCountOfDenominationByValue(tempSumOfMoney, thirdDenomination, this.countOfThirdDenomination);
        tempSumOfMoney = calculateTempSum(tempSumOfMoney, countOf100ToIssue, thirdDenomination);
        int countOf50ToIssue = calculateCountOfDenominationByValue(tempSumOfMoney, secondDenomination, this.countOfSecondDenomination);
        tempSumOfMoney = calculateTempSum(tempSumOfMoney, countOf50ToIssue, secondDenomination);
        int countOf20ToIssue = calculateCountOfDenominationByValue(tempSumOfMoney, firstDenomination, this.countOfFirstDenomination);
        tempSumOfMoney = calculateTempSum(tempSumOfMoney, countOf20ToIssue, firstDenomination);
        if (tempSumOfMoney == 0) {
            System.out.println("Запрашиваемая сумма " + sumOfMoney + " доступна к выдаче....");
            System.out.printf("Количество банкнот номиналом %d:  %d \n", thirdDenomination, countOf100ToIssue);
            System.out.printf("Количество банкнот номиналом %d:  %d \n", secondDenomination, countOf50ToIssue);
            System.out.printf("Количество банкнот номиналом %d:  %d \n", firstDenomination, countOf20ToIssue);
            return true;
        } else {
            System.out.println("Запрашиваемую сумму " + sumOfMoney + " невозможно выдать доступным количеством номиналом.");
            return false;
        }
    }

    public int calculateBalance() {
        return this.countOfFirstDenomination * firstDenomination + this.countOfSecondDenomination * secondDenomination + this.countOfThirdDenomination * thirdDenomination;
    }

    public int calculateCountOfDenominationByValue(int sumOfMoney, int denomination, int currentQuantityOfDenomination) {
        int countOfDenomination = sumOfMoney / denomination;
        if (currentQuantityOfDenomination < countOfDenomination) {
            countOfDenomination = currentQuantityOfDenomination;
        }
        return countOfDenomination;
    }

    public int calculateTempSum(int sumOfMoney, int countOfDenomination, int denomination) {
        return sumOfMoney - countOfDenomination * denomination;
    }
}
