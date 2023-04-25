package ru.teachmeskills.homework6_2;

public class RAM {
    private String name;
    private int volume;


    public RAM() {

    }

    public RAM(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
