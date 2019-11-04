package ru.job4j.array;

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int outer = 1; outer <= size; outer++) {
            for (int inner = 1; inner <= size; inner++) {
                table[outer-1][inner-1] = outer * inner;
            }
        }
        return table;
    }
}
