package ru.job4j.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertList2Array {

    public int[][] toArray(List<Integer> list, int rows) {
        int cells = (int) Math.ceil((double) list.size() / rows);
        int[][] array = new int[rows][cells];
        int x = 0;
        int y = 0;
        for (Integer el: list) {
            array[x][y++] = el;
            if (y == cells) {
                y = 0;
                x++;
            }
        }
        return array;
    }

    public List<Integer> convert(List<int[]> list) {
        List<Integer> result = new ArrayList<>();
        for (int[] array: list) {
            for (int element: array) {
                result.add(element);
            }
        }
        return result;
    }
}
