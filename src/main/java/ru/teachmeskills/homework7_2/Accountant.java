package ru.teachmeskills.homework7_2;

public class Accountant implements Post {
    String name = "Accountant";

    public Accountant() {

    }

    @Override
    public void PrintPost() {
        System.out.println(name);
    }
}