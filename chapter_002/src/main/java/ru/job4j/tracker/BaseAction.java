package ru.job4j.tracker;

public abstract class BaseAction implements UserAction {

    String actionName;

    BaseAction() {
        this.actionName = "Do something";
    }

    @Override
    public String info() {
        return this.actionName;
    }
}
