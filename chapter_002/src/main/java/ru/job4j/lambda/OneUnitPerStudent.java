package ru.job4j.lambda;

public class OneUnitPerStudent {
    private String name;
    private String unit;

    public OneUnitPerStudent(String name, String unit) {
        this.name = name;
        this.unit = unit;
    }

    public String getName() {
        return this.name;
    }

    public String getUnit() {
        return this.unit;
    }

    @Override
    public String toString() {
        return "SimpleStudent{" + "name='" + this.name
                + '\'' + ", unit='" + this.unit + '\'' + '}';
    }
}
