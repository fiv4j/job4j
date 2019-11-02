package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MortgageTest {
    @Test
    public void when4Years() {
        Mortgage check = new Mortgage();
        assertThat(
                check.year(100, 70, 50),
                is(4)
        );
    }

    @Test
    public void when2Years() {
        Mortgage check = new Mortgage();
        assertThat(
                check.year(100, 120, 50),
                is(2)
        );
    }

    @Test
    public void when1Year() {
        Mortgage check = new Mortgage();
        assertThat(
                check.year(100, 120, 1),
                is(1)
        );
    }
}
