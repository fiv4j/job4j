package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        for (int idx = 0; idx <= (array.length - 1) / 2; idx++) {
            int tmp = array[idx];
            array[idx] = array[array.length - 1 - idx];
            array[array.length - 1 - idx] = tmp;
        }
        return array;
    }
}
