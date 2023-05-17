package ru.teachmeskills.homework7_2;

public class Director implements Post {
    String name = "Director";

    public Director() {

    }

    @Override
    public void PrintPost() {
        System.out.println(name);
    }
}
