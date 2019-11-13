package ru.job4j.tracker;

public class ValidateInput extends ConsoleInput {

    @Override
    public int askInt(String question) {
        int value = -1;
        boolean invalid = true;
        while (invalid) {
            try {
                value = super.askInt(question);
                invalid = false;
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a valid data again");
            }
        }
        return value;
    }

    @Override
    public int askInt(String question, int max) {
        int value = -1;
        boolean invalid = true;
        while (invalid) {
            try {
                value = super.askInt(question, max);
                invalid = false;
            } catch (IllegalStateException ex) {
                System.out.println("Please select key from menu.");
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a valid data again");
            }
        }
        return value;
    }
}
