package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckPrimeNumberTest {
    @Test
    public void when1IsFalse() {
        CheckPrimeNumber test = new CheckPrimeNumber();
        assertThat(
                test.check(1),
                is(false)
        );
    }

    @Test
    public void when2IsTrue() {
        CheckPrimeNumber test = new CheckPrimeNumber();
        assertThat(
                test.check(2),
                is(true)
        );
    }

    @Test
    public void when3IsTrue() {
        CheckPrimeNumber test = new CheckPrimeNumber();
        assertThat(
                test.check(3),
                is(true)
        );
    }

    @Test
    public void when5IsTrue() {
        CheckPrimeNumber test = new CheckPrimeNumber();
        assertThat(
                test.check(5),
                is(true)
        );
    }

    @Test
    public void when13IsTrue() {
        CheckPrimeNumber test = new CheckPrimeNumber();
        assertThat(
                test.check(13),
                is(true)
        );
    }

    @Test
    public void when67IsTrue() {
        CheckPrimeNumber test = new CheckPrimeNumber();
        assertThat(
                test.check(67),
                is(true)
        );
    }

    @Test
    public void when199IsTrue() {
        CheckPrimeNumber test = new CheckPrimeNumber();
        assertThat(
                test.check(199),
                is(true)
        );
    }

    @Test
    public void when4IsFalse() {
        CheckPrimeNumber test = new CheckPrimeNumber();
        assertThat(
                test.check(4),
                is(false)
        );
    }

    @Test
    public void when27IsFalse() {
        CheckPrimeNumber test = new CheckPrimeNumber();
        assertThat(
                test.check(27),
                is(false)
        );
    }
}
