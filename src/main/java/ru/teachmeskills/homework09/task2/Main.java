package ru.teachmeskills.homework09.task2;

public class Main {
    public static void main(String[] args) {
        Vector2D vector2D = new Vector2D();
        Vector2D secondVector2D = new Vector2D();
        System.out.println(vector2D.calculateLength());
        vector2D.calculateScalarMultiple();
        vector2D.calculateSum();
        vector2D.calculateDifference();
        System.out.println("=========================================");
        Vector2D.generateVector(5);
        System.out.println("Сравнение векторов:");
        System.out.println(vector2D);
        System.out.println(secondVector2D);
        System.out.println(vector2D.compareVector(secondVector2D));
        System.out.println(vector2D.compareVector(vector2D));
        System.out.println("=========================================");
        Vector.generateVector(2,3);
    }
}