package ru.teachmeskills.homework11.task1;

public class ClientException1 extends Exception {
    public static final String MASSAGE1 = "Номер документа не содержит abc";

    public ClientException1() {
        super(MASSAGE1);
    }
}
