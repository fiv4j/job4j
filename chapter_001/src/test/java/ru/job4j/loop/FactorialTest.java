package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void when5Than120() {
        Factorial check = new Factorial();
        assertThat(
                check.calc(5),
                is(120)
        );
    }

    @Test
    public void when0Than1() {
        Factorial check = new Factorial();
        assertThat(
                check.calc(0),
                is(1)
        );
    }

    @Test
    public void when1Than1() {
        Factorial check = new Factorial();
        assertThat(
                check.calc(1),
                is(1)
        );
    }
}
