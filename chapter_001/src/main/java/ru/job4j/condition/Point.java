package ru.job4j.condition;

public class Point {
    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        result = distance(20, 15, -5, 0);
        System.out.println("result (20, 15) to (-5, 0) " + result);

        result = distance(0, -80, 112, -42);
        System.out.println("result (0, -80) to (112, -42) " + result);
    }
}
