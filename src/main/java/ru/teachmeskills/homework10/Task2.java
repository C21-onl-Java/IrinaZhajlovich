package ru.teachmeskills.homework10;

public class Task2 {
    public static void findWord(String text) {
        String[] words = text.split(" ");
        String minWord = words[words.length - 1];
        String maxWord = words[words.length - 1];
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].length() < minWord.length()) minWord = words[i];
            if (words[i].length() > maxWord.length()) maxWord = words[i];
        }
        System.out.println("Самое короткое слово в тексте: "+ minWord);
        System.out.println("Самое длинное слово в тексте: "+ maxWord);
    }
}
