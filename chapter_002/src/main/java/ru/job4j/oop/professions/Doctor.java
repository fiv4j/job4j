package ru.job4j.oop.professions;

public class Doctor extends Profession {

    public Doctor(String name) {
        super(name);
    }

    public Diagnose heal(Pacient pacient) {
        return new Diagnose();
    }

    public TestsResult doTests(Pacient pacient) {
        return new TestsResult();
    }
}
