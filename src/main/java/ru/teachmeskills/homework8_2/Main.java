package ru.teachmeskills.homework8_2;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Ivanov","01.01.2000","Minsk");
        System.out.println(patient.toString());
        TreatmentPlan.setCodeTreatment(1);
        TreatmentPlan.setCodeTreatment(2);
        TreatmentPlan.setCodeTreatment(10);
    }
}
