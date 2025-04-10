package Angabe02;

public class TodoListenVerwaltung {
    private static Task[] tasks;
    private static int id = 0;

    public TodoListenVerwaltung() {
        tasks = new Task[3];
    }

    public static void addTask(String title) {
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] == null) {
                tasks[i] = new Task(id, title);
                id++;
                return;
            }
        }
        System.out.println("Die Task Liste ist voll");
    }

    public Task getTask(int id) {
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] != null && tasks[i].getId() == id) {
                return tasks[i];
            }
        }
        return null;
    }

    public void markTaskComplete(int id) {
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] != null && tasks[i].getId() == id) {
                tasks[i].setComplete(true);
                break;
            }
        }
    }

    public void deleteTask(int id) {
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] != null && tasks[i].getId() == id) {
                tasks[i] = null;
                break;
            }
        }
    }

    public void displayTasks() {
        String status = "";
        // Kopfzeile der Ausgabe

        System.out.println("ID  \tTitel       \tStatus");
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] != null) {
                if (tasks[i].isComplete()) {
                    status = "Erledigt";
                } else {
                    status = "Offen";
                }
                // Ausgabe der Aufgabe mit ihrer ID, Titel und Status
                System.out.println("0" + tasks[i].getId() + "  \t" + tasks[i].getTitle() + "      \t" + status);
//oder mit printf
            }
        }
        System.out.println("____________");
    }


}

