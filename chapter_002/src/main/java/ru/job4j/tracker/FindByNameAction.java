package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by Name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] result = tracker.findByName(input.askStr("Enter item's name you would find: "));
        if (result.length == 0) {
            System.out.println("No items found.");
        } else {
            for (Item item: result) {
                System.out.println(item.getId() + " : " + item.getName());
            }
        }
        return true;
    }
}
