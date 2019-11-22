package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StartUI {

    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.size());
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.size(); index++) {
            System.out.println(index + ". " + actions.get(index).info());
        }
    }

    public static void main(String[] args) {
        Input input = new ValidateInput(new ConsoleInput());
        Tracker tracker = new Tracker();
        UserAction[] actionsArray = {
                new CreateAction("Create Item."),
                new ShowAllAction("Show all."),
                new EditAction("Edit item."),
                new DeleteAction("Delete item."),
                new FindByIdAction("Find item by id."),
                new FindByNameAction("Find item by name."),
                new ExitAction("Exit.")
        };
        List<UserAction> actions = new ArrayList<>(Arrays.asList(actionsArray));
        new StartUI().init(input, tracker, actions);
    }
}
