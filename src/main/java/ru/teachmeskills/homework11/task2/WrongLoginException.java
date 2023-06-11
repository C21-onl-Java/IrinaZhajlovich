package ru.teachmeskills.homework11.task2;

public class WrongLoginException extends Exception {
    public static final String MASSAGE_LOGIN = "login не соответствует требованиям!";

    public WrongLoginException() {
        super(MASSAGE_LOGIN);
    }
    public WrongLoginException(String massage){
        super(massage);
    }
}
