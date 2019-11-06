package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        boolean hasNullOnly = false;
        int index = 0;
        while (!hasNullOnly && index < array.length) {
            if (array[index] == null) {
                hasNullOnly = true;
                for (int i = index + 1; i < array.length; i++) {
                    if (array[i] != null) {
                        array[index] = array[i];
                        array[i] = null;
                        hasNullOnly = false;
                        break;
                    }
                }
            }
            index++;
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
