package ru.job4j.bank;

import java.util.Objects;

public class User {

    private String name;
    private String passport;

    public User(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public String getPassport() {
        return passport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return getName().equals(user.getName())
                && getPassport().equals(user.getPassport());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPassport());
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", passport='" + passport + '\'' + '}';
    }
}
