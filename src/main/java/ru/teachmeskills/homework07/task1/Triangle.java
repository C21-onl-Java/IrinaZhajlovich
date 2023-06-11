package ru.teachmeskills.homework07.task1;

public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        name = "Triangle";
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    void showName() {

        System.out.println("Triangle");
    }

    @Override
      double calculatePerimeter() {
        return  sideA + sideB + sideC;
    }

    @Override
    double Area() {
        double halfMeter = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(halfMeter * (halfMeter - sideA) * (halfMeter - sideB) * (halfMeter - sideC));
        return area;
    }
}
