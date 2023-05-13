package ru.teachmeskills.homework7.task1;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        name = "Rectangle";
        this.length = length;
        this.width = width;
    }

    @Override
    void ShowName() {
        System.out.println("Rectangle");
    }

    @Override
    double Perimeter() {
        double perimeter = (length + width) * 2;
        return perimeter;
    }

    @Override
    double Area() {
        return length * width;
    }
}
