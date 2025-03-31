package ToDO;

public class TodoListenVerwaltung {

    private Task[] tasks;
    private int nextId;
    private int numberOfTasks;

    // Konstruktor
    public TodoListenVerwaltung(int maxNumberOfTasks) {
        this.tasks = new Task[maxNumberOfTasks];// Initialisierung des Arrays für Aufgaben
        this.nextId = 0;
        this.numberOfTasks = 0;
    }

    // Methode zum Hinzufügen einer neuen Aufgabe
    public void addTask(String title) {
        if (numberOfTasks >= tasks.length) {
            System.out.println("Task-Liste ist voll!");
            return;
        }
        // Checken  freien Platz im Array
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] == null) {
                tasks[i] = new Task(nextId++, title, false); //  nextId für eine eindeutige ID
                System.out.println("Added: " + tasks[i]);// Ausgabe der hinzugefügten Aufgabe
                numberOfTasks++; // Anzahl der Aufgaben erhöhen
                break; //Schleife nach dem Hinzufügen der Aufgabe beenden
            }
        }
    }

    // Methode zum Abrufen einer Aufgabe mit ID
    public Task getTask(int id) {
        for (int i = 0; i < tasks.length; i++) {
            //zuweisen Objekt zum array
            Task task = tasks[i];// Zuweisung der Aufgabe aus dem Array
            // Überprüfen, ob die Aufgabe existiert und die ID übereinstimmt
            //!=0 um nullpointerexception zu vermeiden
            if (task != null && task.getId() == id) {
                // ausgabe
                return tasks[i];
            }
        }
        // wenn if bedingung nicht erreicht gibt null zurück
        return null;
    }

    //methode zum verändern des boolean wertes der Task-Klasse
    public void markTaskComplete(int id) {
        for (int i = 0; i < tasks.length; i++) {
            //zuweisen Objekt zum array
            Task task = tasks[i];
            // bedingung mit getter aus Klasse task
            //!=0 um nullpointerexception zu vermeiden
            // Überprüfen, ob die Aufgabe existiert und die ID übereinstimmt
            if (task != null && task.getId() == id) {
                // boolean auf true setzen mit setter methode aus der Task-Klasse
                tasks[i].setComplete(true); // Setzen des Status der Aufgabe auf abgeschlossen

            }
        }
    }

    //Methode zum löschen des Tasks
    public void deleteTask(int id) {
        //iteration
        for (int i = 0; i < tasks.length; i++) {
            //zuweisen Objekt zum array
            Task task = tasks[i];
            // bedingung mit getter aus Klasse task
            //!=0 um nullpointerexception zu vermeiden
            // Überprüfen, ob die Aufgabe existiert und die ID übereinstimmt
            if (task != null && task.getId() == id) {
                System.out.println("Deleted: " + tasks[i]);
                // löschen des Objekts
                tasks[i] = null;
                //counter für Array ist voll Abfrage
                numberOfTasks--;
            }
        }

    }

    //Methode für die Konsolenausgabe
    public void displayTask() {
        //Variable für ausgabe in der konsole, deklariert und initialisiert
        String d = "";
        // Kopfzeile der Ausgabe
        System.out.println("ID\tTitel\t\tStatus");

        //iteration mit loop
        for (int i = 0; i < tasks.length; i++) {
            // Überprüfen, ob die Aufgabe nicht null ist
            if (tasks[i] != (null)) {
                // Wenn die Aufgabe abgeschlossen ist, setze den Status auf "done"
                if (tasks[i].isComplete()) {
                    //für true
                    d = "done";
                } else {
                    // für false
                    d = "offen";
                }
                // Ausgabe der Aufgabe mit ihrer ID, Titel und Status
                System.out.println("0" + tasks[i].getId() + "\t" + tasks[i].getTitle() + "\t\t" + d);
            }
        }
        System.out.println();
    }
}
