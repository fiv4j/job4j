package ru.job4j.strategy;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
    @Test
    public void whenTriangle() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Triangle());
        assertThat(
                new String(out.toByteArray()),
                is(new StringBuilder()
                        .append("*    \n")
                        .append("**   \n")
                        .append("***  \n")
                        .append("**** \n")
                        .append("*****\n")
                        .append(System.lineSeparator())
                        .toString())
        );
        System.setOut(stdout);
    }
}
