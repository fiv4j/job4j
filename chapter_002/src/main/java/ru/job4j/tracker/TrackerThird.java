package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * Private static final class. Lazy loading.
 */
public class TrackerThird {

    private final Item[] items = new Item[100];
    private int position = 0;

    private TrackerThird() {
    }

    public static TrackerThird getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    private String generateId() {
        Random rnd = new Random();
        return String.valueOf(System.currentTimeMillis() + rnd.nextLong());
    }

    public Item findById(String id) {
        Item result = null;
        boolean isFound = false;
        for (int i = 0; !isFound && i < position; i++) {
            if (this.items[i].getId().equals(id)) {
                result = this.items[i];
                isFound = true;
            }
        }
        return result;
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[position];
        int resIndex = 0;
        for (Item item: this.items) {
            if (item == null) {
                break;
            }
            if (item.getName().equals(key)) {
                result[resIndex++] = item;
            }
        }
        return Arrays.copyOf(result, resIndex);
    }

    public Item[] findAll() {
        return Arrays.copyOf(this.items, position);
    }

    public boolean replace(String id, Item item) {
        boolean isReplaced = false;
        for (int i = 0; !isReplaced && i < position; i++) {
            if (this.items[i].getId().equals(id)) {
                this.items[i].setName(item.getName());
                isReplaced = true;
            }
        }
        return isReplaced;
    }

    public boolean delete(String id) {
        boolean isDeleted = false;
        for (int i = 0; !isDeleted && i < position; i++) {
            if (this.items[i].getId().equals(id)) {
                System.arraycopy(
                        this.items,
                        i + 1,
                        this.items,
                        i,
                        this.items.length - 1 - i
                );
                this.items[this.items.length - 1] = null;
                isDeleted = true;
                this.position--;
            }
        }
        return isDeleted;
    }

    private static final class Holder {
        private static final TrackerThird INSTANCE = new TrackerThird();
    }
}
