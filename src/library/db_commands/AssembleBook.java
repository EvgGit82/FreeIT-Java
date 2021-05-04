package library.db_commands;

import library.entity_classes.Book;
import library.entity_classes.Genre;
import library.utils.GetGenreNumber;
import library.utils.GetLineFromScanner;


public class AssembleBook {

    public Book execute() {
        System.out.println("Enter title: ");
        String bookTitle = new GetLineFromScanner().execute();
        int genreNumber = new GetGenreNumber().execute();

        return new Book(bookTitle, new Genre(genreNumber));
    }
}
