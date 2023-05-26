package ru.teachmeskills.homework10;

import static java.lang.System.*;

public class Task1 {

    public static String showFirstTwoBlocksOfNumbers(String text) {
        String[] splitText = text.split("-");
        return String.join("-", splitText[0], splitText[2]);
    }


    public static String showMaskedNumber(String text) {
        String[] splitText = text.split("-");
        splitText[1] = "***";
        splitText[3] = splitText[1];
        return String.join("-", splitText);
    }

    //XXXX-YYY-XXXX-YYY-XYXY
    public static StringBuilder showLetters(String text) {
        StringBuilder letters = new StringBuilder(text);
        char ch = '/';
        letters.delete(0, 5).delete(3, 8).deleteCharAt(8).setCharAt(3, ch);
        letters.setCharAt(7, ch);
        letters.setCharAt(9, ch);
        return letters;
    }

    public static String showLowerLetters(String text) {
        return showLetters(text).toString().toLowerCase();
    }

    public static String showUpperLetters(String text) {
        return "Letteers:" + showLetters(text).toString().toUpperCase();
    }

    public static void compareLetters(String text) {
        String[] splitText = text.split("-");
        String abc = "abc";
        if ((splitText[1].toLowerCase().equals(abc)) || (splitText[3].toLowerCase().equals(abc))) {
            out.println("Номер документа содержит abc");
        } else out.println("Номер документа не содержит abc");
    }

    public static boolean compareFirstNumbers(String text) {
        String numbers = "555";
        return numbers.equals(text.substring(0, 3));
    }

    public static void compareLastBlock(String text) {
        String[] splitText = text.split("-");
        String lastSymbols = "1a2b";
        if (lastSymbols.equals(splitText[4])) {
            out.println("Номер документа заканчивается на последовательность 1a2b");
        } else out.println("Номер документа не заканчивается на последовательность 1a2b");
    }
}