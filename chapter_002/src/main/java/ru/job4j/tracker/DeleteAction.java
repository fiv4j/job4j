package ru.job4j.tracker;

public class DeleteAction extends BaseAction {

    public DeleteAction(String actionName) {
        super(actionName);
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        tracker.delete(input.askStr("Enter item's id you would delete: "));
        return true;
    }
}
