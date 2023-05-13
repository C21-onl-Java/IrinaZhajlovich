package ru.teachmeskills.homework8.task1;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {

    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String receiveCall(String name) {
        return "Звонит " + name + " " + getNumber();
    }

    public String receiveCall(String name, String number) {
        return "Звонит " + name + " " + number;
    }

    public void sendMessage(String... number) {
        System.out.println("Сообщения будут отправлены номерам:");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
