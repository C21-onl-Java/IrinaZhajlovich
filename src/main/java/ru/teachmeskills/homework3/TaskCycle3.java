package ru.teachmeskills.homework3;

import java.util.Scanner;

public class TaskCycle3 {
    public static void main(String[] args) {
        System.out.println("Введите целое положительное число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int summ=0;
        for (int i=1; i<number; i++) summ += i;
        System.out.println("Сумма чисел от 1 до "+ number + " равна " + summ);
    }

}
