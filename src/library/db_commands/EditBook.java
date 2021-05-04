package library.db_commands;

import library.entity_classes.Genre;
import library.entity_classes.Library;
import library.utils.GetGenreNumber;
import library.utils.GetLineFromScanner;

public class EditBook {

    private int bookId;
    private String newTitle;
    private int newGenreNumber;
    int bookPosition;

    public EditBook(int bookId) {
        this.bookId = bookId;
    }

    public void execute() {

        bookPosition = findBookInLibrary();

        getNewBookInfo();

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

    private void getNewBookInfo() {
        System.out.println("Enter new title of the book");
        newTitle = new GetLineFromScanner().execute();
        newGenreNumber = new GetGenreNumber().execute();
    }

    private void changeBookInfo () {
        Library.getInstance().getBooksList().get(bookPosition).setTitle(newTitle);
        Library.getInstance().getBooksList().get(bookPosition).setGenre(new Genre(newGenreNumber));
    }
}