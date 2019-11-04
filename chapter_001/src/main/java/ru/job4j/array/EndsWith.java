package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        int delta = word.length - post.length;
        for (int i = word.length - 1; i > delta ; i--) {
            if (word[i] != post[i - delta]) {
                return false;
            }
        }
        return true;
    }
}
