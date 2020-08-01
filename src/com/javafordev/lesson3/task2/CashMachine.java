package com.javafordev.lesson3.task2;

import static java.lang.StrictMath.abs;

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
    private int countOf20;
    private int countOf50;
    private int countOf100;

    //конструктор с вх параметрами - количество купюр каждого номинала
    public CashMachine(int countOf20, int countOf50, int countOf100) {

        if (countOf20 < 0 || countOf50 < 0 || countOf100 < 0) {
            System.out.println("Для одного из параметров введено отрицательное количество. Проверьте передаваемые в конструктов параметры. ");
        }
        this.countOf20 = abs(countOf20);
        this.countOf50 = abs(countOf50);
        this.countOf100 = abs(countOf100);
    }

    // метод для добавления денег и вычисления текущего баланса, возвращаемы тип - void
    public void addMoneyToCashMaсhine(int countOf20, int countOf50, int countOf100) {

        if (countOf20 < 0 || countOf50 < 0 || countOf100 < 0) {
            System.out.println("Для одного из параметров введено отрицательное количество. Проверьте передаваемые в метод параметры. ");
        }

        int balance = this.countOf20 * 20 + this.countOf50 * 50 + this.countOf100 * 100;

        System.out.println("Баланс банкомата до добавления денег: " + balance);
        //апдеит значении полеи объекта при добавлении денег
        this.countOf20 += abs(countOf20);
        this.countOf50 += abs(countOf50);
        this.countOf100 += abs(countOf100);
        balance = this.countOf20 * 20 + this.countOf50 * 50 + this.countOf100 * 100;

        System.out.println("Баланс банкомата после добавления денег: " + balance);
    }

    //метод для снятия денег, возвращаемы тип - boolean
    public boolean getMoneyFromCashMachine(int sumOfMoney) {

        boolean isSuccess = false;
        //вычисление баланса динамически на основании текущих значение полеи объекта, после добавления денег значения полеи меняются
        int balance = this.countOf20 * 20 + this.countOf50 * 50 + this.countOf100 * 100;
        int sumOfMoneyBy100 = getResidueByNominal(sumOfMoney, 100);
        // определяем доступна ли запрашивая сумма и можно ли ее выдать без остатка
        if (sumOfMoney <= balance) {
            //проверяем не равна ли запрашиваемая сумма 0
            if (sumOfMoney < 20) {
                System.out.println("Запрашиваемая сумма < 20. Доступные номиналы - 20, 50, 100.");
                //проверяем можно ли выдать запрашиваемую сумму без остатка
            } else if (getResidueByNominal(sumOfMoneyBy100, 20) != 0 && getResidueByNominal(sumOfMoneyBy100, 50) != 0 && getResidueByNominal(sumOfMoneyBy100, 70) != 0 && getResidueByNominal(sumOfMoneyBy100, 90) != 0) {
                System.out.println("Запрашиваемую сумму " + sumOfMoney + " невозможно выдать купюрами номиналом 20, 50, 100 без остатка. Остаток: " + calculateMinResidue(sumOfMoney));
            } else {
                isSuccess = true;
                System.out.println("Запрашиваемая сумма доступна к выдаче....");
                this.calculateCountOfBanknotesToIssue(sumOfMoney);
            }
        } else {
            System.out.println("Запрашиваемая сумма превышает баланс банкомата.");
        }
        return isSuccess;
    }

    //метод определяет какими номиналами выдавать
    public void calculateCountOfBanknotesToIssue(int sumOfMoney) {
        int tempSumOfMoney = sumOfMoney;
        int requiredCountOf20 = sumOfMoney / 20;
        int requiredCountOf50 = sumOfMoney / 50;
        int requiredCountOf100 = sumOfMoney / 100;

        int countOf50ToAddTo100 = (requiredCountOf100 - this.countOf100) * 2;
        int countOf20ToAddTo100 = (requiredCountOf100 - this.countOf100) * 5;
        int sumWithout100 = sumOfMoney % 100;

        System.out.println("Определение количества банкнот номиналом 20, 50, 100 для суммы " + sumOfMoney + " к выдаче...");

        if (getResidueByNominal(sumOfMoney, 20) == 0 && this.countOf20 >= requiredCountOf20) {
            System.out.printf("Количество банкнот номиналом %d:  %d \n", 20, requiredCountOf20);
        } else if (getResidueByNominal(sumOfMoney, 50) == 0 && this.countOf50 >= requiredCountOf50) {
            System.out.printf("Количество банкнот номиналом %d:  %d \n", 50, requiredCountOf50);
        } else if (getResidueByNominal(sumOfMoney, 100) == 0 && this.countOf100 >= requiredCountOf100) {
            System.out.printf("Количество банкнот номиналом %d:  %d \n", 100, requiredCountOf100);
        } else if (this.countOf100 >= requiredCountOf100 || this.countOf50 >= (countOf50ToAddTo100 + sumWithout100 / 50) || this.countOf20 >= (countOf20ToAddTo100 + sumWithout100 / 20)) {

            int countOf100ToIssue=0, countOf50ToIssue=0, countOf20ToIssue=0;

            // если номиналов 100 хватает, основную сумму выдаем 100
            if (this.countOf100 >= requiredCountOf100) {
                System.out.println("AAAA");
                countOf100ToIssue = requiredCountOf100;
                tempSumOfMoney %= 100;
                countOf50ToIssue = tempSumOfMoney / 50;
                tempSumOfMoney %= 50;
                countOf20ToIssue = tempSumOfMoney / 20;
                //если 100 не хватает, но 50 хватает => основную сумму выдаем 50
            } else if (this.countOf100 < requiredCountOf100 && this.countOf50 >= (countOf50ToAddTo100 + sumWithout100 / 50) && this.countOf20 < (countOf20ToAddTo100 + sumWithout100 / 20) ) {
                countOf100ToIssue = this.countOf100;
                countOf50ToIssue = (tempSumOfMoney-countOf100ToIssue*100)/50;
                tempSumOfMoney = (tempSumOfMoney-countOf100ToIssue*100)%50;
                countOf20ToIssue = tempSumOfMoney/20;
                //если 100 не хватает и 50 не хватает чтобы дополнить до 100, а 20 хватает => основную сумму выдаем 20
            } else if (this.countOf100 < requiredCountOf100 && this.countOf50 < (countOf50ToAddTo100 + sumWithout100 / 50) && this.countOf50 < requiredCountOf50 && this.countOf20 >= (countOf20ToAddTo100 + sumWithout100 / 20)){
                countOf100ToIssue = this.countOf100;
                countOf50ToIssue = this.countOf50;
                countOf20ToIssue = (tempSumOfMoney-countOf100ToIssue*100-countOf50ToIssue*50)/20;
            }

            System.out.printf("Количество банкнот номиналом %d:  %d \n", 100, countOf100ToIssue);
            System.out.printf("Количество банкнот номиналом %d:  %d \n", 50, countOf50ToIssue);
            System.out.printf("Количество банкнот номиналом %d:  %d \n", 20, countOf20ToIssue);

        } else

            System.out.println("Запрашиваемая сумма не может быть выдана доступным количеством номиналов");
    }


    // метод для опредлеления мин остатка при % на 20,50,70,90, возвращаемы тип - int
    public int calculateMinResidue(int sumOfMoney) {

        int sumOfMoneyBy100 = getResidueByNominal(sumOfMoney, 100);
        int[] residueByNominal = new int[4];
        residueByNominal[0] = getResidueByNominal(sumOfMoneyBy100, 20);
        residueByNominal[1] = getResidueByNominal(sumOfMoneyBy100, 50);
        residueByNominal[2] = getResidueByNominal(sumOfMoneyBy100, 70);
        residueByNominal[3] = getResidueByNominal(sumOfMoneyBy100, 90);

        int minResidue = residueByNominal[0];

        for (int i = 0; i < residueByNominal.length; i++) {
            if (residueByNominal[i] < minResidue) {
                minResidue = residueByNominal[i];
            }
        }
        return minResidue;
    }

    // метод для опредлеления остатка по модулю, возвращаемы тип - int
    public int getResidueByNominal(int sumOfMoney, int nominal) {
        return sumOfMoney % nominal;
    }

}
