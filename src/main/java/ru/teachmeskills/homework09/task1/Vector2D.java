package ru.teachmeskills.homework09.task1;

public class Vector2D {
    private double x;
    private double y;
    String DIMENSION2 = "   Это вектор для двумерной системы координат";

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calculateLength() {
        return Math.sqrt(x * x + y * y);
    }

    public double calculateScalarMultiple(Vector2D vector) {
        return x * vector.x + y * vector.y;
    }

    public Vector2D calculateSum(Vector2D vector) {
        return new Vector2D(x + vector.x, y + vector.y);

    }

    public Vector2D calculateDifference(Vector2D vector) {
        return new Vector2D(x - vector.x, y - vector.y);
    }

    public static void generateVector(int n) {
        Vector2D[] vectors = new Vector2D[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector2D(Math.random(), Math.random());
            System.out.println(vectors[i]);
        }
    }
    public boolean compareVector(Vector2D vector){
        return  super.equals(vector);
    }

    @Override
    public String toString() {
        return "Vector2D{" +
                "x=" + x +
                ", y=" + y +
                '}' + DIMENSION2;
    }
}

