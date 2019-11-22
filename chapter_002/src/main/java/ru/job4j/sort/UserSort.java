package ru.job4j.sort;

import java.util.*;

public class UserSort {

    public Set<User> sort(List<User> userList) {
        return new TreeSet<>(userList);
    }

    public List<User> sortNameLength(List<User> userList) {
        userList.sort(new Comparator<User>() {
            @Override
            public int compare(User user, User t1) {
                return Integer.compare(user.getName().length(), t1.getName().length());
            }
        });
        return userList;
    }

    public List<User> sortByAllFields(List<User> userList) {
        userList.sort(new Comparator<User>() {
            @Override
            public int compare(User user, User t1) {
                int result = user.getName().compareTo(t1.getName());
                return result != 0 ? result : Integer.compare(user.getAge(), t1.getAge());
            }
        });
        return userList;
    }

    public static void main(String[] args) {
        List<User> users = new ArrayList<>(Arrays.asList(
                new User("vasiliy", 40),
                new User("kolya", 50),
                new User("anna", 16),
                new User("andrei", 20),
                new User("anna", 6),
                new User("kolya", 15)
        ));
        UserSort test = new UserSort();
        System.out.println("=========== Initial List ================");
        System.out.println(users);
        System.out.println();
        System.out.println("=========== Set: Sort By Age ================");
        System.out.println(test.sort(users));
        System.out.println();
        System.out.println("=========== List: Sort By Name Length ================");
        System.out.println(test.sortNameLength(users));
        System.out.println();
        System.out.println("=========== List: Sort By Name and Age ================");
        System.out.println(test.sortByAllFields(users));
    }
}
