package ru.teachmeskills.homework10;

import ru.teachmeskills.homework11.task1.ClientException1;
import ru.teachmeskills.homework11.task1.ClientException2;
import ru.teachmeskills.homework11.task1.ClientException3;

import static java.lang.System.*;

public class Task1 {

    public static String getFirstTwoBlocksOfNumbers(String text) {
        String[] splitText = text.split("-");
        return String.join("-", splitText[0], splitText[2]);
    }


    public static String getMaskedNumber(String text) {
        String[] splitText = text.split("-");
        splitText[1] = "***";
        splitText[3] = splitText[1];
        return String.join("-", splitText);
    }

    //XXXX-YYY-XXXX-YYY-XYXY
    public static StringBuilder getLetters(String text) {
        StringBuilder letters = new StringBuilder(text);
        char ch = '/';
        letters.delete(0, 5).delete(3, 8).deleteCharAt(8).setCharAt(3, ch);
        letters.setCharAt(7, ch);
        letters.setCharAt(9, ch);
        return letters;
    }

    public static String getLowerLetters(String text) {
        return getLetters(text).toString().toLowerCase();
    }

    public static String showUpperLetters(String text) {
        return "Letteers:" + getLetters(text).toString().toUpperCase();
    }

    public static void compareLetters(String text) throws Exception{
        String[] splitText = text.split("-");
        String abc = "abc";
        if ((splitText[1].toLowerCase().equals(abc)) || (splitText[3].toLowerCase().equals(abc))) {
            out.println("Номер документа содержит abc");
        } throw new ClientException1();
    }

    public static boolean compareFirstNumbers(String text)  throws ClientException2{
        String numbers = "555";
      if(numbers.equals(text.substring(0, 3))) return true;
      throw new ClientException2();
    }

    public static void compareLastBlock(String text) throws ClientException3 {
        String[] splitText = text.split("-");
        String lastSymbols = "1a2b";
        if (lastSymbols.equals(splitText[4])) {
            out.println("Номер документа заканчивается на последовательность 1a2b");
        } throw new ClientException3();
    }
}