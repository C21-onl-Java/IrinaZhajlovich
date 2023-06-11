package ru.teachmeskills.homework09.task2;

public class Vector3D extends Vector {
    public Vector3D() {
        super(3);
    }

    static void generateVector(int n) {
        Vector3D[] vectors = new Vector3D[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector3D();
            System.out.println(vectors[i]);
        }
    }
}
