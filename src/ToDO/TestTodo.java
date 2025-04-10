

package ToDO;

import java.util.Arrays;

public class TestTodo {
    public static void main(String[] args) {


        TodoListenVerwaltung myTodoListenVerwaltung = new TodoListenVerwaltung(3);


        myTodoListenVerwaltung.addTask("einkaufen");
        myTodoListenVerwaltung.addTask("lesen");
        myTodoListenVerwaltung.addTask("schlaffen");
        myTodoListenVerwaltung.addTask("putzen");

        System.out.println(myTodoListenVerwaltung.getTask(2));
        System.out.println(myTodoListenVerwaltung.getTask(0));
        myTodoListenVerwaltung.markTaskComplete(2);
        System.out.println(myTodoListenVerwaltung.getTask(2));
        myTodoListenVerwaltung.markTaskNoComplete(2);
        System.out.println(myTodoListenVerwaltung.getTask(2));

         myTodoListenVerwaltung.getTask(1);
        myTodoListenVerwaltung.displayTasks();
        myTodoListenVerwaltung.markTaskComplete(2);
        myTodoListenVerwaltung.displayTasks();


    }
}