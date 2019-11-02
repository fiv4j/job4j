package ru.job4j.loop;

public class Factorial {
    public int calc(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
