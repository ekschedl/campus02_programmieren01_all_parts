package Library;

import java.util.ArrayList;

public class LibraryApp {
    public static void main(String[] args) {
        Book book1 = new Book(1, "title 1", "author 1", 2022);
        Book book2 = new Book(2, "title 2", "author 2", 2023);
        Book book3 = new Book(3, "title 3", "author 3", 2020);
        Book book4 = new Book(4, "title 4", "author 4", 2019);
        Book book5 = new Book(5, "title 5", "author 5", 1999);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.displayLibrary();
        library.deleteBook(4);
        library.addBook(book5);
        library.displayLibrary();
        library.reedBook(3);
        library.displayLibrary();
        library.reedBook(2);
        library.displayReadedBooks();
    }

}
