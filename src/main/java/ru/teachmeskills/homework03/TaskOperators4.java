package ru.teachmeskills.homework03;

import java.util.Scanner;

public class TaskOperators4 {
    public static void main(String[] args) {
        System.out.println("Введите температуру на улице");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.println("Тепло");
        } else if (t <= -20) {
            System.out.println("Холодно");
        } else System.out.println("Нормально");
    }
}
