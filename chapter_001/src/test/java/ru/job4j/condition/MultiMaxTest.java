package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        assertThat(
                check.max(3, 0, -10),
                is(3)
        );
    }

    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        assertThat(
                check.max(-3, 0, -10),
                is(0)
        );
    }

    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        assertThat(
                check.max(-3, 0, 10),
                is(10)
        );
    }

    @Test
    public void whenEquals() {
        MultiMax check = new MultiMax();
        assertThat(
                check.max(10, 10, 10),
                is(10)
        );
    }
}
