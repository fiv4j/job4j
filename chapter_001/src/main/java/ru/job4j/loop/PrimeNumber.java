package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = finish;
        for (int num = 1; num <= finish; num++) {
            if (num == 1) {
                count--;
                continue;
            }
            for (int i = 2; i < num / 2 + 1; i++) {
                if (num % i == 0) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
