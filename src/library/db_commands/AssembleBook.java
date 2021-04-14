package library.db_commands;

import library.entity_classes.Book;
import library.entity_classes.Genre;
import library.utils.CommonProperties;
import library.utils.GetGenreNumber;
import library.utils.GetLineFromScanner;
import library.utils.GetNumberFromScanner;

public class AssembleBook {

    public Book execute() {

        System.out.println("Enter title: ");
        String title = new GetLineFromScanner().execute();
        int genre = new GetGenreNumber().execute();

        return new Book(title, new Genre(genre));
    }
}
