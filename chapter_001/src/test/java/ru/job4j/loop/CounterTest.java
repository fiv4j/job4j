package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenFrom1To10Is30() {
        Counter check = new Counter();
        assertThat(
                check.add(1, 10),
                is(30)
        );
    }

    @Test
    public void whenFrom1To12Is42() {
        Counter check = new Counter();
        assertThat(
                check.add(1, 12),
                is(42)
        );
    }

    @Test
    public void whenFrom0To0Is0() {
        Counter check = new Counter();
        assertThat(
                check.add(0, 0),
                is(0)
        );
    }

    @Test
    public void whenFrom2To2Is2() {
        Counter check = new Counter();
        assertThat(
                check.add(2, 2),
                is(2)
        );
    }

    @Test
    public void whenFrom3To3Is0() {
        Counter check = new Counter();
        assertThat(
                check.add(3, 3),
                is(0)
        );
    }
}
