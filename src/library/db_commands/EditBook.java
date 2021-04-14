package library.db_commands;

import library.entity_classes.Genre;
import library.entity_classes.Library;
import library.utils.CommonProperties;
import library.utils.GetLineFromScanner;
import library.utils.GetNumberFromScanner;

public class EditBook {

    private int bookId;
    private String newTitle;
    private int newGenre;
    int bookPosition;

    public EditBook(int bookId) {
        this.bookId = bookId;
    }

    public void execute() {

        bookPosition = findBookInLibrary();

        getNewbookInfo();

        changeBookInfo();

        System.out.println("Changes saved");
        System.out.println();
    }

    private int findBookInLibrary() {

        int bookPlaceInLibrary = -1;

        for (int i = 0; i < Library.getInstance().getBooksList().size(); i++) {
            if (Library.getInstance().getBooksList().get(i).getId() == bookId) {
                bookPlaceInLibrary = i;
            }
        }
        return bookPlaceInLibrary;
    }

    private void getNewbookInfo () {
        System.out.println("Enter new title of the book");
        newTitle = new GetLineFromScanner().execute();

        do {
            System.out.println("Enter Genre using number (1-Adventure, 2-Biography, 3-Fantasy, 4-Historical fiction, " +
                    "5-Horror, 6-Mystery, 7-Religion, 8-Romance, 9-Science fiction, 10-Thriller, 0-No genre specified):");
            newGenre = new GetNumberFromScanner().execute();
        } while (newGenre < 0 || newGenre > CommonProperties.NUMBER_OF_GENRES);
    }

    private void changeBookInfo () {
        Library.getInstance().getBooksList().get(bookPosition).setTitle(newTitle);
        Library.getInstance().getBooksList().get(bookPosition).setGenre(new Genre(newGenre));
    }
}