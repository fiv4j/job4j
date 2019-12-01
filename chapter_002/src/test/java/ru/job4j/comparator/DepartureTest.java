package ru.job4j.comparator;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DepartureTest {
    @Test
    public void whenSortedAscending() {
        String[] depArray = {"K1\\SK1", "K1\\SK1\\SSK1", "K1\\SK1\\SSK2", "K1\\SK2",
                "K2", "K2\\SK1\\SSK1", "K2\\SK1\\SSK2", "K1", "K2\\SK1"};
        List<String> result = Arrays.asList(depArray);
        Departure.asc(result);
        List<String> expected = List.of(
                "K1",
                "K1\\SK1",
                "K1\\SK1\\SSK1",
                "K1\\SK1\\SSK2",
                "K1\\SK2",
                "K2",
                "K2\\SK1",
                "K2\\SK1\\SSK1",
                "K2\\SK1\\SSK2"
        );
        assertThat(result, is(expected));
    }

    @Test
    public void whenSortedDescending() {
        String[] depArray = {"K1\\SK1", "K1\\SK1\\SSK1", "K1\\SK1\\SSK2", "K1\\SK2",
                "K2", "K2\\SK1\\SSK1", "K2\\SK1\\SSK2", "K1", "K2\\SK1"};
        List<String> result = Arrays.asList(depArray);
        Departure.desc(result);
        List<String> expected = List.of(
                "K2",
                "K2\\SK1",
                "K2\\SK1\\SSK2",
                "K2\\SK1\\SSK1",
                "K1",
                "K1\\SK2",
                "K1\\SK1",
                "K1\\SK1\\SSK2",
                "K1\\SK1\\SSK1"
        );
        assertThat(result, is(expected));
    }

    @Test
    public void whenFillGapAndSortedAscending() {
        String[] depArray = {"K1\\SK1\\SSK1", "K1\\SK1\\SSK2", "K1\\SK2",
                "K2\\SK1\\SSK1", "K2\\SK1\\SSK2"};
        List<String> initList = Arrays.asList(depArray);
        List<String> result = Departure.fillGaps(initList);
        Departure.asc(result);
        List<String> expected = List.of(
                "K1",
                "K1\\SK1",
                "K1\\SK1\\SSK1",
                "K1\\SK1\\SSK2",
                "K1\\SK2",
                "K2",
                "K2\\SK1",
                "K2\\SK1\\SSK1",
                "K2\\SK1\\SSK2"
        );
        assertThat(result, is(expected));
    }
}
