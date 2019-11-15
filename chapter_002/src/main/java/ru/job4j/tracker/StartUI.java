package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.length);
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].info());
        }
    }

    public static void main(String[] args) {
        Input input = new ValidateInput(new ConsoleInput());
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction("Create Item."),
                new ShowAllAction("Show all."),
                new EditAction("Edit item."),
                new DeleteAction("Delete item."),
                new FindByIdAction("Find item by id."),
                new FindByNameAction("Find item by name."),
                new ExitAction("Exit.")
        };
        new StartUI().init(input, tracker, actions);
    }
}
