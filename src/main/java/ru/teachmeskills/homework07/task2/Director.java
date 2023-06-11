package ru.teachmeskills.homework07.task2;

public class Director implements Post {
    String name = "Director";

    public Director() {

    }

    @Override
    public void PrintPost() {
        System.out.println(name);
    }
}
