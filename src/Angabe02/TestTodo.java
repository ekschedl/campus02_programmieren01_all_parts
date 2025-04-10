package Angabe02;

import java.util.Arrays;

public class TestTodo {
    public static void main(String[] args) {
        TodoListenVerwaltung myTodoListenVerwaltung = new TodoListenVerwaltung();

        myTodoListenVerwaltung.addTask("Einkaufen");
        myTodoListenVerwaltung.addTask("PR1 Ueben");
        myTodoListenVerwaltung.addTask("Lernen");

        myTodoListenVerwaltung.displayTasks();

        myTodoListenVerwaltung.markTaskComplete(1);
        myTodoListenVerwaltung.displayTasks();
        myTodoListenVerwaltung.deleteTask(2);
        myTodoListenVerwaltung.displayTasks();

    }
}
