package ru.job4j.oop.professions;

public class Profession {
    private String name;
    private String surname;
    private String birthday;
    private String education;

    public Profession(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getEducation() {
        return education;
    }
}
