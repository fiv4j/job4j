package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;
    private int y;
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this(x, y);
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public static void main(String[] args) {
        Point first = new Point(0, 0);
        double result = first.distance(new Point(2, 0));
        System.out.println("result (0, 0) to (2, 0) " + result);

        Point second = new Point(20, 15);
        result = second.distance(new Point(-5, 0));
        System.out.println("result (20, 15) to (-5, 0) " + result);

        Point third = new Point(0, -80);
        result = third.distance(new Point(112, -42));
        System.out.println("result (0, -80) to (112, -42) " + result);
    }
}
