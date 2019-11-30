package ru.job4j.bank;

import java.util.Objects;

public class Account {

    private String requisites;
    private double value;

    public Account(String requisites, double value) {
        this.value = value;
        this.requisites = requisites;
    }

    public double getValue() {
        return value;
    }

    public String getRequisites() {
        return requisites;
    }

    public boolean transfer(Account destionation, double amount) {
        boolean isDone = false;
        if (destionation != null && amount >= 0 && this.value >= amount) {
            this.value -= amount;
            destionation.value += amount;
            isDone = true;
        }
        return isDone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Double.compare(account.getValue(), getValue()) == 0
                && getRequisites().equals(account.getRequisites());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRequisites(), getValue());
    }

    @Override
    public String toString() {
        return "Account{" + "requisites='" + requisites + '\'' + ", value=" + value + '}';
    }
}
