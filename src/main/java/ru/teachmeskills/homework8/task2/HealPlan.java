package ru.teachmeskills.homework8.task2;

public class HealPlan {
    public void assignDoctor(int code, Patient patient) {
        if (code == 1) {
            patient.setDoctor(new Surgeon());

        } else if (code == 2) {
            patient.setDoctor(new Dentist());
        } else patient.setDoctor(new Therapist());
        System.out.println("Пациент " + patient.getName() + " направляется к " + patient.getDoctor().heal());

    }
}
