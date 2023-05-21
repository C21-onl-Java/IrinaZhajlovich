package ru.teachmeskills.homework9.task1;


public class Main {
    public static void main(String[] args) {
        Vector2D a = new Vector2D(3.0, 2.1);
        Vector2D b = new Vector2D(4.5, 3.4);
        System.out.println(a.calculateLength());
        System.out.println(a.calculateScalarMultiple(b));
        System.out.println(a.calculateScalarMultiple(new Vector2D(1.2, 2.8)));
        System.out.println(a.calculateSum(b));
        System.out.println(a.calculateDifference(b));
        System.out.println(b.calculateDifference(a));
        Vector2D.generateVector(4);
        System.out.println(a.compareVector(b));
    }

}
