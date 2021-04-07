package library.db_commands;

import library.entity_classes.Book;
import library.entity_classes.Genre;
import library.utils.CommonProperties;
import library.utils.GetLineFromScanner;
import library.utils.GetNumberFromScanner;

public class AssembleBook {

    public Book execute() {
        System.out.println("Enter title: ");

        String title = new GetLineFromScanner().execute();

        int genre;
        do {
            System.out.println("Enter Genre using number (1-Adventure, 2-Biography, 3-Fantasy, 4-Historical fiction, " +
                    "5-Horror, 6-Mystery, 7-Religion, 8-Romance, 9-Science fiction, 10-Thriller, 0-No genre specified):");
            genre = new GetNumberFromScanner().execute();
        } while (genre < 0 || genre > CommonProperties.NUMBER_OF_GENRES);
        return new Book(title, new Genre(genre));
    }
}
