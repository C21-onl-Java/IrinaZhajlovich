package ru.teachmeskills.homework07.task2;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();
        director.PrintPost();
        worker.PrintPost();
        accountant.PrintPost();
    }
}
