package ru.teachmeskills.homework07.task1;

public abstract class Figure {
    protected String name = "";

    abstract void showName();

    abstract double Area();

    abstract double calculatePerimeter();

    String GetName() {
        return name;
    }
}
