package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        CheckPrimeNumber isPrime = new CheckPrimeNumber();
        for (int i = 1; i <= finish; i++) {
            count += isPrime.check(i) ? 1 : 0;
        }
        return count;
    }
}
