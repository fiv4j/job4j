package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

public class PhoneDictionary {
    private List<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public List<Person> find(String key) {
        var result = new ArrayList<Person>();
        if (key != null) {
            for (var person : this.persons) {
                if (person.getName().contains(key) || person.getSurname().contains(key)
                        || person.getPhone().contains(key) || person.getAddress().contains(key)) {
                    result.add(person);
                }
            }
        }
        return result;
    }
}
