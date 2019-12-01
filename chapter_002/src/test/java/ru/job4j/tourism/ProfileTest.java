package ru.job4j.tourism;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfileTest {

    @Test
    public void whenCollectedAddressesFromProfilesEqualToExpected() {
        List<Profile> profiles = List.of(
                new Profile(new Address("1", "2", 21, 12)),
                new Profile(new Address("1", "1", 21, 11))
        );
        List<Address> result = Profile.collect(profiles);
        List<Address> expected = List.of(
                new Address("1", "2", 21, 12),
                new Address("1", "1", 21, 11)
        );

        assertThat(result, is(expected));
    }

    @Test
    public void whenProfilesHasNoElementsAddressesHasNoElementsToo() {
        List<Profile> profiles = List.of();
        List<Address> result = Profile.collect(profiles);
        List<Address> expected = List.of();

        assertThat(result, is(expected));
    }

    @Test
    public void whenReturnUniqueAndSorted() {
        List<Profile> profiles = List.of(
                new Profile(new Address("C", "2", 21, 12)),
                new Profile(new Address("A", "2", 21, 12)),
                new Profile(new Address("B", "2", 21, 12)),
                new Profile(new Address("A", "2", 21, 12))
        );
        List<Address> result = Profile.collectUniqueAndSort(profiles);
        List<Address> expected = List.of(
                new Address("A", "2", 21, 12),
                new Address("B", "2", 21, 12),
                new Address("C", "2", 21, 12)
        );

        assertThat(result, is(expected));
    }
}
