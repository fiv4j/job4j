package ru.job4j.tracker;

public class ShowAllAction extends BaseAction {

    ShowAllAction() {
        this.actionName = "Show all.";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        for (Item item : tracker.findAll()) {
            System.out.println(item.getId() + " : " + item.getName());
        }
        return true;
    }
}
