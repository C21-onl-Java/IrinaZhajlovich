package ru.teachmeskills.homework5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW5_6 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива (х/y)");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[][] arr = new int[x][y];
        Random random = new Random();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = random.nextInt(100);
            }
            System.out.println(Arrays.toString(arr[i]) + " ");
        }
        System.out.println("--------------------------------------------");
        for (int i = 0; i < x; i++) {
            Arrays.sort(arr[i]);
            System.out.println(Arrays.toString(arr[i]) + " ");
        }
    }
}
