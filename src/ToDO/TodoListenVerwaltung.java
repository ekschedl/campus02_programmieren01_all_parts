package ToDO;

import Library.Book;

public class TodoListenVerwaltung {
    private Task[] tasks; // Array zur Speicherung der Aufgaben

    // Konstruktor zur Initialisierung der Aufgabenliste mit einer bestimmten Größe
    public TodoListenVerwaltung(int listeGroesse) {
        tasks = new Task[listeGroesse];

    }

    // Methode zum Hinzufügen einer neuen Aufgabe
    public void addTask(String title) {
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] == null) { // Überprüfen, ob der aktuelle Platz im Array frei ist
                //  hier wäre id ab 1              int nextId = i + 1; // Beispiel: ID basierend auf dem Index (oder eine andere Logik)
                //  hier wäre id ab 1            tasks[i] = new Task(nextId, title, false); // Neues Task-Objekt erstellen
                // hier id beginnt  ab 0:
                tasks[i] = new Task(i, title, false); // Neue Aufgabe mit ID basierend auf dem Index erstellen
                System.out.println("Aufgabe '" + title + "' hinzugefügt");
                return; // Methode beenden, nachdem die Aufgabe hinzugefügt wurde
            }
        }
        System.out.println("Kein freier Platz verfügbar.");
    }


    //Methode zum Abrufen einer Aufgabe mit ID
    public Task getTask(int id) {
//       mit  for standard schleife
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] != null && tasks[i].getId() == id) {
                return tasks[i];
            }
        }
        System.out.println("Es gibt kein Task mit dieser ID.");

        return null;
//mit for each schleife
//        for (Task task : tasks) {
//            if (task != null && task.getId() == id) {
//                return task;
//            }
//        }

    }

    //methode zum verändern des boolean wertes der Task-Klasse
    public void markTaskComplete(int id) {
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] != null && tasks[i].getId() == id) {
                if (tasks[i].isComplete()) {
                    System.out.println("Geht nicht. Task mit ID " + id + " ist bereits abgeschlossen.");
                } else {
                    tasks[i].setComplete(true);
                    System.out.println("Gemacht. Task mit ID " + id + " wurde als abgeschlossen markiert.");
                }
                return;
            }
        }
        System.out.println("Task mit ID " + id + " wurde nicht gefunden.");
    }

    public void markTaskNoComplete(int id) {
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] != null && tasks[i].getId() == id) {
                if (!tasks[i].isComplete()) {
                    System.out.println("Geht nicht. Task mit ID " + id + " ist bereits nicht abgeschlossen.");
                } else {
                    tasks[i].setComplete(false);
                    System.out.println("Gemacht. Task mit ID " + id + " wurde als nicht abgeschlossen markiert.");
                }
                return;
            }
        }
        System.out.println("Task mit ID " + id + " wurde nicht gefunden.");
    }

    //Methode zum Löschen des Tasks
    public void deleteTask(int id) {
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] != null && tasks[i].getId() == id) {
                System.out.println("Gelöscht Task id: " + tasks[i].getId());
                tasks[i] = null;
                return; // Methode beenden, nachdem die Aufgabe hinzugefügt wurde
            }
        }

    }

    //    //Methode für die Konsolenausgabe
    public void displayTasks() {
        System.out.printf("%-5s %-20s %-10s%n", "ID", "Titel", "Status");
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].isComplete()) {
                System.out.printf("%-5d %-20s %-10s%n", tasks[i].getId(), tasks[i].getTitle(), "Erledigt");

            } else {
                System.out.printf("%-5d %-20s %-10s%n", tasks[i].getId(), tasks[i].getTitle(), "Offen");


            }

        }

    }
}


//String status = task.isComplete() ? "Erledigt" : "Offen";
