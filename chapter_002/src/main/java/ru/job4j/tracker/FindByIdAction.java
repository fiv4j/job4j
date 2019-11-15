package ru.job4j.tracker;

public class FindByIdAction extends BaseAction {

    public FindByIdAction(String actionName) {
        super(actionName);
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item item = tracker.findById(input.askStr("Enter item's id you would find: "));
        if (item == null) {
            System.out.println("Item not found.");
        } else {
            System.out.println(item.getId() + " : " + item.getName());
        }
        return true;
    }
}
