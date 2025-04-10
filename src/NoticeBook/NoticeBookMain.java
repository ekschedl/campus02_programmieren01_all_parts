package NoticeBook;

public class NoticeBookMain {
    public static void main(String[] args) {
        NoteList noteList = new NoteList(); //notes = new ArrayList<>();
        noteList.addNote("first", "test"); //notes.add(new Note(id, title, content));
        noteList.addNote("second", "test2");
        noteList.displayNotes();
        System.out.println("-------------------------");
        noteList.getNote(2);
        noteList.getNote(1);
        noteList.getNote(4);
        System.out.println("-------------------------");
        noteList.addNote("third", "test3");
        noteList.addNote("forth", "test4");
        noteList.displayNotes();
        System.out.println("-------------------------");
        noteList.getNote(4);
        System.out.println("-------------------------");
        noteList.displayNotes();
        System.out.println("-------------------------");
        noteList.deleteNote(3);
        System.out.println("-------------------------");
        noteList.displayNotes();
noteList.editNote(4, "NEW TITLE", "NEW TEXT");
        noteList.displayNotes();

    }
}
