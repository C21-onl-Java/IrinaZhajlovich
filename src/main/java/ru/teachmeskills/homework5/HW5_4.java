package ru.teachmeskills.homework5;

import java.util.Random;
import java.util.Scanner;

public class HW5_4 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива (х/y)");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[][] arr = new int[x][y];
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                arr[i][j] = random.nextInt(100);
                System.out.print(arr[i][j] + "  ");
                sum += arr[i][j];
            }
            System.out.println();
        }
        System.out.print("Сумма всех элементов массива = " + sum);
    }
}
