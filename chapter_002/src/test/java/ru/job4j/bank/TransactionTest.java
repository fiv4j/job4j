package ru.job4j.bank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TransactionTest {

    @Test
    public void whenAddUserHeHisAccountsListIsEmpty() {
        Transaction test = new Transaction();
        User user = new User("ivan", "123456");

        test.addUser(user);

        List<Account> result = test.getUserAccounts("123456");
        List<Account> expected = new ArrayList<>();

        assertThat(result, is(expected));
    }

    @Test
    public void whenDeleteUserHisAccountsListIsNull() {
        Transaction test = new Transaction();
        User user = new User("ivan", "123456");
        test.addUser(user);

        test.deleteUser(user);

        List<Account> result = test.getUserAccounts("123456");
        List<Account> expected = null;
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddAccountToUserAccountsListsEquals() {
        Transaction test = new Transaction();
        User user = new User("ivan", "123456");
        test.addUser(user);
        Account userAccount = new Account("2202", 20);

        test.addAccountToUser("123456", userAccount);

        List<Account> result = test.getUserAccounts("123456");
        List<Account> expected = new ArrayList<>(Arrays.asList(
                new Account("2202", 20)
        ));

        assertThat(result, is(expected));
    }

    @Test
    public void whenDeleteAccountFromUserAccountsListIsEmpty() {
        Transaction test = new Transaction();
        User user = new User("ivan", "123456");
        test.addUser(user);
        Account userAccount = new Account("2202", 20);
        test.addAccountToUser("123456", userAccount);

        test.deleteAccountFromUser("123456", new Account("2202", 20));

        List<Account> result = test.getUserAccounts("123456");
        List<Account> expected = new ArrayList<>();

        assertThat(result, is(expected));
    }

    @Test
    public void whenTransferMoneyIsOK() {
        Transaction test = new Transaction();
        User user = new User("ivan", "123456");
        test.addUser(user);
        test.addAccountToUser("123456", new Account("2202", 20));
        test.addAccountToUser("123456", new Account("2000", 0));
        test.transferMoney("123456", "2202",
                "123456", "2000", 20);

        List<Account> result = test.getUserAccounts("123456");
        List<Account> expected = new ArrayList<>(Arrays.asList(
                new Account("2202", 0),
                new Account("2000", 20)
        ));

        assertThat(result, is(expected));
    }

    @Test
    public void whenTransferMoneyIsNotOKBecauseNoDstAccount() {
        Transaction test = new Transaction();
        User user = new User("ivan", "123456");
        test.addUser(user);
        test.addAccountToUser("123456", new Account("2202", 20));

        boolean result = test.transferMoney("123456", "2202",
                "123456", "2000", 20);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void whenTransferMoneyIsNotOKBecauseNotEnoughMoney() {
        Transaction test = new Transaction();
        User user = new User("ivan", "123456");
        test.addUser(user);
        test.addAccountToUser("123456", new Account("2202", 20));
        test.addAccountToUser("123456", new Account("2000", 0));

        test.transferMoney("123456", "2202",
                "123456", "2000", 200);

        List<Account> result = test.getUserAccounts("123456");
        List<Account> expected = new ArrayList<>(Arrays.asList(
                new Account("2202", 20),
                new Account("2000", 0)
        ));

        assertThat(result, is(expected));
    }
}
