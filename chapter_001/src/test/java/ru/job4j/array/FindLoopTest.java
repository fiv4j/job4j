package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void whenElFound() {
        FindLoop test = new FindLoop();
        assertThat(
                test.indexOf(new int[]{1, 3, 5, 7, 12}, 7),
                is(3)
        );
    }

    @Test
    public void whenElNotFound() {
        FindLoop test = new FindLoop();
        assertThat(
                test.indexOf(new int[]{1, 3, 5, 7, 12}, 21),
                is(-1)
        );
    }

    @Test
    public void whenElFoundWithStartAndFinish() {
        FindLoop test = new FindLoop();
        assertThat(
                test.indexOf(new int[]{1, 3, 5, 7, 12}, 7, 2, 4),
                is(3)
        );
    }

    @Test
    public void whenElNotFoundWithStartAndFinish() {
        FindLoop test = new FindLoop();
        assertThat(
                test.indexOf(new int[]{1, 3, 5, 7, 12}, 7, 0, 2),
                is(-1)
        );
    }
}
