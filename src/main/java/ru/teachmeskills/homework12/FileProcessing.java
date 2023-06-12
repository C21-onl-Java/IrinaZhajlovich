package ru.teachmeskills.homework12;

import java.io.*;
import java.util.Scanner;

import static java.lang.System.in;

public class FileProcessing {

    public static String textline;
    static String s = null;

    public static String getFile() {
        Scanner scanner = new Scanner(in);
        System.out.println("Введите путь к файлу");
        return scanner.nextLine();
    }

    public static File createFileValid() {
        return new File("src\\main\\java\\ru\\teachmeskills\\homework12\\fileValid.txt");
    }

    public static File createFileInValid() {
        return new File("src\\main\\java\\ru\\teachmeskills\\homework12\\fileInValid.txt");
    }

    public static void addNumberValid() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(createFileValid(), true))) {
            bufferedWriter.write(textline);
            bufferedWriter.newLine();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void addNumberInValid(String massage) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(createFileInValid(), true))) {
            if (!s.equals(textline)) {
                bufferedWriter.newLine();
                bufferedWriter.write(textline);
                bufferedWriter.newLine();
                s = textline;
            }
            bufferedWriter.write(massage);
            bufferedWriter.newLine();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void isNumberValid() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(getFile()))) {

            while ((textline = bufferedReader.readLine()) != null) {
                System.out.println("------------------------------------");
                System.out.println(textline);
                String docnum = "docnum";
                String contract = "contract";
                if ((docnum.equals(textline.substring(0, 6)) || contract.equals(textline.substring(0, 8)))
                        && textline.matches("^[a-zA-Z0-9]*$") && textline.length() == 15) {
                    System.out.println(" - Соответствует требованиям");
                    createFileValid();
                    addNumberValid();
                }
                if (!docnum.equals(textline.substring(0, 6)) && !contract.equals(textline.substring(0, 8))) {
                    System.out.println(" - Не начинается с заданной последовательности");
                    createFileInValid();
                    addNumberInValid(" - Не начинается с заданной последовательности");
                }
                if (!textline.matches("^[a-zA-Z0-9]*$")) {
                    System.out.println(" - Содержит недопустимые символы");
                    createFileInValid();
                    addNumberInValid(" - Содержит недопустимые символы");
                }
                if (textline.length() != 15) {
                    System.out.println(" - Длина не равна 15");
                    createFileInValid();
                    addNumberInValid(" - Длина не равна 15");
                }
            }
        } catch (
                Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
