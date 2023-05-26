package ru.teachmeskills.homework10;

import java.util.Scanner;

public class Task4 {
    public static void isWordPalindrome(String text){
        String[] words = text.split(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 0 до "+(words.length-1));
        int i = scanner.nextInt();
        StringBuilder palindromeWord =new StringBuilder(words[i]);
        if (words[i].equalsIgnoreCase(palindromeWord.reverse().toString()))
            System.out.println("Слово " + words[i] + " - палиндром");
        else System.out.println("Слово "+words[i]+" - не палиндром");
    }
}
