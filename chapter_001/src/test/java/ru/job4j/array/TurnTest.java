package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenEven() {
        Turn test = new Turn();
        assertThat(
                test.back(new int[] {0, 1, 2, 3}),
                is(new int[] {3, 2, 1, 0})
        );
    }

    @Test
    public void whenOdd() {
        Turn test = new Turn();
        assertThat(
                test.back(new int[] {0, 1, 2, 3, 4}),
                is(new int[] {4, 3, 2, 1, 0})
        );
    }
}
