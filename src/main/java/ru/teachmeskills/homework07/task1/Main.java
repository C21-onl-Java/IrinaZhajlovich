package ru.teachmeskills.homework07.task1;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Circle(3);
        figures[1] = new Triangle(2, 3, 4);
        figures[2] = new Rectangle(5, 3);
        figures[3] = new Rectangle(4, 2);
        figures[4] = new Circle(5);
        double allPerimeter = 0;
        for (Figure figure : figures) {
            figure.showName();
            System.out.println("Площадь фигуры: " + figure.Area());
            System.out.println("Периметр фигуры: " + figure.calculatePerimeter());
            allPerimeter+=figure.calculatePerimeter();
        }
        System.out.println("=================================");
        System.out.println("Периметр всех фигур: "+allPerimeter);
    }

}
