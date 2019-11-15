package ru.job4j.tracker;

public class ShowAllAction extends BaseAction {

    public ShowAllAction(String actionName) {
        super(actionName);
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        for (Item item : tracker.findAll()) {
            System.out.println(item.getId() + " : " + item.getName());
        }
        return true;
    }
}
