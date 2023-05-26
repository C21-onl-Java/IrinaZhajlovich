package ru.teachmeskills.homework10;


public class Main {
    public static void main(String[] args) {
        String documentNumber = "1234-ABC-5678-def-1a2b";
        System.out.println(Task1.showFirstTwoBlocksOfNumbers(documentNumber));
        System.out.println(Task1.showMaskedNumber(documentNumber));
        System.out.println(Task1.showLetters(documentNumber));
        System.out.println(Task1.showLowerLetters(documentNumber));
        System.out.println(Task1.showUpperLetters(documentNumber));
        Task1.compareLetters(documentNumber);
        System.out.println(Task1.compareFirstNumbers(documentNumber));
        Task1.compareLastBlock(documentNumber);
        System.out.println("=================================");
        String text = "Anna fffff ab f 1234 jkjk";
        Task2.findWord(text);
        System.out.println("=================================");
        Task3.findMinDifferentSymbolsWord(text);
        System.out.println("=================================");
        Task4.isWordPalindrome(text);
        System.out.println("=================================");
        Task5.getDoubleLetters("Hello");
    }
}
