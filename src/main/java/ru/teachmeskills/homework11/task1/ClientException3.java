package ru.teachmeskills.homework11.task1;

public class ClientException3 extends Exception {
    public static final String MASSAGE3 = "Номер документа не заканчивается на последовательность 1a2b";

    public ClientException3() {
        super(MASSAGE3);
    }
}