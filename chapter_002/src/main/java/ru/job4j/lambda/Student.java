package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Student {

    private String name;
    private Set<String> units;

    public Student(String name, Set<String> units) {
        this.name = name;
        this.units = units;
    }

    public String getName() {
        return name;
    }

    public Set<String> getUnits() {
        return units;
    }

    public Stream<OneUnitPerStudent> studentWithOneUnit() {
        List<OneUnitPerStudent> list = new ArrayList<>();
        for (var unit : this.getUnits()) {
            list.add(new OneUnitPerStudent(this.getName(), unit));
        }
        return list.stream();
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", units=" + units + '}';
    }
}
