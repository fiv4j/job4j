package ru.job4j.tracker;

public class StartUI {

    private void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = input.askInt("");
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                for (Item item : tracker.findAll()) {
                    System.out.println(item.getId() + " : " + item.getName());
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                String id = input.askStr("Enter item's id you would change: ");
                Item newItem = new Item(input.askStr("Enter new item's name: "));
                tracker.replace(id, newItem);
            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                tracker.delete(input.askStr("Enter item's id you would delete: "));
            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                Item item = tracker.findById(input.askStr("Enter item's id you would find: "));
                if (item == null) {
                    System.out.println("Item not found.");
                } else {
                    System.out.println(item.getId() + " : " + item.getName());
                }
            } else if (select == 5) {
                System.out.println("=== Find item by Name ====");
                Item[] result = tracker.findByName(input.askStr("Enter item's name you would find: "));
                if (result.length == 0) {
                    System.out.println("No items found.");
                } else {
                    for (Item item: result) {
                        System.out.println(item.getId() + " : " + item.getName());
                    }
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
