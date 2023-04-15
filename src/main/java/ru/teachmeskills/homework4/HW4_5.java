package ru.teachmeskills.homework4;

import java.util.Arrays;
import java.util.Random;

public class HW4_5 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] newArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            if (array[i] % 2 != 0) newArray[i] = 0;
            else newArray[i] = array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.print(Arrays.toString(newArray));
    }
}
