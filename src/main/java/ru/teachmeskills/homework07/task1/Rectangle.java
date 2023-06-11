package ru.teachmeskills.homework07.task1;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        name = "Rectangle";
        this.length = length;
        this.width = width;
    }

    @Override
    void showName() {
        System.out.println("Rectangle");
    }

    @Override
    double calculatePerimeter() {
        double perimeter = (length + width) * 2;
        return perimeter;
    }

    @Override
    double Area() {
        return length * width;
    }
}
