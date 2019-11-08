package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    // max(a, b)
    @Test
    public void when1And2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void when10And2Then10() {
        assertThat(
                Max.max(10, 2),
                is(10)
        );
    }

    @Test
    public void when22And22Then22() {
        assertThat(
                Max.max(22, 22),
                is(22)
        );
    }

    // max(a, b, c)
    @Test
    public void when1And2And3Then3() {
        assertThat(
                Max.max(1, 2, 3),
                is(3)
        );
    }

    @Test
    public void when1And5And3Then5() {
        assertThat(
                Max.max(1, 5, 3),
                is(5)
        );
    }

    @Test
    public void when10And2And3Then10() {
        assertThat(
                Max.max(10, 2, 3),
                is(10)
        );
    }

    @Test
    public void when10And10And10Then10() {
        assertThat(
                Max.max(10, 10, 10),
                is(10)
        );
    }

    // max(a, b, c, d)
    @Test
    public void when1And2And3And4Then4() {
        assertThat(
                Max.max(1, 2, 3, 4),
                is(4)
        );
    }

    @Test
    public void when1And2And30And4Then30() {
        assertThat(
                Max.max(1, 2, 30, 4),
                is(30)
        );
    }

    @Test
    public void when1And20And3And4Then20() {
        assertThat(
                Max.max(1, 20, 3, 4),
                is(20)
        );
    }

    @Test
    public void when10And2And3And4Then4() {
        assertThat(
                Max.max(10, 2, 3, 4),
                is(10)
        );
    }

    @Test
    public void when10And10And10And10Then10() {
        assertThat(
                Max.max(10, 10, 10, 10),
                is(10)
        );
    }
}
