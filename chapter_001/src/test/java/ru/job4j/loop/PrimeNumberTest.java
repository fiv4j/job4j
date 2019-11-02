package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PrimeNumberTest {
    @Test
    public void when1Then0() {
        PrimeNumber check = new PrimeNumber();
        assertThat(
                check.calc(1),
                is(0)
        );
    }
    @Test
    public void when2Then1() {
        PrimeNumber check = new PrimeNumber();
        assertThat(
                check.calc(2),
                is(1)
        );
    }

    @Test
    public void when5Then3() {
        PrimeNumber check = new PrimeNumber();
        assertThat(
                check.calc(5),
                is(3)
        );
    }

    @Test
    public void when10Then4() {
        PrimeNumber check = new PrimeNumber();
        assertThat(
                check.calc(10),
                is(4)
        );
    }

    @Test
    public void when11Then5() {
        PrimeNumber check = new PrimeNumber();
        assertThat(
                check.calc(11),
                is(5)
        );
    }

    @Test
    public void when100Then25() {
        PrimeNumber check = new PrimeNumber();
        assertThat(
                check.calc(100),
                is(25)
        );
    }
}
