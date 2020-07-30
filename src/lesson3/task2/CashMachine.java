package lesson3.task2;

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
    int countOf20Banknotes;
    int countOf50Banknotes;
    int countOf100Banknotes;
    int balance;
    int[] nominal = {20, 50, 100}; // массив для хранение номиналов
    int[] count = new int[3]; // массив для хранения количества

    //конструктор с вх параметрами - количество купюр каждого номинала
    public CashMachine(int countOf20Banknotes, int countOf50Banknotes, int countOf100Banknotes) {
        this.countOf20Banknotes = countOf20Banknotes;
        this.countOf50Banknotes = countOf50Banknotes;
        this.countOf100Banknotes = countOf100Banknotes;
        this.count[0] = countOf20Banknotes;
        this.count[1] = countOf50Banknotes;
        this.count[2] = countOf100Banknotes;

        for (int i = 0; i < 3; i++) {
            this.balance += this.count[i] * nominal[i];
        }
    }

    // метод для добавления денег и вычисления текущего баланса, возвращаемы тип - void
    public void addMoneyToCashMaсhine(int countOf20Banknotes, int countOf50Banknotes, int countOf100Banknotes) {

        System.out.println("Баланс банкомата до добавления денег: " + this.balance);
        this.count[0] += countOf20Banknotes;
        this.count[1] += countOf50Banknotes;
        this.count[2] += countOf100Banknotes;
        int income = countOf20Banknotes * nominal[0] + countOf50Banknotes * nominal[1] + countOf100Banknotes * nominal[2];
        this.balance += income;
        System.out.println("Баланс банкомата после добавления денег: " + this.balance);

    }

    //метод для снятия денег, возвращаемы тип - boolean
    public boolean getMoneyFromCashMachine(int sumOfMoney) {

        boolean isSuccess = false;
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

        int index = nominal.length - 1;
        int[] requiredCount = new int[nominal.length];
        int[] count2 = new int[nominal.length];
        int tempSumOfMoney = sumOfMoney, tempSumOfMoney2 = sumOfMoney;

        while (index != -1) {
            requiredCount[index] = tempSumOfMoney / nominal[index];
            index--;
        }
        System.out.println("Определение количества банкнот номиналом 20, 50, 100 для суммы " + sumOfMoney + " к выдаче...");

        if (getResidueByNominal(sumOfMoney, 20) == 0 && this.count[0] >= requiredCount[0]) {
            System.out.printf("Количество банкнот номиналом %d:  %d \n", nominal[0], requiredCount[0]);
        } else if (getResidueByNominal(sumOfMoney, 50) == 0 && this.count[1] >= requiredCount[1]) {
            System.out.printf("Количество банкнот номиналом %d:  %d \n", nominal[1], requiredCount[1]);
        } else if (this.count[2] >= requiredCount[2]){
            index = nominal.length - 1;
            while (index != -1) {
                count2[index] = tempSumOfMoney2 / nominal[index];
                tempSumOfMoney2 %= nominal[index];
                index--;
            }
            for (int i = 0; i < count2.length; i++) {
                System.out.printf("Количество банкнот номиналом %d:  %d \n", nominal[i], count2[i]);
            }
        }
    }


    // метод для опредлеления мин остатка при % на 20,50,70,90, возвращаемы тип - int
    public static int calculateMinResidue(int sumOfMoney) {

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
    public static int getResidueByNominal(int sumOfMoney, int nominal) {
        return sumOfMoney % nominal;
    }


}
