package ru.teachmeskills.homework6_1;

public class Main {
    public static void main(String[] args) {
       CreditCard creditCard1 = new CreditCard();
        CreditCard creditCard2 = new CreditCard("BYZZZZZZZZ", 1000);
        CreditCard creditCard3 = new CreditCard("BYHHHHHHHH", 5000);
        System.out.println(creditCard1);
        System.out.println(creditCard2);
        System.out.println(creditCard3);
        System.out.println("-------------------------------------------------");
        creditCard1.addMoney(creditCard1.requestingSum());
        System.out.println(creditCard1);
        creditCard2.addMoney(creditCard2.requestingSum());
        System.out.println(creditCard2);
        System.out.println("-------------------------------------------------");
        creditCard3.withdrawMoney(creditCard3.requestingSum());
        System.out.println(creditCard3);
    }
}

