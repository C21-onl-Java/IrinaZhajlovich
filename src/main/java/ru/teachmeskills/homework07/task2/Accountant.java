package ru.teachmeskills.homework07.task2;

public class Accountant implements Post {
    String name = "Accountant";

    public Accountant() {

    }

    @Override
    public void PrintPost() {
        System.out.println(name);
    }
}
