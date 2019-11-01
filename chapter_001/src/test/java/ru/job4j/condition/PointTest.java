package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {
    @Test
    public void distanceByX() {
        int x1 = 0, y1 = 0;
        int x2 = 2, y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distanceByY() {
        int x1 = 0, y1 = 0;
        int x2 = 0, y2 = 100;
        double expected = 100;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
