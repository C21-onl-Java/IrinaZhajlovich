package ru.teachmeskills.homework3;

import java.util.Scanner;

public class TaskOperators1 {
    public static void main(String[] args) {
        System.out.println("Введите номер месяца");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n){
            case 12:
            case 1:
            case 2:
            System.out.println("Зима");
            break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
            break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
            break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
            break;
            default:
                System.out.println("Некорректное число");
        }
    }
}
