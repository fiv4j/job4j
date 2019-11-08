package ru.job4j.oop.animals;

public class Tiger extends Predator {
    public Tiger(String name) {
        super(name);
        System.out.println("Tiger");
    }

    public static void main(String[] args) {
        Animal tiger = new Tiger("Leo");
    }
}
