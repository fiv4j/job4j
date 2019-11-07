package ru.job4j.oop.ball;

public class Fox {

    public void tryEat(Ball ball) {
        System.out.println(getClass().getSimpleName() + ": Колобок-Колобок, я тебя съем!");
        ball.tryEat();
        this.eatBall();
    }

    public void eatBall() {
        System.out.println("Но " + getClass().getSimpleName() + " съела-таки Колобка!");

    }
}
