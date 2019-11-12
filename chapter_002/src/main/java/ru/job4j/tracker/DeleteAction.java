package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        tracker.delete(input.askStr("Enter item's id you would delete: "));
        return true;
    }
}
