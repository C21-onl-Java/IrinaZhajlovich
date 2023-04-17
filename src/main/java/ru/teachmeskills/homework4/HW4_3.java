package ru.teachmeskills.homework4;

import java.util.Arrays;
import java.util.Random;

public class HW4_3 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int sum1 = 0;
        int sum2 = 0;
        Random random = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(20);
            sum1 += array1[i];
        }for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(20);
            sum2 += array2[i];
        }
        System.out.println(Arrays.toString(array1));
        System.out.println("Среднее арифметическое первого массива: " + sum1 / array1.length);
        System.out.println(Arrays.toString(array2));
        System.out.println("Среднее арифметическое второго массива: " + sum2 / array2.length);
        if (sum1 > sum2) System.out.println("Среднее арифметическое первого массива больше");
        else System.out.print("Среднее арифметическое первого массива меньше");
    }
}
