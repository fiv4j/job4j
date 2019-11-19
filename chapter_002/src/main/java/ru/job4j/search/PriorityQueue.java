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
        int idx = 0;
        for (Task currentTask: this.tasks) {
            if (currentTask.getPriority() > task.getPriority()) {
                break;
            }
            idx++;
        }
        this.tasks.add(idx, task);
    }

    public Task take() {
        return this.tasks.poll();
    }
}
