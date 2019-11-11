package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rnd = new Random();
        return String.valueOf(System.currentTimeMillis() + rnd.nextLong());
    }

    /**
     * Метод ищет заявку в хранилище по ее id
     *
     * @param id id необходимой заявки
     * @return найденная заявка
     */
    public Item findById(String id) {
        Item result = null;
        boolean isFound = false;
        for (Item item: this.items) {
            if (item == null || isFound) {
                break;
            }
            if (item.getId().equals(id)) {
                result = item;
                isFound = true;
            }
        }
        return result;
    }

    /**
     * Метод ищет заявки в хранилище по имени заявки
     *
     * @param key название заявки, по которой производится поиск
     * @return массив заявок, у которых name совпадает с key
     */
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

    /**
     * Метод возвращает копию хранилища без null элементов
     *
     * @return Копия массива-хранилища без null элементов
     */
    public Item[] findAll() {
        return Arrays.copyOf(this.items, position);
    }

    /**
     * Метод заменяет в массиве-хранилище элемент с данным id
     * на новый элемент item
     *
     * @param id id элемента хранилища, подлежащего замене
     * @param item элемент, которым заменяется существующий
     * @return true, если замену удалось осуществить, иначе false
     */
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

    /**
     * Метод удаляет из массива заявок элемент
     * с данным id. При этом все элементы справа от
     * удаляемого элемента смещаются на одну ячейку
     * влево
     *
     * @param id удаляемый элемент
     * @return true, если удаление прошло успешно, иначе false
     */
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
}
