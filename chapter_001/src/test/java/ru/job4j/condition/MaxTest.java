package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax100To50Then100() {
        assertThat(
                Max.max(100, 50),
                is(100)
        );
    }

    @Test
    public void whenMax10To50Then50() {
        assertThat(
                Max.max(10, 50),
                is(50)
        );
    }

    @Test
    public void whenMax22To22Then22() {
        assertThat(
                Max.max(22, 22),
                is(22)
        );
    }
}
