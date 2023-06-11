package ru.teachmeskills.homework11.task2;

public class WrongPasswordException extends Exception{
    public static final String MASSAGE_PASSWORD = "Password не соответствует требованиям!";
    public WrongPasswordException(){
        super(MASSAGE_PASSWORD);
    }
    public WrongPasswordException(String massage){
        super(massage);
    }
}
