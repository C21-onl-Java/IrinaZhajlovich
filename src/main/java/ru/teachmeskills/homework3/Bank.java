package ru.teachmeskills.homework3;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        System.out.println("Введите сумму вклада");
        Scanner scanner = new Scanner(System.in);
        float sum = scanner.nextFloat();
        System.out.println("Введите количество месяцев");
        int month = scanner.nextInt();
        for (int i = month; i > 0; i--) {
            sum += sum * 7 / 100;
        }
        System.out.println("Сумма вклада с учетом процентов за " + month + " месяцев составит " + sum);
    }
}
