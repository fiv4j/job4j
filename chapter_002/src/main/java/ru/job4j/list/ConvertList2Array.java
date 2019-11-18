package ru.job4j.list;

import java.util.Arrays;
import java.util.List;

public class ConvertList2Array {

    public int[][] toArray(List<Integer> list, int rows) {
        int cells = list.size() / rows + ((list.size() % rows == 0) ? 0 : 1);
        int[][] array = new int[rows][cells];
        int idx = 0;
        for (int[] row: array) {
            for (int i = 0; i < row.length; i++) {
                row[i] = idx < list.size() ? list.get(idx++) : 0;
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
