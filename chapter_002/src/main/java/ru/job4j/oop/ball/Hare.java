package ru.job4j.oop.ball;

public class Hare {

    public void tryEat(Ball ball) {
        System.out.println(getClass().getSimpleName() + ": Колобок-Колобок, я тебя съем!");
        ball.tryEat();
    }
}
