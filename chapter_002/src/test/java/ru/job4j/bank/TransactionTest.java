package ru.job4j.bank;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TransactionTest {

    @Test
    public void whenAddUserAndAccountHisAccountsListEqualsToExpected() {
        Transaction test = new Transaction();
        User user = new User("ivan", "123456");
        Account userAccount = new Account("2202", 20);

        test.addUser(user);
        test.addAccountToUser("123456", userAccount);

        List<Account> result = test.getUserAccounts("123456");
        List<Account> expected = List.of(new Account("2202", 20));

        assertThat(result, is(expected));
    }

    @Test
    public void whenAddAccountWithNoUserHisAccountsListIsEmpty() {
        Transaction test = new Transaction();
        Account userAccount = new Account("2202", 20);

        test.addAccountToUser("123456", userAccount);

        List<Account> result = test.getUserAccounts("123456");
        List<Account> expected = new ArrayList<>();

        assertThat(result, is(expected));
    }

    @Test
    public void whenDeleteUserHisAccountsListIsEmpty() {
        Transaction test = new Transaction();
        User user = new User("ivan", "123456");
        test.addUser(user);

        test.deleteUser(user);

        List<Account> result = test.getUserAccounts("123456");
        List<Account> expected = new ArrayList<>();
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddAccountToUserAccountsListEqualsToExpected() {
        Transaction test = new Transaction();
        User user = new User("ivan", "123456");
        test.addUser(user);
        Account firstAccount = new Account("2202", 20);
        Account secondAccount = new Account("2000", 200);

        test.addAccountToUser("123456", firstAccount);
        test.addAccountToUser("123456", secondAccount);

        List<Account> result = test.getUserAccounts("123456");
        List<Account> expected = List.of(
                new Account("2202", 20),
                new Account("2000", 200)
        );

        assertThat(result, is(expected));
    }

    @Test
    public void whenDeleteLastAccountFromUserAccountsListIsEmpty() {
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
        List<Account> expected = List.of(
                new Account("2202", 0),
                new Account("2000", 20)
        );

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
        List<Account> expected = List.of(
                new Account("2202", 20),
                new Account("2000", 0)
        );

        assertThat(result, is(expected));
    }
}
