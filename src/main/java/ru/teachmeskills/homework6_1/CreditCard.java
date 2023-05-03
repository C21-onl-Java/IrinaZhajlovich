package ru.teachmeskills.homework6_1;

import java.util.Scanner;

public class CreditCard {
    private String accountNumber;
    private double accountSum;

    public CreditCard() {

    }

    public CreditCard(String accountNumber, double accountSum) {
        this.accountNumber = accountNumber;
        this.accountSum = accountSum;
    }

    public void addMoney(double sum) {
        this.accountSum += sum;
    }

    public void withdrawMoney(double sum) {
        if (accountSum >= sum) this.accountSum -= sum;
        else System.out.println(" Недостаточно средств");
    }

    public double requestingSum() {
        System.out.println("Введите сумму для счета № " + accountNumber);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    @Override
    public String toString() {
        return
                "Текущий балланс счета № " + accountNumber + " равен " + accountSum;
    }
}


