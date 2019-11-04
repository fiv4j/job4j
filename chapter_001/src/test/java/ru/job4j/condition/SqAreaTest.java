package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {
    @Test
    public void fourSquare() {
        int inP = 4;
        int inK = 1;
        double expected = 1;
        double out = SqArea.square(inP, inK);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void longWidth() {
        int inP = 202;
        int inK = 100;
        double expected = 100;
        double out = SqArea.square(inP, inK);
        Assert.assertEquals(expected, out, 0.001);
    }
}
