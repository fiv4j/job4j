package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void whenBoundIs1() {
        Square check = new Square();
        int[] expected = {1};
        assertThat(
                check.calculate(1),
                is(expected)
        );
    }

    @Test
    public void whenBoundIs3() {
        Square check = new Square();
        int[] expected = {1, 4, 9};
        assertThat(
                check.calculate(3),
                is(expected)
        );
    }

    @Test
    public void whenBoundIs5() {
        Square check = new Square();
        int[] expected = {1, 4, 9, 16, 25};
        assertThat(
                check.calculate(5),
                is(expected)
        );
    }
}
