package ru.teachmeskills.homework09.task1;

public class Vector3D {
    private double x;
    private double y;
    private double z;
    String DIMENSION3 = "   Это вектор для трехмерной системы координат";

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double calculateLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double calculateScalarMultiple(Vector3D vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public Vector3D calculateSum(Vector3D vector) {
        return new Vector3D(x + vector.x, y + vector.y, z + vector.z);
    }

    public Vector3D calculateDifference(Vector3D vector) {
        return new Vector3D(x - vector.x, y - vector.y, z - vector.z);
    }

    public static void generateVector(int n) {
        Vector3D[] vectors = new Vector3D[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector3D(Math.random(), Math.random(), Math.random());
            System.out.println(vectors[i]);
        }
    }
    public boolean compareVector(Vector3D vector){
        return  super.equals(vector);
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}' + DIMENSION3;
    }
}
