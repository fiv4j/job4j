package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

public class PhoneDictionary {
    private List<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public List<Person> find(String key) {
        List<Person> result = new ArrayList<>();
        if (key != null) {
            for (Person person : this.persons) {
                if (person.getName().contains(key) || person.getSurname().contains(key)
                        || person.getPhone().contains(key) || person.getAddress().contains(key)) {
                    result.add(person);
                }
            }
        }
        return result;
    }
}
