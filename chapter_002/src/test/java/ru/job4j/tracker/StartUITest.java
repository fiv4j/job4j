package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] testAnswers = {"New item from test"};
        Input input = new StubInput(testAnswers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("New item from test");
        assertThat(created.getName(), is(expected.getName()));
    }
}
