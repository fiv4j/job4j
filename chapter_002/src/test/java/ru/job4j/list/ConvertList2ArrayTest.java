package ru.job4j.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertList2ArrayTest {
    @Test
    public void when7ElementsThen9() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(result, is(expect));
    }

    @Test
    public void whenConvertCorrect() {
        ConvertList2Array test = new ConvertList2Array();
        List<int[]> list = new ArrayList<>();
        list.add(new int[] {1, 2});
        list.add(new int[] {});
        list.add(new int[] {5, 7, 9});
        List<Integer> result = test.convert(list);
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 5, 7, 9));
        assertThat(result, is(expected));

    }
}
