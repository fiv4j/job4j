package ru.job4j.oop.animals;

public class Tiger extends Predator {
    public Tiger() {
        super();
        System.out.println("Tiger");
    }

    public static void main(String[] args) {
        Animal tiger = new Tiger();
    }
}
