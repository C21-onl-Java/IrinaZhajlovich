package ru.teachmeskills.homework6_2;

public class Computer {
    private int cost;
    private  String model;
    private RAM ram;
    private HDD hdd;

    public Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
    }

    public Computer(int cost, String model, RAM ram, HDD hdd) {
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cost='" + cost + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }
}
