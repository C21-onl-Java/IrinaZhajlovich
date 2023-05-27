package ru.teachmeskills.homework11.task1;

public class ClientException2 extends Exception {
    public static final String MASSAGE2 = "Номер документа не начинается на 555";

    public ClientException2() {
        super(MASSAGE2);
    }
}
