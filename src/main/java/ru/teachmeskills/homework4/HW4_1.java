package ru.teachmeskills.homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW4_1 {
    public static void main(String[] args) {
        System.out.println("Введите число от 0 до 20");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[10];
        Random random = new Random();
        boolean test = false;
        int coount = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
            if (array[i] == n) {
                test = true;
                coount++;
            }
        }
        System.out.println(Arrays.toString(array));
        int[] newArray = new int[array.length - coount];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != n) {
                newArray[j] = array[i];
                j++;
            }
        }
        if (!test) {
            System.out.println("Такого числа в массиве нет");
        } else {
            System.out.println("Новый массив:");
            System.out.println(Arrays.toString(newArray));
        }
    }
}