package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        String[] answers = {"Да", "Нет", "Может быть"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        scanner.nextLine();

        int answerIdx = new Random().nextInt(3);
        System.out.println(answers[answerIdx]);
    }
}
