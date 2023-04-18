package ru.teachmeskills.homework5;

import java.util.Random;
import java.util.Scanner;

public class HW5_1 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива (х/y/z)");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int[][][] array = new int[x][y][z];
        Random random = new Random();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    array[i][j][k] = random.nextInt(100);
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.print("   ");
            }
            System.out.println();
        }
        System.out.println("Введите число, на которое хотите увеличить элементы массива");
        int s = scanner.nextInt();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    array[i][j][k] += s;
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.print("   ");
            }
            System.out.println();
        }
    }
    }

