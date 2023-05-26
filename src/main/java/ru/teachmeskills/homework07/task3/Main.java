package ru.teachmeskills.homework07.task3;

import ru.teachmeskills.homework07.task3.contractDeliveryOfGoods.ContractDeliveryOfGoods;
import ru.teachmeskills.homework07.task3.contractEmployee.ContractEmployee;
import ru.teachmeskills.homework07.task3.financialInvoice.FinancialInvoice;


public class Main {
    public static void main(String[] args) {
        int j = 0;
        while (j < 11) {
            ContractDeliveryOfGoods contractDeliveryOfGoods = new ContractDeliveryOfGoods();
            contractDeliveryOfGoods.saveDocument();
            System.out.println("----------------------------------------------------");
            contractDeliveryOfGoods.getDocumentInformation();
            j++;
            ContractEmployee contractEmployee = new ContractEmployee();
            contractEmployee.saveDocument();
            System.out.println("----------------------------------------------------");
            contractEmployee.getDocumentInformation();
            j++;
            FinancialInvoice financialInvoice = new FinancialInvoice();
            financialInvoice.saveDocument();
            System.out.println("----------------------------------------------------");
            financialInvoice.getDocumentInformation();
            j++;
        }
    }
}
