package ru.job4j.comparator;

import java.util.Comparator;

public class ListCompare implements Comparator<String> {

    @Override
    public int compare(String s, String t1) {
        int result = 0;
        int minLength = Math.min(s.length(), t1.length());
        for (int idx = 0; result == 0 && idx < minLength; idx++) {
            result += Character.compare(s.charAt(idx), t1.charAt(idx));
        }
        if (result == 0 && s.length() != t1.length()) {
            result = s.length() > t1.length() ? 1 : -1;
        }
        return result;
    }
}
