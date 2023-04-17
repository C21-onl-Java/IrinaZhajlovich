package ru.teachmeskills.homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW4_0 {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Введите число от 0 до 10");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Random random = new Random();
        boolean isCorrect = false;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        for (int i : array) {
            if (i == n) {
                isCorrect = true;
                System.out.println("Заданное число входит в массив");
                break;
            }
        }
        if (!isCorrect) System.out.println("Заданное число не входит в массив");
    }
}
