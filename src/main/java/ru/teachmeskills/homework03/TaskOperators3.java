package ru.teachmeskills.homework03;

import java.util.Scanner;

public class TaskOperators3 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("Число четное");
        } else System.out.println("Число нечетное");
    }
}
