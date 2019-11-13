package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerSecondTest {

    @Test
    public void whenSecondGetOneInstance() {
        TrackerSecond trackerOne = TrackerSecond.getInstance();
        TrackerSecond trackerTwo = TrackerSecond.getInstance();
        boolean isEqual = trackerOne == trackerTwo;
        assertThat(isEqual, is(true));
    }
}
