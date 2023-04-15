package ru.teachmeskills.homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW4_4 {
    public static void main(String[] args) {
        System.out.println("Введите число больше 5 и меньше или равно 10");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n <= 5 || n > 10) {
            System.out.println("Вы ввели неверное число. Введите число от 5 до 10");
            n = scanner.nextInt();
        }
        int[] array = new int[n];
        int count = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            if (array[i] % 2 == 0 && array[i] != 0) count++;
            //Если условие (array[i] % 2 == 0) иногда выдает нули вместе с положительными числами. Почему?
        }
        System.out.println(Arrays.toString(array));
        int[] newArray = new int[count];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                newArray[j] = array[i];
                j++;
            }
        }
        System.out.print(Arrays.toString(newArray));
    }
}
