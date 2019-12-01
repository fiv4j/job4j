package ru.job4j.filtration;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {
    @Test
    public void whenReturnListOfScoreA() {
        List<Student> students = Arrays.asList(
                new Student("ivan", 20), new Student("fedor", 30),
                new Student("anna", 40), new Student("petr", 50),
                new Student("alex", 70), new Student("maria", 95)
        );
        List<Student> result = School.collect(students, s -> s.getScore() > 70 && s.getScore() <= 100);
        List<Student> expected = Arrays.asList(new Student("maria", 95));

        assertThat(result, is(expected));
    }

    @Test
    public void whenReturnListOfScoreB() {
        List<Student> students = Arrays.asList(
                new Student("ivan", 20), new Student("fedor", 30),
                new Student("anna", 40), new Student("petr", 50),
                new Student("alex", 70), new Student("maria", 95)
        );
        List<Student> result = School.collect(students, s -> s.getScore() > 50 && s.getScore() <= 70);
        List<Student> expected = Arrays.asList(new Student("alex", 70));

        assertThat(result, is(expected));
    }

    @Test
    public void whenReturnListOfScoreC() {
        List<Student> students = Arrays.asList(
                new Student("ivan", 20), new Student("fedor", 30),
                new Student("anna", 40), new Student("petr", 50),
                new Student("alex", 70), new Student("maria", 95)
        );
        List<Student> result = School.collect(students, s -> s.getScore() >= 0 && s.getScore() <= 50);
        List<Student> expected = Arrays.asList(new Student("ivan", 20),
                new Student("fedor", 30), new Student("anna", 40),
                new Student("petr", 50));

        assertThat(result, is(expected));
    }

    @Test
    public void whenMapContainsAllElementsOfList() {
        Student st1 = new Student("ivan", 20);
        Student st2 = new Student("fedor", 30);
        List<Student> students = Arrays.asList(st1, st2);

        Map<String, Student> studentMap = School.convertToMap(students);

        boolean result = studentMap.containsKey("ivan")
                && studentMap.containsKey("fedor")
                && students.size() == studentMap.size();
        boolean expected = true;

        assertThat(result, is(expected));
    }

    @Test
    public void whenLevelOfStudentsList() {
        List<Student> students = Arrays.asList(
                new Student("ivan", 20), null, new Student("fedor", 30),
                new Student("anna", 40), null, new Student("petr", 50),
                null, new Student("alex", 70), new Student("maria", 95)
        );
        List<Student> result = School.levelOf(students, 50);
        List<Student> expected = Arrays.asList(
                new Student("ivan", 20),
                new Student("fedor", 30),
                new Student("anna", 40)
        );

        assertThat(result, is(expected));
    }
}
