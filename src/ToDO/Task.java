package ToDO;

public class Task {
    private int id;
    private String title;
    private boolean isComplete;

    // Konstruktor
    public Task(int id, String title, boolean isComplete) {
        this.id = id;
        this.title = title;
        this.isComplete = isComplete;
    }

    // Getter и Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    // toString für bessere Aussgabe
    @Override
    public String toString() {
        return "Task{id=" + id + ", title='" + title + "', isComplete=" + isComplete + '}';
    }
}