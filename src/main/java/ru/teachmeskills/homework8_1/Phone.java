package ru.teachmeskills.homework8_1;

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

    public String receiveCall(String nameCallers) {
        return "Звонит " + nameCallers;
    }

    public String receiveCall(String nameCallers, String number) {
        return "Звонит " + nameCallers + "; номер телефона: " + number;
    }

    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void sendMessage(String... numbers) {
        System.out.println("Сообщения будут отправлены на номера:");
        for (String s : numbers) {
            System.out.println(s);
        }
    }
}
