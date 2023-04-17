package ru.teachmeskills.homework4;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;

public class HW4_2 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] array = new double[n];
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.round(Math.random() * 10);
            sum += array[i];
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Минимальное значение: " + array[0]);
        System.out.println("Максимальное значение: " + array[array.length - 1]);
        System.out.print("Среднее значение: " + sum / array.length);
    }
}