package ru.job4j.tracker;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ShowAllActionTest {
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
    public void whenCheckOut() {
        this.before();

        Tracker tracker = new Tracker();
        Item item = new Item("Test item");
        tracker.add(item);

        new ShowAllAction("Show all.").execute(new StubInput(new String[] {}), tracker);

        String expected = new StringJoiner(" : ", "", System.lineSeparator())
                .add(item.getId())
                .add(item.getName())
                .toString();
        assertThat(out.toString(), is(expected));

        this.after();
    }
}
