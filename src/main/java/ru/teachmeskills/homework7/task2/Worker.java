package ru.teachmeskills.homework7.task2;

public class Worker implements Post {
    String name = "Worker";

    public Worker() {

    }

    @Override
    public void PrintPost() {
        System.out.println(name);
    }
}
