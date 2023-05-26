package ru.teachmeskills.homework04;

import java.util.Arrays;

public class HW4_7 {
    public static void main(String[] args) {
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        System.out.println(Arrays.toString(sortArr));
        int toSwap;
        for (int i = sortArr.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (sortArr[j] > sortArr[j + 1]) {
                    toSwap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = toSwap;
                }
            }
        }
        System.out.print(Arrays.toString(sortArr));
    }
}


