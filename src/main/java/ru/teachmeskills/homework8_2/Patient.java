package ru.teachmeskills.homework8_2;

public class Patient {
    String name;
    String dateOfBirth;
    String address;

    public Patient() {

    }

    public Patient(String name, String dateOfBirth, String address) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
