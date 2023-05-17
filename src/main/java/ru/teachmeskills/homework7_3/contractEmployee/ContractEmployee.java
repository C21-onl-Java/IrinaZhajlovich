package ru.teachmeskills.homework7_3.contractEmployee;

import ru.teachmeskills.homework7_3.register.Register;

import java.util.Date;
import java.util.Scanner;


public class ContractEmployee extends Register {
    private String nameEmployee;
    private Date finalContractDate;
    Scanner scanner = new Scanner(System.in);

    public ContractEmployee() {

    }

    public ContractEmployee(int numberDocument, Date documentDate, String nameEmployee, Date finalContractDate) {
        super(numberDocument, documentDate);
        this.nameEmployee = nameEmployee;
        this.finalContractDate = finalContractDate;
    }

    public void setNameEmployee() {
        System.out.println("Введите имя сотрудника");
        nameEmployee = scanner.nextLine();
    }

    public void setFinalContractDate() {
        finalContractDate = new Date();
    }

    @Override
    public void saveDocument() {
        if (i < registers.length) {
            setNumberDocument();
            setDocumentDate();
            setNameEmployee();
            setFinalContractDate();
            registers[i] = new ContractEmployee(numberDocument, documentDate, nameEmployee, finalContractDate);
            super.saveDocument();
        } else System.out.println("Регистр заполнен!");
    }

    @Override
    public void getDocumentInformation() {
        System.out.println("Контракт с сотрудником");
        System.out.println("Номер документа: " + numberDocument);
        System.out.println("Дата документа: " + documentDate);
        System.out.println("Имя сотрудника: " + nameEmployee);
        System.out.println("Дата окончания контракта: " + finalContractDate);
        System.out.println("----------------------------------------------------");
    }
}
