package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerFourthTest {

    @Test
    public void whenFourthGetOneInstance() {
        TrackerFourth trackerOne = TrackerFourth.INSTANCE;
        TrackerFourth trackerTwo = TrackerFourth.INSTANCE;
        boolean isEqual = trackerOne == trackerTwo;
        assertThat(isEqual, is(true));
    }
}
