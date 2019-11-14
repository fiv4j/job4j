package ru.job4j.tracker;

public class EditAction extends BaseAction {

    public EditAction() {
        this.actionName = "Edit item.";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter item's id you would change: ");
        Item newItem = new Item(input.askStr("Enter new item's name: "));
        tracker.replace(id, newItem);
        return true;
    }
}
