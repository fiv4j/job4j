/*
Сортировка по возрастанию:
“K1”
“K1\SK1”
“K1\SK1\SSK1”
“K1\SK1\SSK2”
“K1\SK2”
“K2”
“K2\SK1”
“K2\SK1\SSK1”
“K2\SK1\SSK2”

Сортировка по убыванию:
“K2”
“K2\SK1”
“K2\SK1\SSK2”
“K2\SK1\SSK1”
“K1”
“K1\SK2”
“K1\SK1”
“K1\SK1\SSK2”
“K1\SK1\SSK1”
*/
package ru.job4j.comparator;

import java.util.*;

public class Departure {

    private static Comparator<String> ascComparator = String::compareTo;
    private static Comparator<String> descComparator = (a, b) -> {
        int result = 0;
        for (int i = 0; result == 0 && i < Math.min(a.length(), b.length()); i++) {
            result = b.charAt(i) - a.charAt(i);
        }
        result = result == 0 ? a.length() - b.length() : result;
        return result;
    };

    public static void asc(List<String> orgs) {
        orgs.sort(ascComparator);
    }

    public static void desc(List<String> orgs) {
        orgs.sort(descComparator);
    }

    public static List<String> fillGaps(List<String> orgs) {
        Set<String> depSet = new HashSet<>(orgs);
        for (String org : orgs) {
            String[] currentOrg = org.split("\\\\");
            String addingDep = "";
            for (int i = 0; i < currentOrg.length - 1; i++) {
                addingDep += i == 0 ? currentOrg[i] : "\\" + currentOrg[i];
                depSet.add(addingDep);
            }
        }
        return new ArrayList<>(depSet);
    }
}
