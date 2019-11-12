package ru.job4j.tracker;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindByNameActionTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream stdout = System.out;

    @Before
    public void before() {
        System.setOut(new PrintStream(out));
    }

    @After
    public void after() {
        System.setOut(stdout);
    }

    @Test
    public void whenFoundByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("Difficult name");
        tracker.add(item);
        Input input = new StubInput(new String[] {"Difficult name"});

        new FindByNameAction().execute(input, tracker);
        String expected = new StringJoiner(" : ", "", System.lineSeparator())
                .add(item.getId())
                .add(item.getName())
                .toString();

        assertThat(out.toString(), is(expected));
    }

    @Test
    public void whenNotFoundByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("Difficult name");
        tracker.add(item);
        Input input = new StubInput(new String[] {"Different name"});

        new FindByNameAction().execute(input, tracker);
        String expected = new StringJoiner("", "", System.lineSeparator())
                .add("No items found.")
                .toString();

        assertThat(out.toString(), is(expected));
    }
}
