package ru.job4j.sort;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserSortTest {

    @Test
    public void whenSetIsSortedAndHaveNoDuplicate() {
        List<User> users = new ArrayList<>(Arrays.asList(
                new User("vasiliy", 40),
                new User("anna", 16),
                new User("kolya", 50),
                new User("anna", 16)
        ));
        Set<User> expected = new TreeSet<>(Arrays.asList(
                new User("anna", 16),
                new User("vasiliy", 40),
                new User("kolya", 50)
        ));
        UserSort test = new UserSort();
        Set<User> result = test.sort(users);
        assertThat(result, is(expected));
    }

    @Test
    public void whenListSortedByName() {
        List<User> users = new ArrayList<>(Arrays.asList(
                new User("vasiliy", 40),
                new User("kolya", 50),
                new User("anna", 16)
        ));
        List<User> expected = new ArrayList<>(Arrays.asList(
                new User("anna", 16),
                new User("kolya", 50),
                new User("vasiliy", 40)
        ));
        UserSort test = new UserSort();
        List<User> result = test.sortNameLength(users);
        assertThat(result, is(expected));
    }

    @Test
    public void whenListSortedByAllFields() {
        List<User> users = new ArrayList<>(Arrays.asList(
                new User("vasiliy", 40),
                new User("kolya", 50),
                new User("anna", 16),
                new User("andrei", 20),
                new User("anna", 6),
                new User("kolya", 15)
        ));
        List<User> expected = new ArrayList<>(Arrays.asList(
                new User("andrei", 20),
                new User("anna", 6),
                new User("anna", 16),
                new User("kolya", 15),
                new User("kolya", 50),
                new User("vasiliy", 40)
        ));
        UserSort test = new UserSort();
        List<User> result = test.sortByAllFields(users);
        assertThat(result, is(expected));
    }
}
