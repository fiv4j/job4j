package ru.job4j.tracker;

import java.util.List;

public class FindByNameAction extends BaseAction {

    public FindByNameAction(String actionName) {
        super(actionName);
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> result = tracker.findByName(input.askStr("Enter item's name you would find: "));
        if (result.size() == 0) {
            System.out.println("No items found.");
        } else {
            for (Item item: result) {
                System.out.println(item.getId() + " : " + item.getName());
            }
        }
        return true;
    }
}
