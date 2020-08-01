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
            this.countOf20Denomination = 0;
            this.countOf50Denomination = 0;
            this.countOf100Denomination = 0;
        }
        this.countOf20Denomination = countOf20;
        this.countOf50Denomination = countOf50;
        this.countOf100Denomination = countOf100;
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

        boolean isSuccess = false;
        //вычисление баланса динамически на основании текущих значение полеи объекта, после добавления денег значения полеи меняются
        int balance = this.calculateBalance();
        int sumOfMoneyBy100 = getResidueByNominal(sumOfMoney, 100);
        // определяем доступна ли запрашивая сумма и можно ли ее выдать без остатка
        if (sumOfMoney <= balance) {
            //проверяем не равна ли запрашиваемая сумма 0
            if (sumOfMoney < 20) {
                System.out.println("Запрашиваемая сумма < 20. Доступные номиналы - 20, 50, 100.");
                //проверяем можно ли выдать запрашиваемую сумму без остатка
            } else {
                isSuccess = true;
                System.out.println("Запрашиваемая сумма доступна к выдаче....");
                this.getCountOfBanknotesToIssue(sumOfMoney);
            }
        } else {
            System.out.println("Запрашиваемая сумма превышает баланс банкомата.");
        }
        return isSuccess;
    }

    // метод для опредлеления остатка по модулю, возвращаемы тип - int
    public int getResidueByNominal(int sumOfMoney, int nominal) {
        return sumOfMoney % nominal;
    }


    public void getCountOfBanknotesToIssue(int sumOfMoney) {

        int tempSumOfMoney = sumOfMoney;
        int countOf100ToIssue = 0, countOf50ToIssue = 0, countOf20ToIssue = 0;
        int requiredCountOf20 = 0;
        int requiredCountOf50 = 0;
        int requiredCountOf100 = sumOfMoney / 100;
        int residue = 0;

        if (this.countOf100Denomination >= requiredCountOf100) {

            countOf100ToIssue = requiredCountOf100;
            tempSumOfMoney %= 100;
            countOf50ToIssue = tempSumOfMoney / 50;
            tempSumOfMoney %= 50;
            countOf20ToIssue = tempSumOfMoney / 20;
            residue = tempSumOfMoney % 20;


        } else {

            countOf100ToIssue = this.countOf100Denomination;
            tempSumOfMoney = tempSumOfMoney - countOf100ToIssue * 100;
            requiredCountOf50 = tempSumOfMoney / 50;

            if (this.countOf50Denomination >= requiredCountOf50) {

                countOf50ToIssue = requiredCountOf50;
                tempSumOfMoney = tempSumOfMoney - countOf50ToIssue * 50;
                requiredCountOf20 = tempSumOfMoney / 20;
                residue = tempSumOfMoney % 20;

                if (this.countOf20Denomination >= requiredCountOf20) {
                    countOf20ToIssue = requiredCountOf20;
                } else {
                    System.out.println("Запрашиваемая сумма не может быть выдана доступным количеством номиналов");
                }
            } else {

                countOf50ToIssue = this.countOf50Denomination;
                tempSumOfMoney = tempSumOfMoney - countOf50ToIssue * 50;
                requiredCountOf20 = tempSumOfMoney / 20;
                residue = tempSumOfMoney % 20;

                if (this.countOf20Denomination >= requiredCountOf20) {
                    countOf20ToIssue = requiredCountOf20;
                } else {
                    System.out.println("Запрашиваемая сумма не может быть выдана доступным количеством номиналов");
                }
            }
        }
        if (residue == 0) {
            System.out.printf("Количество банкнот номиналом %d:  %d \n", 100, countOf100ToIssue);
            System.out.printf("Количество банкнот номиналом %d:  %d \n", 50, countOf50ToIssue);
            System.out.printf("Количество банкнот номиналом %d:  %d \n", 20, countOf20ToIssue);
        } else {
            System.out.println("Запрашиваемую сумму " + sumOfMoney + " невозможно выдать купюрами номиналом 20, 50, 100 без остатка. Остаток: " + residue);
        }
    }

    public int calculateBalance(){
        return this.countOf20Denomination*20 + this.countOf50Denomination*50 + this.countOf100Denomination*100;
    }

}
