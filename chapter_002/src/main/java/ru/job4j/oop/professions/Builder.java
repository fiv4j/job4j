package ru.job4j.oop.professions;

public class Builder extends Engineer {

    public Builder(String name) {
        super(name);
    }

    public ConstructionPlan planning(Project project) {
        return new ConstructionPlan();
    }

    public void testEquipment(Equipment eq) {

    }
}
