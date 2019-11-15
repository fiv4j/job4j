package ru.job4j.tracker;

public class StubAction extends BaseAction {
    private boolean call = false;

    public StubAction(String actionName) {
        super(actionName);
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        call = true;
        return false;
    }

    public boolean isCall() {
        return call;
    }
}
