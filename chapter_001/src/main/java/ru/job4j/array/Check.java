package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean first = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] != first) {
                return false;
            }
        }
        return true;
    }
}
