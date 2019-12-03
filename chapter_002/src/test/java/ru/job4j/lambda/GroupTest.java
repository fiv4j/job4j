package ru.job4j.lambda;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GroupTest {

    @Test
    public void whenTwoStudentsAndThreeSections() {
        Student student1 = new Student("ivan", Set.of("java", "python"));
        Student student2 = new Student("anna", Set.of("java", "asm"));
        List<Student> students = List.of(student1, student2);

        Map<String, Set<String>> result = Group.sections(students);
        Map<String, Set<String>> expected = new HashMap<>();
        expected.put("java", Set.of("ivan", "anna"));
        expected.put("python", Set.of("ivan"));
        expected.put("asm", Set.of("anna"));

        assertThat(result, is(expected));
    }

    @Test
    public void whenTwoStudentsAndOneHaveNoSections() {
        Student student1 = new Student("ivan", Set.of("java", "python"));
        Student student2 = new Student("anna", Set.of());
        List<Student> students = List.of(student1, student2);

        Map<String, Set<String>> result = Group.sections(students);
        Map<String, Set<String>> expected = new HashMap<>();
        expected.put("java", Set.of("ivan"));
        expected.put("python", Set.of("ivan"));

        assertThat(result, is(expected));
    }
}
