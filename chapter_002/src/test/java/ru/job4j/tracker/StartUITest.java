package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] testAnswers = {"New item from test"};
        Input input = new StubInput(testAnswers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("New item from test");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item oldItem = new Item("Old item");
        tracker.add(oldItem);
        String oldItemId = oldItem.getId();

        String[] testAnswer = {oldItemId, "New item from test"};
        Input input = new StubInput(testAnswer);
        StartUI.editItem(input, tracker);
        Item replaced = tracker.findById(oldItemId);
        assertThat(replaced.getName(), is("New item from test"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("Alone item");
        tracker.add(item);
        String itemId = item.getId();

        String[] testAnswer = {itemId};
        Input input = new StubInput(testAnswer);
        StartUI.deleteItem(input, tracker);
        Item deleted = tracker.findById(itemId);
        boolean isDeleted = deleted == null;
        assertThat(isDeleted, is(true));
    }
}
