package ru.netology.javacore;

import java.util.*;

public class Todos {
    private Set<String> taskList = new TreeSet<>();
    private static final int SIZE = 7;

    public void addTask(String task) {
        if (taskList.size() < SIZE) {
            taskList.add(task);
        }
    }

    public void removeTask(String task) {
        taskList.remove(task);
    }

    public Set<String> getAllTasks() {
        return taskList;
    }

}
