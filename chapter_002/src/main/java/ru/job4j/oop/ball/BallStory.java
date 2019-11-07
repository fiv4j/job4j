package ru.job4j.oop.ball;

public class BallStory {

    public static void getEpilogue() {
        System.out.println("Тут и сказке конец, а кто слушал - молодец!");
    }

    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();

        hare.tryEat(ball);
        wolf.tryEat(ball);
        fox.tryEat(ball);
        getEpilogue();
    }
}
