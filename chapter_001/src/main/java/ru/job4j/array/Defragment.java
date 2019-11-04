package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            if (cell == null) {
                String notNullString = null;
                for (int i = index; i < array.length; i++) {
                    if (array[i] != null) {
                        notNullString = array[i];
                        array[i] = null;
                        break;
                    }
                }
                if (notNullString == null) {
                    break;
                }
                array[index] = notNullString;
            }
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
