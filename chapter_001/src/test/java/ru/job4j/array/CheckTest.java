package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {
    @Test
    public void whenOddAndMono() {
        Check test = new Check();
        assertThat(
                test.mono(new boolean[] {false, false, false}),
                is(true)
        );
    }

    @Test
    public void whenOddAndNotMono() {
        Check test = new Check();
        assertThat(
                test.mono(new boolean[] {false, false, true}),
                is(false)
        );
    }

    @Test
    public void whenEvenAndMono() {
        Check test = new Check();
        assertThat(
                test.mono(new boolean[] {true, true, true, true}),
                is(true)
        );
    }

    @Test
    public void whenEvenAndNotMono() {
        Check test = new Check();
        assertThat(
                test.mono(new boolean[] {true, false, true, true}),
                is(false)
        );
    }
}
