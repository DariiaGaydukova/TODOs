package ru.netology.javacore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TodosTests {

    private Todos todos;


    @BeforeEach
    void setUpApp() {
        todos = new Todos();

    }

    @Test
    @DisplayName("Тестирование на формирования списка задач в алфавитном порядке")
    public void testGetAllTasks() {

        String expected = "A B C D";
        todos.addTask("A");
        todos.addTask("D");
        todos.addTask("C");
        todos.addTask("B");

        Assertions.assertEquals(expected, todos.getAllTasks());
    }

    @Test
    @DisplayName("Тестирование удаления задачи")
    void testRemoveTask() {

        todos.addTask("A");
        todos.addTask("B");
        todos.addTask("C");
        todos.removeTask("B");

        String expected = "A C";

        Assertions.assertEquals(expected, todos.getAllTasks());
    }

    @Test
    @DisplayName("Тестирование добавления задачи")
    void testAddTask() {

        todos.addTask("A");
        todos.addTask("B");
        todos.addTask("C");

        String expected = "A B C";

        Assertions.assertEquals(expected, todos.getAllTasks());
    }

}
