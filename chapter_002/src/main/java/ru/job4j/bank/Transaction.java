package ru.job4j.bank;

import java.util.*;

public class Transaction {

    private Map<User, List<Account>> usersAccounts = new HashMap<>();

    public void addUser(User user) {
        if (user != null) {
            this.usersAccounts.putIfAbsent(user, new ArrayList<>());
        }
    }

    public void deleteUser(User user) {
        if (user != null) {
            this.usersAccounts.remove(user);
        }
    }

    private User findUserByPassport(String passport) {
        return passport != null ? this.usersAccounts.keySet().stream()
                                    .filter(x -> x.getPassport().equals(passport))
                                    .findAny()
                                    .orElse(null)
                                : null;
    }

    private Account findAccountByRequisite(User user, String requisite) {
        return user != null ? this.usersAccounts.get(user).stream()
                                .filter(x -> x.getRequisites().equals(requisite))
                                .findAny()
                                .orElse(null)
                            : null;
    }

    public void addAccountToUser(String passport, Account account) {
        User user = findUserByPassport(passport);
        if (user != null) {
            this.usersAccounts.get(user).add(account);
        }
    }

    public void deleteAccountFromUser(String passport, Account account) {
        User user = findUserByPassport(passport);
        List<Account> accounts = this.usersAccounts.get(user);
        if (user != null) {
            accounts.remove(account);
        }
    }

    public List<Account> getUserAccounts(String passport) {
        List<Account> userAccounts = new ArrayList<>();
        User user = findUserByPassport(passport);
        if (user != null) {
            userAccounts = this.usersAccounts.get(user);
        }
        return userAccounts;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String dstPassport, String dstRequisite,
                                 double amount) {
        boolean isDone = false;
        Account srcAccount = findAccountByRequisite(
                findUserByPassport(srcPassport),
                srcRequisite
        );
        Account dstAccount = findAccountByRequisite(
                findUserByPassport(dstPassport),
                dstRequisite
        );
        if (srcAccount != null) {
            isDone = srcAccount.transfer(dstAccount, amount);
        }
        return isDone;
    }
}
