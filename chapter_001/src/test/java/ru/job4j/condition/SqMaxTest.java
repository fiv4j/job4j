package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenFirstMax() {
        assertThat(
                SqMax.max(5, 4, 3, 2),
                is(5)
        );
    }

    @Test
    public void whenSecondMax() {
        assertThat(
                SqMax.max(5, 6, 3, 2),
                is(6)
        );
    }

    @Test
    public void whenThirdMax() {
        assertThat(
                SqMax.max(5, 4, 6, 2),
                is(6)
        );
    }

    @Test
    public void whenFourthMax() {
        assertThat(
                SqMax.max(5, 4, 3, 6),
                is(6)
        );
    }

    @Test
    public void whenEquals() {
        assertThat(
                SqMax.max(5, 5, 5, 5),
                is(5)
        );
    }
}
