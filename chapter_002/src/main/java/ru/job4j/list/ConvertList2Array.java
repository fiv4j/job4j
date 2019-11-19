package ru.job4j.list;

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

    public static void main(String[] args) {
        ConvertList2Array converter = new ConvertList2Array();
        int[][] arr = converter.toArray(Arrays.asList(1, 2, 3, 4, 5), 2);
        System.out.println(Arrays.deepToString(arr));
    }
}
