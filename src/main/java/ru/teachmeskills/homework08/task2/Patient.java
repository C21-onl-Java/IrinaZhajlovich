package ru.teachmeskills.homework08.task2;

public class Patient {
    private Doctor doctor;
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getName() {
        return name;
    }
}
