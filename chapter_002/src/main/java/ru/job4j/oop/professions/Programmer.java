package ru.job4j.oop.professions;

public class Programmer extends Engineer {

    public Programmer(String name) {
        super(name);
    }

    public UML createUML(Project project) {
        return new UML();
    }

    public void testCode(Project project) {

    }
}
