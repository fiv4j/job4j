package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerThirdTest {

    @Test
    public void whenThirdGetOneInstance() {
        TrackerThird trackerOne = TrackerThird.getInstance();
        TrackerThird trackerTwo = TrackerThird.getInstance();
        boolean isEqual = trackerOne == trackerTwo;
        assertThat(isEqual, is(true));
    }
}
