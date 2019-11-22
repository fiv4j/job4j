package ru.job4j.sort;

import java.util.*;

public class UserSort {

    public Set<User> sort(List<User> userList) {
        return new TreeSet<>(userList);
    }

    public static void main(String[] args) {
        List<User> users = new ArrayList<>(Arrays.asList(
                new User("vasya", 40),
                new User("kolya", 50),
                new User("andrei", 20),
                new User("anna", 6)
        ));
        System.out.println(users);
        UserSort test = new UserSort();
        System.out.println(test.sort(users));
    }
}
