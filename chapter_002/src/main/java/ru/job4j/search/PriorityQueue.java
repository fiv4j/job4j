package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {

    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод вставляет в нужную позицию элемент.
     * Позиция определяется по полю приоритет, чем меньше,
     * тем важнее задача.
     * @param task задача
     */
    public void put(Task task) {
        boolean isAdded = false;
        for (int idx = 0; !isAdded && idx < tasks.size(); idx++) {
            if (this.tasks.get(idx).getPriority() > task.getPriority()) {
                this.tasks.add(idx, task);
                isAdded = true;
            }
        }
        if (!isAdded) {
            this.tasks.add(task);
        }
    }

    public Task take() {
        return this.tasks.poll();
    }
}
