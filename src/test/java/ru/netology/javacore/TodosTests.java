package ru.netology.javacore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;


public class TodosTests {

    private Todos todos;
    private static final int SIZE = 7;

    @BeforeEach
    void setUpApp() {
        todos = new Todos();
    }

    @Test
    @DisplayName("Макс размер ToDos")
    public void addTaskMax() {

        String task = "Hello, World!";
        for (int i = 0; i < SIZE; i++) {
            todos.addTask(task + i);
        }

        todos.addTask(task);
        Assertions.assertEquals(SIZE, todos.getAllTasks().size());
    }

    @Test
    @DisplayName("Тестирование удаления задачи")
    void removeTask() {

        todos.addTask("A");
        todos.addTask("B");
        todos.addTask("C");
        todos.removeTask("B");

        Set<String> expected = new HashSet<>();
        expected.add("A");
        expected.add("C");

        Assertions.assertEquals(expected, todos.getAllTasks());
    }

    @Test
    @DisplayName("Тестирование добавления задачи")
    void addTask() {

        todos.addTask("A");
        todos.addTask("B");
        todos.addTask("C");

        Set<String> expected = new HashSet<>();
        expected.add("A");
        expected.add("B");
        expected.add("C");

        Assertions.assertEquals(expected, todos.getAllTasks());
    }

}
