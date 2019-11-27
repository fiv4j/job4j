package ru.job4j.tourism;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfileTest {

    @Test
    public void whenCollectedAddressesFromProfilesEqualToExpected() {
        List<Profile> profiles = Arrays.asList(
                new Profile(new Address("1", "2", 21, 12)),
                new Profile(new Address("1", "1", 21, 11))
        );
        List<Address> result = Profile.collect(profiles);
        List<Address> expected = Arrays.asList(
                new Address("1", "2", 21, 12),
                new Address("1", "1", 21, 11)
        );

        assertThat(result, is(expected));
    }

    @Test
    public void whenProfilesHasNoElementsAddressesHasNoElementsToo() {
        List<Profile> profiles = Arrays.asList();
        List<Address> result = Profile.collect(profiles);
        List<Address> expected = Arrays.asList();

        assertThat(result, is(expected));
    }
}
