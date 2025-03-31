

package ToDO;

public class TestTodo {
    public static void main(String[] args) {


        TodoListenVerwaltung myTodoListenVerwaltung = new TodoListenVerwaltung(3);


        myTodoListenVerwaltung.addTask("einkaufen");


        System.out.println(myTodoListenVerwaltung.getTask(0));
        myTodoListenVerwaltung.deleteTask(0);
        System.out.println(myTodoListenVerwaltung.getTask(0));
        myTodoListenVerwaltung.addTask("lesen");
        myTodoListenVerwaltung.addTask("schlafen");
        myTodoListenVerwaltung.displayTask();
        myTodoListenVerwaltung.deleteTask(1);
        myTodoListenVerwaltung.displayTask();
        myTodoListenVerwaltung.markTaskComplete(2);
        myTodoListenVerwaltung.displayTask();




    }
}