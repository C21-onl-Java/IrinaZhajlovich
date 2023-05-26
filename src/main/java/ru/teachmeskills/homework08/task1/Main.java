package ru.teachmeskills.homework08.task1;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        phone1.setNumber("+3751111111");
        phone1.setModel("Samsung");
        phone1.setWeight(200);
        System.out.println(phone1);
        System.out.println(phone1.receiveCall("Ivan"));
        System.out.println(phone1.receiveCall("Oleg", "+3754444444"));
        phone2.setNumber("+3752222222");
        phone2.setModel("Huawei");
        phone2.setWeight(180);
        System.out.println(phone2);
        System.out.println(phone2.receiveCall("Anna"));
        phone3.setNumber("+3753333333");
        phone3.setModel("iPhone");
        phone3.setWeight(170);
        System.out.println(phone3);
        System.out.println(phone3.receiveCall("Olga"));
        phone1.sendMessage("+3755555555","+3756666666","+3757777777");
    }
}
