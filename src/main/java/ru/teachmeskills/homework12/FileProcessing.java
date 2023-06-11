package ru.teachmeskills.homework12;

import java.io.*;
import java.util.Scanner;

import static java.lang.System.in;

public class FileProcessing {
    public static String getFile() {
        Scanner scanner = new Scanner(in);
        System.out.println("Введите путь к файлу");
        return scanner.nextLine();
    }

    public static void isNumberValid() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(getFile()))) {
            String textline;
            while ((textline = bufferedReader.readLine()) != null) {
                System.out.println("------------------------------------");
                System.out.println(textline);
                String docnum = "docnum";
                String contract = "contract";
                if ((docnum.equals(textline.substring(0, 6)) || contract.equals(textline.substring(0, 8)))
                        && textline.matches("^[a-zA-Z0-9]*$") && textline.length() == 15) {
                    System.out.println(" - Соответствует требованиям");
                }
                if (!docnum.equals(textline.substring(0, 6)) && !contract.equals(textline.substring(0, 8)))
                    System.out.println(" - Не начинается с заданной последовательности");
                if (!textline.matches("^[a-zA-Z0-9]*$")) System.out.println(" - Содержит недопустимые символы");
                if (textline.length() != 15) System.out.println(" - Длина не равна 15");
            }
        } catch (
                Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
