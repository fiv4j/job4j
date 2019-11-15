package ru.job4j.tracker;

public class EditAction extends BaseAction {

    public EditAction(String actionName) {
        super(actionName);
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter item's id you would change: ");
        Item newItem = new Item(input.askStr("Enter new item's name: "));
        tracker.replace(id, newItem);
        return true;
    }
}
