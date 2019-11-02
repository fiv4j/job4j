package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        do {
            year++;
            amount = (int) (amount + amount * percent / 100.0) - salary;
        } while (amount > 0);
        return year;
    }
}
