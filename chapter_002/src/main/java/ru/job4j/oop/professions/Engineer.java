package ru.job4j.oop.professions;

public class Engineer extends Profession {

    public Engineer(String name) {
        super(name);
    }

    public ProjectDocs design() {
        return new ProjectDocs();
    }

    public Order orderMaterials() {
        return new Order();
    }
}
