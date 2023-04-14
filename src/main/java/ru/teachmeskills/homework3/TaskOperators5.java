package ru.teachmeskills.homework3;

import java.util.Scanner;

public class TaskOperators5 {
    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 7");
        Scanner scanner = new Scanner(System.in);
        int colour = scanner.nextInt();
        switch (colour) {
            case 1:
                System.out.println("Красный");
                break;
            case 2:
                System.out.println("Оранжевый");
                break;
            case 3:
                System.out.println("Желтый");
                break;
            case 4:
                System.out.println("Зеленый");
                break;
            case 5:
                System.out.println("Голубой");
                break;
            case 6:
                System.out.println("Синий");
                break;
            case 7:
                System.out.println("Фиолетовый");
                break;
            default:
                System.out.println("Некорректное число");
        }
    }
}
