package ru.teachmeskills.homework5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW5_5 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива (х/y)");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[][] arr = new int[x][y];
        int min = Math.min(x, y);
        int[] diagonalL = new int[min];
        int[] diagonalR = new int[min];
        Random random = new Random();
        int k = min - 1;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = random.nextInt(100);
                if (i < min) diagonalL[i] = arr[i][i];
            }
            if (k >= 0) {
                diagonalR[i] = arr[i][k];
                k--;
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("--------------------");
        System.out.println(Arrays.toString(diagonalL));
        System.out.println(Arrays.toString(diagonalR));
    }
}
