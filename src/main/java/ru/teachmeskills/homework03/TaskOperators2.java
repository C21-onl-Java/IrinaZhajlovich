package ru.teachmeskills.homework03;

import java.util.Scanner;

public class TaskOperators2 {
    public static void main(String[] args) {
        System.out.println("Введите номер месяца");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 12 || n == 1 || n == 2) {
            System.out.println("Зима");
        } else if (n >= 3 && n <= 5) {
            System.out.println("Весна");
        } else if (n >= 6 && n <= 8) {
            System.out.println("Лето");
        } else if (n >= 9 && n <= 11) {
            System.out.println("Осень");
        } else
            System.out.println("Некорректное число");
    }
}
