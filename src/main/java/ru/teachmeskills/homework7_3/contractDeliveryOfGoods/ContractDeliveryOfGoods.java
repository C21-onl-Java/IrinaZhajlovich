package ru.teachmeskills.homework7_3.contractDeliveryOfGoods;

import ru.teachmeskills.homework7_3.register.Register;

import java.util.Date;
import java.util.Scanner;

public class ContractDeliveryOfGoods extends Register {
    private String typeOfGoods;
    private int numberOfGoods;
    Scanner scanner = new Scanner(System.in);

    public ContractDeliveryOfGoods() {

    }

    public ContractDeliveryOfGoods(int numberDocument, Date documentDate, String typeOfGoods, int numberOfGoods) {
        super(numberDocument, documentDate);
        this.typeOfGoods = typeOfGoods;
        this.numberOfGoods = numberOfGoods;
    }

    public void setTypeOfGoods() {
        System.out.println("Введите тип товаров");
        this.typeOfGoods = scanner.nextLine();
    }

    public void setNumberOfGoods() {
        System.out.println("Введите количество товаров");
        this.numberOfGoods = scanner.nextInt();
    }


    @Override
    public void saveDocument() {
        if (i < registers.length) {
            setNumberDocument();
            setDocumentDate();
            setTypeOfGoods();
            setNumberOfGoods();
            registers[i] = new ContractDeliveryOfGoods(numberDocument, documentDate, typeOfGoods, numberOfGoods);
            super.saveDocument();
        } else System.out.println("Регистр заполнен!");
    }

    @Override
    public void getDocumentInformation() {
        System.out.println("Контракт на поставку товаров");
        System.out.println("Номер документа: " + numberDocument);
        System.out.println("Дата документа: " + documentDate);
        System.out.println("Тип товаров: " + typeOfGoods);
        System.out.println("Количество товаров: " + numberOfGoods);
        System.out.println("----------------------------------------------------");
    }

}

