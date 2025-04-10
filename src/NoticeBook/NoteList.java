package NoticeBook;


import java.util.ArrayList;

public class NoteList {
    private Note[] notes;
    private int id;


    public NoteList() {
        notes = new Note[5];
        id = 1;
    }

    //Getter und Setter
    public Note[] getNotes() {
        return notes;
    }

    public void setNotes(Note[] notes) {
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addNote(String title, String content) {
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] == null) {
                notes[i] = new Note(id, title, content);
                id++;
                return;
            }
        }
        System.out.println("Full");
    }

    public void getNote(int id) {
        // for in Schleife
//        for (int i = 0; i < notes.length; i++) {
//            if (notes[i] != null && notes[i].getId() == id) {
//                System.out.println("ID: " + notes[i].getId() +
//                        ", Title: " + notes[i].getTitle() +
//                        ", Content: " + notes[i].getContent());
//            }
//        }
        // for each Schleife
        for (Note note : notes) {
            if (note != null && note.getId() == id) {
                System.out.println("ID: " + note.getId() +
                        ", Title: " + note.getTitle() +
                        ", Content: " + note.getContent());
            }
        }
    }

    public void deleteNote(int id) {
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] != null && notes[i].getId() == id) {
                notes[i] = null;
                System.out.println("Note with ID " + id + " has been deleted.");
                return;
            }
        }
        System.out.println("Note with ID " + id + " was not found.");
    }

    public void editNote(int id, String newTitle, String newContent) {
        for (int i = 0; i < notes.length; i++) {

            if (notes[i] != null && notes[i].getId() == id) {
                notes[i].setTitle(newTitle);  // Изменяем заголовок
                notes[i].setContent(newContent);  // Изменяем содержание
                return;  // После обновления выходим из метода
            }
            System.out.println("Note with ID " + id + " was not found.");

        }

    }

    public void displayNotes() {
        for (Note note : notes) {
//            Bevor auf die Methoden von note zugegriffen wird, wird überprüft, ob note ungleich null ist.
//            Nur dann wird der Zugriff auf getId(), getTitle() und getContent() ausgeführt.
            if (note != null) {
                System.out.println("ID: " + note.getId() +
                        ", Title: " + note.getTitle() +
                        ", Content: " + note.getContent());
            }

        }
    }
}

//    //So sieht man auch null zeile
//    public void displayNotes() {
//        for (int i = 0; i < notes.length; i++) {
//            if (notes[i] != null) {
//                System.out.println("ID: " + notes[i].getId() +
//                        ", Title: " + notes[i].getTitle() +
//                        ", Content: " + notes[i].getContent());
//            } else {
//                System.out.println("ID: null, Title: null, Content: null");
//            }
//        }
//    }


//}
//
//	•	Инициализируешь массив:
//	Note[] notes = new Note[5]; — теперь notes содержит 5 пустых мест.

// •	После добавления заметки в первое свободное место массива,
// например, с помощью метода addNote, массив будет выглядеть так:
// notes = [Note, null, null, null, null].
//
//Заметки будут заполнять массив, пока не заполнят все доступные ячейки.
// Если все ячейки заняты, метод выведет сообщение "Full".


// mit Arraylist
// public class NoteList {
//    private ArrayList<Note> notes;
//    private int id;
//
//    public NoteList() {
//        notes = new ArrayList<>();
//        id = 1;
//    }
//
//    public void addNote(String title, String content) {
//        notes.add(new Note(id, title, content));
//        id++;
//    }
//notes.remove(i);
//
//    public void displayNotes() {
//        for (Note note : notes) {
//            System.out.println("ID: " + note.getId() +
//                    ", Title: " + note.getTitle() +
//                    ", Content: " + note.getContent());
//        }
//    }

// list
//Note[] notes = noteList.getNotes();
//for (int i = 0; i < notes.length; i++) {
//        // что-то с notes[i]
//        }
//
//ArrayList
//ArrayList<Note> notes = noteList.getNotes();
//for (int i = 0; i < notes.size(); i++) {
//        // что-то с notes.get(i)
//        }