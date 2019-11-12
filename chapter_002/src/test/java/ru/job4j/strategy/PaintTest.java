package ru.job4j.strategy;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println("Before test method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.out.println("After test method");
        System.setOut(this.stdout);
    }

    @Test
    public void whenTriangle() {
        new Paint().draw(new Triangle());
        assertThat(
                new String(out.toByteArray()),
                is(new StringBuilder()
                        .append("*    ").append(System.lineSeparator())
                        .append("**   ").append(System.lineSeparator())
                        .append("***  ").append(System.lineSeparator())
                        .append("**** ").append(System.lineSeparator())
                        .append("*****").append(System.lineSeparator())
                        .toString())
        );
    }

    @Test
    public void whenSquare() {
        new Paint().draw(new Square());
        assertThat(
                this.out.toString(),
                is(new StringBuilder()
                        .append("*****").append(System.lineSeparator())
                        .append("*   *").append(System.lineSeparator())
                        .append("*   *").append(System.lineSeparator())
                        .append("*   *").append(System.lineSeparator())
                        .append("*****").append(System.lineSeparator())
                        .toString())
        );
    }
}
