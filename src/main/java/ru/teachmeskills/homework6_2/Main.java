package ru.teachmeskills.homework6_2;



public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer(2000, "Dell");
        RAM ram = new RAM("DDR", 16);
        Computer computer2 = new Computer(3000, "HP", ram, new HDD("SSD", 1000, "external"));
        Computer computer3 = new Computer(2500, "Acer", new RAM(), new HDD());
        System.out.println(computer1);
        System.out.println(computer2);
        System.out.println(computer3);
    }
}
