package ru.teachmeskills.homework07.task1;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        name = "Circle";
        this.radius = radius;
    }

    @Override
    void showName() {

        System.out.println("Circle");
    }

    @Override
    double calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    @Override
    double Area() {
        return Math.PI * radius * radius;
    }
}
