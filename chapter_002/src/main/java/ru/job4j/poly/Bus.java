package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void run() {
        System.out.println("I'm running.");
    }

    @Override
    public void getPassengers(int num) {
        System.out.println("It gets " + num + " passengers.");
    }

    @Override
    public double load(int gas) {
        double price = 1.05;
        return gas * price;
    }
}
