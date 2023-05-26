package ru.teachmeskills.homework06.task3;

public class ATM {
    private int countBanknote20;
    private int countBanknote50;
    private int countBanknote100;

    public ATM() {

    }

    public ATM(int countBanknote20, int countBanknote50, int countBanknote100) {
        this.countBanknote20 = countBanknote20;
        this.countBanknote50 = countBanknote50;
        this.countBanknote100 = countBanknote100;
    }

    public void addBanknote(int b20, int b50, int b100) {
        countBanknote20 += b20;
        countBanknote50 += b50;
        countBanknote100 += b100;
    }

    public boolean takeBanknote(int sum) {
        System.out.println("Вы хотите снять   " + sum + " рублей");
        boolean isCorrect = true;
        int count20 = 0;
        int count50 = 0;
        int count100 = 0;
        int allMoney = countBanknote20 * 20 + countBanknote50 * 50 + countBanknote100 * 100;
        System.out.println("В банкомате сейчас " + allMoney + " рублей");
        if (sum > allMoney || sum % 10 != 0 || sum == 0) {
            isCorrect = false;
        } else {
            while (sum > 130 && countBanknote100 > count100) {
                sum -= 100;
                count100++;
            }
            while (sum >= 50 && countBanknote50 > count50) {
                sum -= 50;
                count50++;
                if (sum % 20 == 0) break;
            }
            while (sum >= 20 && countBanknote20 > count20) {
                sum -= 20;
                count20++;
            }
        }
        if (sum == 0) {
            countBanknote20 -= count20;
            countBanknote50 -= count50;
            countBanknote100 -= count100;
            System.out.println("Снято банкнот номиналом 100: " + count100);
            System.out.println("Снято банкнот номиналом 50: " + count50);
            System.out.println("Снято банкнот номиналом 20: " + count20);
        } else isCorrect = false;
        return isCorrect;

    }

    @Override
    public String toString() {
        return "ATM{" +
                "countBanknote20=" + countBanknote20 +
                ", countBanknote50=" + countBanknote50 +
                ", countBanknote100=" + countBanknote100 +
                '}';
    }
}
