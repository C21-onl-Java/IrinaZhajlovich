package ru.teachmeskills.homework8_1;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.setNumber("+3752342233");
        phone1.setModel("Samsung");
        phone1.setWeight(200);
        System.out.println(phone1);
        System.out.println(phone1.receiveCall("Иван") + "; номер телефона: " + phone1.getNumber());
        System.out.println(phone1.receiveCall("Андрей", phone1.getNumber()));
        Phone phone2 = new Phone();
        phone2.setNumber("+3752277777");
        phone2.setModel("Xiaomi");
        phone2.setWeight(180);
        System.out.println(phone2);
        System.out.println(phone2.receiveCall("Анна") + "; номер телефона: " + phone2.getNumber());
        Phone phone3 = new Phone();
        phone3.setNumber("+3755555233");
        phone3.setModel("Honor");
        phone3.setWeight(190);
        System.out.println(phone3);
        System.out.println(phone3.receiveCall("Светлана") + "; номер телефона: " + phone3.getNumber());
        phone3.sendMessage("+375295555555", "+375297777777", "+375449999999");
    }
}