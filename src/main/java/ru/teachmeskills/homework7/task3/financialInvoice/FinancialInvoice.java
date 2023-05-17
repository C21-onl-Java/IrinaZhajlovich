package ru.teachmeskills.homework7.task3.financialInvoice;

import ru.teachmeskills.homework7.task3.register.Register;

import java.util.Date;
import java.util.Scanner;

public class FinancialInvoice extends Register {
    private String departmentCode;
    private double totalMonthAmount;
    Scanner scanner = new Scanner(System.in);

    public FinancialInvoice() {

    }

    public FinancialInvoice(int numberDocument, Date documentDate, String departmentCode, double totalMonthAmount) {
        super(numberDocument, documentDate);
        this.departmentCode = departmentCode;
        this.totalMonthAmount = totalMonthAmount;
    }

    public void setDepartmentCode() {
        System.out.println("Введите код департамента");
        this.departmentCode = scanner.nextLine();
    }

    public void setTotalMonthAmount() {
        System.out.println("Введите итоговую сумму за месяц");
        this.totalMonthAmount = scanner.nextDouble();
    }

    @Override
    public void saveDocument() {
        if (i < registers.length) {
            setNumberDocument();
            setDocumentDate();
            setDepartmentCode();
            setTotalMonthAmount();
            registers[i] = new FinancialInvoice(numberDocument, documentDate, departmentCode, totalMonthAmount);
            super.saveDocument();
        } else System.out.println("Регистр заполнен!");
    }

    @Override
    public void getDocumentInformation() {
        System.out.println("Финансовая накладная");
        System.out.println("Номер документа: " + numberDocument);
        System.out.println("Дата документа: " + documentDate);
        System.out.println("Код департамента: " + departmentCode);
        System.out.println("Итоговая сумма за месяц: " + totalMonthAmount);
        System.out.println("----------------------------------------------------");
    }
}
