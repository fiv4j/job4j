package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerFirstTest {

    @Test
    public void whenFirstGetOneInstance() {
        TrackerFirst trackerOne = TrackerFirst.getInstance();
        TrackerFirst trackerTwo = TrackerFirst.getInstance();
        boolean isEqual = trackerOne == trackerTwo;
        assertThat(isEqual, is(true));
    }
}
