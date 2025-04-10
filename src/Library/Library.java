package Library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books; // Liste zur Speicherung der Bücher

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Buch mit dem Titel " + "'" + book.getTitle() + "'" + " hinzugefügt");
    }

//    public void deleteBook(int id) {
//       for(Book book : books){
//           if (book.getId() == id){
//               System.out.println(book.getId()  + " gelöscht");
//               books.remove(book);
//               break; // важно! иначе ошибка ConcurrentModificationException /В Java нельзя модифицировать коллекцию во время for-each, если не выйти сразу → иначе ConcurrentModificationException.
//           }
//       }
//    }

    // Methode zum Entfernen eines Buches anhand seiner ID
    public void deleteBook(int id) {
        // Verwendung einer klassischen for-Schleife mit Index
        // Ermöglicht das sichere Entfernen von Elementen während der Iteration
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                System.out.println("Buch mit dem Titel " +
                        "'" + books.get(i).getTitle() + "'" +
                        " gelöscht");
                books.remove(i);
                return;
            }
        }
        System.out.println("Buch mit ID " +
                id + " nicht gefunden.");
    }

    // Methode zum Markieren eines Buches als gelesen anhand seiner ID
    public void reedBook(int id) {
        // Verwendung einer klassischen for-Schleife mit Index
        // Ermöglicht den Zugriff auf Elemente basierend auf ihrem Index
        for (int i = 0; i < books.size(); i++) { //Iterationen
            if (books.get(i).getId() == id) {
                System.out.println("Buch mit dem Titel " + "'" + books.get(i).getTitle() + "'" + " : gelesen");
                books.get(i).setReaded(true);
            }
        }
    }

    // Methode zur Anzeige aller Bücher in der Bibliothek mit ihrem Status
    public void displayLibrary() {
        System.out.println("ID\tTitel\t\tAuthor\t\tJahr\t\tStatus");
        // Verwendung einer klassischen for-Schleife mit Index
        // Ermöglicht den Zugriff auf Elemente basierend auf ihrem Index
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).isReaded()) {
                System.out.println(books.get(i).getId() + "\t" +
                        books.get(i).getTitle() + "\t\t" +
                        books.get(i).getAuthor() + "\t" +
                        books.get(i).getYear() + "\t\t" +
                        "gelesen");
            } else {
                System.out.println(books.get(i).getId() + "\t" +
                        books.get(i).getTitle() + "\t\t" +
                        books.get(i).getAuthor() + "\t" +
                        books.get(i).getYear() + "\t\t" +
                        "nicht gelesen");
            }
        }
    }

    public void displayReadedBooks() {
        System.out.println("ID\tTitel\t\tAuthor\t\tJahr\t\tStatus");
        for (Book book : books) {
            if (book.isReaded()) {
                System.out.println(book.getId() + "\t" +
                        book.getTitle() + "\t\t" +
                        book.getAuthor() + "\t" +
                        book.getYear() + "\t\t" +
                        "gelesen");
            }

        }

    }

}