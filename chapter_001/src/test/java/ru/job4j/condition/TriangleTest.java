package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenTriangleExists() {
        assertThat(
                Triangle.exist(3, 4, 5),
                is(true)
        );
    }

    @Test
    public void whenTriangleNotExist() {
        assertThat(
                Triangle.exist(0, 1, 2),
                is(false)
        );
    }
}
