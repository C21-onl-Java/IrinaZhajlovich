package ru.teachmeskills.homework8_2;

public class TreatmentPlan implements Doctor {
    public int codeTreatment;

    public static void setCodeTreatment(int codeTreatment) {
        System.out.println("Код лечения: " + codeTreatment);
        Doctor.treat();
        if (codeTreatment == 1) {
            Surgeon.treat();
        } else if (codeTreatment == 2) {
            Dentist.treat();
        } else
            Internist.treat();
    }
}


