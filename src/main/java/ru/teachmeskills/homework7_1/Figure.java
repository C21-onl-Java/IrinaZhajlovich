package ru.teachmeskills.homework7_1;

public abstract class Figure {
    protected String name = "";

    abstract void ShowName();

    abstract double Area();

    abstract double Perimeter();

    String GetName() {
        return name;
    }
}
