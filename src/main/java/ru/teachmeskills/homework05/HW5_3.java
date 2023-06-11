package ru.teachmeskills.homework05;

public class HW5_3 {
    public static void main(String[] args) {
        int[][] array1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] array2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] array3 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array3[i][j] = array1[i][i] * array2[i][j];
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
