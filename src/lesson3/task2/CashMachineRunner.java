package lesson3.task2;

public class CashMachineRunner {

    public static void main(String[] args) {
        CashMachine cashMachine1 = new CashMachine(2, 10, 1);
        cashMachine1.addMoneyToCashMaсhine(1, 10, 1);
        /**
        тестовые значения для метода получения денег
         1) 0
         2) < баланса, = балансу, > баланса
         3) кратность номиналу - 20, 50, 100, 1170, 1500, 450, 40, 67, 1, 19, 30, 40, 50, 70, 80, 90, 130, 170, 190, 21, 31, 51, 111
         4) доступно ли требуемое кол-во номиналов - >= доступного количества, <доступного количества
        */
        cashMachine1.getMoneyFromCashMachine(170);

    }


    }














