package ru.job4j.tracker;

public abstract class BaseAction implements UserAction {

    protected String actionName;

    protected BaseAction() {
        this.actionName = "Do something";
    }

    @Override
    public String info() {
        return this.actionName;
    }
}
