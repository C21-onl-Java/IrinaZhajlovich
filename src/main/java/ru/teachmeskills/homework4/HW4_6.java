package ru.teachmeskills.homework4;

import java.util.Arrays;

public class HW4_6 {
    public static void main(String[] args) {
        String[] arr = {"Victor", "Marina", "Anna", "Jack"};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, "Anna"));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, "Anna"));
    }
}

