package ru.job4j.sort;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserSortTest {

    @Test
    public void whenSetIsSortedAndNoDuplicated() {
        List<User> users = new ArrayList<>(Arrays.asList(
                new User("vasiliy", 40),
                new User("anna", 16),
                new User("kolya", 50),
                new User("anna", 16)
        ));
        Set<User> expected = new TreeSet<>();
        expected.add(new User("anna", 16));
        expected.add(new User("vasiliy", 40));
        expected.add(new User("kolya", 50));
        UserSort test = new UserSort();
        Set<User> result = test.sort(users);
        assertThat(result, is(expected));
    }
}
