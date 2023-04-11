package ru.teachmeskills.homework2;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Hello "+s);
   }
}
