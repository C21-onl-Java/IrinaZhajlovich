package ru.teachmeskills.homework08.task2;

public class Main {
    public static void main(String[] args) {
        HealPlan healPlan = new HealPlan();
        Patient patient = new Patient("Иванов");
        healPlan.assignDoctor(1, patient);
        Patient patient1 = new Patient("Петров");
        healPlan.assignDoctor(2, patient1);
        Patient patient2 = new Patient("Сидоров");
        healPlan.assignDoctor(5, patient2);
    }
}
