package ru.job4j.users;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserConvertTest {

    @Test
    public void whenMapContainsAllElements() {
        List<User> userList = new ArrayList<>();
        userList.add(new User(12, "Anna", "EKB"));
        userList.add(new User(21, "Ivan", "MSC"));

        UserConvert test = new UserConvert();
        Map<Integer, User> result = test.process(userList);
        boolean isMapContainsAll = result.containsKey(12)
                && result.containsValue(new User(12, "Anna", "EKB"))
                && result.containsKey(21)
                && result.containsValue(new User(21, "Ivan", "MSC"));
        assertThat(isMapContainsAll, is(true));
    }
}
