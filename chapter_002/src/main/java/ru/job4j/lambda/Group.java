package ru.job4j.lambda;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class Group {

    public static Map<String, Set<String>> sections(List<Student> students) {
        return students.stream()
                .flatMap(Student::studentWithOneUnit)
                .collect(groupingBy(OneUnitPerStudent::getUnit,
                        mapping(OneUnitPerStudent::getName, toSet())));
    }
}
