package ru.teachmeskills.homework7.task3.register;

import ru.teachmeskills.homework7.task3.Correctable;


import java.util.Date;
import java.util.Scanner;

public abstract class Register implements Correctable {
    public int numberDocument;
    public Date documentDate;
    public static int i = 0;
    public Register[] registers = new Register[10];
    Scanner scanner = new Scanner(System.in);

    public Register() {

    }

    public Register(int numberDocument, Date documentDate) {
        this.numberDocument = numberDocument;
        this.documentDate = documentDate;
    }

    public void setNumberDocument() {
        System.out.println("Введите номер документа");
        this.numberDocument = scanner.nextInt();
    }

    public void setDocumentDate() {
        this.documentDate = new Date();
    }

    public void saveDocument() {
        System.out.println("Register.saveDocument  " + i);
        i++;
    }
}





