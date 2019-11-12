package ru.job4j.strategy;

public class Square implements Shape {
    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("*****").append(System.lineSeparator());
        sb.append("*   *").append(System.lineSeparator());
        sb.append("*   *").append(System.lineSeparator());
        sb.append("*   *").append(System.lineSeparator());
        sb.append("*****");
        return sb.toString();
    }
}
