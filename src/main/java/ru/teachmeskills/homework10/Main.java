package ru.teachmeskills.homework10;


import ru.teachmeskills.homework11.task1.ClientException3;

public class Main {
    public static void main(String[] args) throws ClientException3 {
        String documentNumber = "1234-ACb-5678-def-1v2b";
        System.out.println(Task1.getFirstTwoBlocksOfNumbers(documentNumber));
        System.out.println(Task1.getMaskedNumber(documentNumber));
        System.out.println(Task1.getLetters(documentNumber));
        System.out.println(Task1.getLowerLetters(documentNumber));
        System.out.println(Task1.showUpperLetters(documentNumber));
        try {
            Task1.compareLetters(documentNumber);
        } catch (Exception exception1) {
            exception1.printStackTrace();
        }
        try {
            System.out.println(Task1.compareFirstNumbers(documentNumber));
        } catch (Exception exception2) {
            exception2.printStackTrace();
        }
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
