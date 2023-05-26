package ru.teachmeskills.homework10;

public class Task5 {
    public static void getDoubleLetters(String text) {
        String[] letters = text.split("");
        for (String letter : letters) System.out.print(String.join("", letter, letter));
    }
}
