package ru.job4j.tracker;

public class ExitAction extends BaseAction {

    ExitAction() {
        this.actionName = "Exit.";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
