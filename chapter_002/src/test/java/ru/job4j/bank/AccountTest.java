package ru.job4j.bank;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AccountTest {

    @Test
    public void whenTransferIsOK() {
        Account srcAccount = new Account("123", 100);
        Account dstAccount = new Account("321", 0);
        double amount = 100;

        boolean result = srcAccount.transfer(dstAccount, amount);
        boolean expected = srcAccount.getValue() == 0
                            && dstAccount.getValue() == 100;

        assertThat(result, is(expected));
    }

    @Test
    public void whenTransferIsNotOKBecauseNotEnoughMoney() {
        Account srcAccount = new Account("123", 10);
        Account dstAccount = new Account("321", 0);
        double amount = 100;

        boolean result = srcAccount.transfer(dstAccount, amount);
        boolean expected = false;

        assertThat(result, is(expected));
    }

    @Test
    public void whenTransferIsNotOKBecauseDstAccountNotExist() {
        Account srcAccount = new Account("123", 1000);
        Account dstAccount = null;
        double amount = 100;

        boolean result = srcAccount.transfer(dstAccount, amount);
        boolean expected = false;

        assertThat(result, is(expected));
    }

    @Test
    public void whenTransferIsNotOKBecauseAmountIsNegative() {
        Account srcAccount = new Account("123", 1000);
        Account dstAccount = new Account("321", 0);
        double amount = -100;

        boolean result = srcAccount.transfer(dstAccount, amount);
        boolean expected = false;

        assertThat(result, is(expected));
    }
}
