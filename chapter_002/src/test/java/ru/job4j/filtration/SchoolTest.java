package ru.job4j.filtration;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {
    @Test
    public void whenReturnListOfScoreA() {
        List<Student> students = Arrays.asList(
                new Student(20), new Student(30), new Student(40),
                new Student(50), new Student(70), new Student(95)
        );
        List<Student> result = School.collect(students, s -> s.getScore() > 70 && s.getScore() <= 100);
        List<Student> expected = Arrays.asList(new Student(95));

        assertThat(result, is(expected));
    }

    @Test
    public void whenReturnListOfScoreB() {
        List<Student> students = Arrays.asList(
                new Student(20), new Student(30), new Student(40),
                new Student(50), new Student(70), new Student(95)
        );
        List<Student> result = School.collect(students, s -> s.getScore() > 50 && s.getScore() <= 70);
        List<Student> expected = Arrays.asList(new Student(70));

        assertThat(result, is(expected));
    }

    @Test
    public void whenReturnListOfScoreC() {
        List<Student> students = Arrays.asList(
                new Student(20), new Student(30), new Student(40),
                new Student(50), new Student(70), new Student(95)
        );
        List<Student> result = School.collect(students, s -> s.getScore() >= 0 && s.getScore() <= 50);
        List<Student> expected = Arrays.asList(new Student(20), new Student(30), new Student(40),
                new Student(50));

        assertThat(result, is(expected));
    }
}
