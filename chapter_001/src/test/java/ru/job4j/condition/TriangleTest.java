package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class TriangleTest {
    @Test
    public void whenTriangleExists() {
        Triangle test = new Triangle(
                new Point(0, 0),
                new Point(3, 0),
                new Point(0, 4)
        );
        double out = test.area();
        double expected = 6;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenTriangleNotExist() {
        Triangle test = new Triangle(
                new Point(0, 0),
                new Point(0, 3),
                new Point(0, 4)
        );
        double out = test.area();
        double expected = -1;
        Assert.assertEquals(expected, out, 0.01);
    }
}
