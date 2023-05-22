package ru.teachmeskills.homework9.task2;

import java.util.Arrays;

public abstract class Vector {
    private int dimension;
    private double[] coordinates;

    public Vector(int dimension) {
        this.dimension = dimension;
        this.coordinates = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            coordinates[i] = Math.round(Math.random() * 10);
        }
    }

    public double calculateLength() {
        System.out.println("Длина вектора:");
        double sum = 0;
        for (int i = 0; i < dimension; i++) {
            sum += coordinates[i] * coordinates[i];
        }
        return Math.sqrt(sum);
    }

    public void calculateScalarMultiple() {
        System.out.println("=====================================");
        double[] coordinates2 = new double[dimension];
        double coordinatesScalarMultiple = 0;
        for (int i = 0; i < dimension; i++) {
            coordinates2[i] = Math.round(Math.random() * 10);
            coordinatesScalarMultiple += coordinates[i] * coordinates2[i];
        }
        System.out.println("Координаты векторов:");
        System.out.println(Arrays.toString(coordinates));
        System.out.println(Arrays.toString(coordinates2));
        System.out.println("Скалярное произведение:");
        System.out.println(coordinatesScalarMultiple);
    }

    public void calculateSum() {
        System.out.println("=====================================");
        double[] coordinates2 = new double[dimension];
        double[] coordinatesSum = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            coordinates2[i] = Math.round(Math.random() * 10);
            coordinatesSum[i] = coordinates[i] + coordinates2[i];
        }
        System.out.println("Координаты векторов:");
        System.out.println(Arrays.toString(coordinates));
        System.out.println(Arrays.toString(coordinates2));
        System.out.println("Сложение векторов:");
        System.out.println(Arrays.toString(coordinatesSum));
    }

    public void calculateDifference() {
        System.out.println("=====================================");
        double[] coordinates2 = new double[dimension];
        double[] coordinatesDifference = new double[dimension];
        for (int i = 0; i < dimension; i++) {
            coordinates2[i] = Math.round(Math.random() * 10);
            coordinatesDifference[i] = coordinates[i] - coordinates2[i];
        }
        System.out.println("Координаты векторов:");
        System.out.println(Arrays.toString(coordinates));
        System.out.println(Arrays.toString(coordinates2));
        System.out.println("Разность векторов:");
        System.out.println(Arrays.toString(coordinatesDifference));
    }

    static void generateVector(int n, int dimension) {
        for (int i = 0; i < n; i++) {
            double[] coordinates = new double[dimension];
            for (int j = 0; j < dimension; j++) {
                coordinates[i] = Math.round(Math.random() * 10);
            }
            System.out.println(Arrays.toString(coordinates));
        }

    }

    public boolean compareVector(Vector vector) {
        return super.equals(vector);
    }

    @Override
    public String toString() {
        return "Vector{" +
                "dimension=" + dimension +
                ", coordinates=" + Arrays.toString(coordinates) +
                '}';
    }
}
