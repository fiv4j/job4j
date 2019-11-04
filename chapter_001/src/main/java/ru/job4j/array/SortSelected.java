package ru.job4j.array;

public class SortSelected {
    public int[] sort(int[] data) {
        FindLoop findIndex = new FindLoop();
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int minIndex = findIndex.indexOf(data, min, i, data.length - 1);
            int tmp = data[i];
            data[i] = data[minIndex];
            data[minIndex] = tmp;
        }
        return data;
    }
}
