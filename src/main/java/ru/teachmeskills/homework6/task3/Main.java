package ru.teachmeskills.homework6.task3;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(4, 5, 10);
        System.out.println(atm);
        System.out.println("Добавдение денег в банкомат");
        atm.addBanknote(10, 15, 1);
        System.out.println(atm);
        System.out.println("-------------------------------------------------------");
        System.out.println("Снятие денег");
        ATM atm1 = new ATM();
        System.out.println(atm1.takeBanknote(50));
        System.out.println(atm.takeBanknote(5));
        System.out.println(atm.takeBanknote(710));
        System.out.println(atm.takeBanknote(230));


    }
}
