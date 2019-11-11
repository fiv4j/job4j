package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matches = 11;
        int gamer = 1;
        while (true) {
            System.out.println("На столе " + matches + " спичек.");
            System.out.println("Ход " + gamer + " игрока. Вы можете взять от 1 до 3 спичек.");
            int matchesTaken;
            do {
                System.out.print("Возьмите спички: ");
                matchesTaken = Integer.parseInt(scanner.nextLine());
            } while (matchesTaken < 1 || matchesTaken > 3);

            matches -= matchesTaken;
            if (matches <= 0) {
                System.out.println("Победил " + gamer + " игрок");
                break;
            }
            gamer = gamer == 1 ? 2 : 1;
        }
    }
}
