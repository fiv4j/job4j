package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {
    @Test
    public void distanceByX() {
        Point first = new Point(0, 0);
        Point second = new Point(2, 0);
        double expected = 2;
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distanceByY() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 100);
        double expected = 100;
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }
}
