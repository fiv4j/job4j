package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        while (i + j < rsl.length) {
            if (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    rsl[i + j] = left[i];
                    i++;
                } else {
                    rsl[i + j] = right[j];
                    j++;
                }
            } else if (i == left.length) {
                rsl[i + j] = right[j];
                j++;
            } else if (j == right.length) {
                rsl[i + j] = left[i];
                i++;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
