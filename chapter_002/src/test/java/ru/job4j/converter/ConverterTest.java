package ru.job4j.converter;

import org.junit.Test;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {

    @Test
    public void whenMatrixIsNotNull() {
        Integer[][] test = {
                {8, 20, 12},
                {35, 14, -9}
        };
        List<Integer> result = Converter.convertMatrixToList(test);
        List<Integer> expected = List.of(8, 20, 12, 35, 14, -9);

        assertThat(result, is(expected));
    }

    @Test
    public void whenMatrixIsNull() {
        Integer[][] test = null;
        List<Integer> result = Converter.convertMatrixToList(test);
        List<Integer> expected = null;

        assertThat(result, is(expected));
    }
}
