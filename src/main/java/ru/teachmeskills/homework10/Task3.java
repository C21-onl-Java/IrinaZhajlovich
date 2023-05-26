package ru.teachmeskills.homework10;

import static java.lang.Integer.MAX_VALUE;

//fffff ab f 1234 jkjk
public class Task3 {
    public static void findMinDifferentSymbolsWord(String text) {
        String[] words = text.split(" ");
        String minDifferentSymbolsWord = words[0];
        int minDifferentSymbols = MAX_VALUE;
        for (String word : words) {
            int count = 1;
            String[] letters = word.split("");
            for (int i = 0; i < letters.length - 1; i++) {
                String shorWord = word.substring(i + 1, letters.length);
                if (!shorWord.contains(letters[i])) {
                    count++;
                }
            }
            if (minDifferentSymbols > count) {
                minDifferentSymbols = count;
                minDifferentSymbolsWord = word;
            }
        }
        System.out.println("Слово, в котором число различных символов минимально: " + minDifferentSymbolsWord);
    }
}