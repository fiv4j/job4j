package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double halfPerimeter = (a + b + c) / 2;
        return Math.sqrt(
                halfPerimeter
                        * (halfPerimeter - a)
                        * (halfPerimeter - b)
                        * (halfPerimeter - c)
        );
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
