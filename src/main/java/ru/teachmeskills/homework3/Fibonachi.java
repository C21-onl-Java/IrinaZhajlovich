package ru.teachmeskills.homework3;

public class Fibonachi {
    public static void main(String[] args) {
        int count =0;
        int a=0;
        int b=1;
        int c;
        while (count<11) {
            System.out.print(a+"  ");
            c=a+b;
            a=b;
            b=c;
            count++;
        }
    }
}
