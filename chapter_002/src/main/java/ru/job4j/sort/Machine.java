package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int changeOfMoney = money - price;
        for (int i = 0; changeOfMoney > 0 && i < coins.length; i++) {
            while (changeOfMoney >= coins[i]) {
                changeOfMoney -= coins[i];
                rsl[size++] = coins[i];
            }
        }

        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        Machine machine = new Machine();
        System.out.println(Arrays.toString(machine.change(100, 22)));
    }
}
