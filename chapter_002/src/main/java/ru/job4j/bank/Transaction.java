package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        User result = null;
        for (Map.Entry<User, List<Account>> currentUser: this.usersAccounts.entrySet()) {
            if (currentUser.getKey().getPassport().equals(passport)) {
                result = currentUser.getKey();
                break;
            }
        }
        return result;
    }

    private Account findAccountByRequisite(User user, String requisite) {
        Account account = null;
        List<Account> userAccounts = this.usersAccounts.get(user);
        for (Account currentAccount: userAccounts) {
            if (currentAccount.getRequisites().equals(requisite)) {
                account = currentAccount;
            }
        }
        return account;
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
        List<Account> userAccounts = null;
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
        if (srcAccount != null && dstAccount != null && srcAccount.getValue() >= amount) {
            srcAccount.setValue(srcAccount.getValue() - amount);
            dstAccount.setValue(dstAccount.getValue() + amount);
            isDone = true;
        }
        return isDone;
    }
}
