package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenLengthIs3() {
        SortSelected check = new SortSelected();
        int[] in = new int[] {5, 10, 2};
        int[] expected = new int[] {2, 5, 10};
        int[] result = check.sort(in);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLengthIs5() {
        SortSelected check = new SortSelected();
        int[] in = new int[] {5, 10, 2, 16, 3};
        int[] expected = new int[] {2, 3, 5, 10, 16};
        int[] result = check.sort(in);
        assertThat(result, is(expected));
    }
}
