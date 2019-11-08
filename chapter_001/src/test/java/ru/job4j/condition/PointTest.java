package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {
    // 2d
    @Test
    public void distance2dByX() {
        Point first = new Point(0, 0);
        Point second = new Point(2, 0);
        double expected = 2;
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance2dByY() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 100);
        double expected = 100;
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance2dByXY() {
        Point first = new Point(0, 0);
        Point second = new Point(3, 4);
        double expected = 5;
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    // 3d
    @Test
    public void distance3dByX() {
        Point first = new Point(0, 0, 0);
        Point second = new Point(2, 0, 0);
        double expected = 2;
        double out = first.distance3d(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3dByY() {
        Point first = new Point(0, 0, 0);
        Point second = new Point(0, 100, 0);
        double expected = 100;
        double out = first.distance3d(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3dByZ() {
        Point first = new Point(0, 0, 0);
        Point second = new Point(0, 0, 10);
        double expected = 10;
        double out = first.distance3d(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3dByXYZ() {
        Point first = new Point(0, 0, 0);
        Point second = new Point(3, 4, 5);
        double expected = 7.07;
        double out = first.distance3d(second);
        Assert.assertEquals(expected, out, 0.01);
    }
}
