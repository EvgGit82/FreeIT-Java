package library.menus.submenu_types;

import library.db_commands.EditBook;
import library.db_commands.PrintBookList;
import library.entity_classes.Book;
import library.entity_classes.Library;
import library.utils.GetNumberFromScanner;

import java.util.ArrayList;

public class EditBookMenu implements IMenu {

    @Override
    public void runMenu() {

        System.out.println("Let's edit information on a book selected by id");

        while (true){
            System.out.println("1. Show library list ");
            System.out.println("2. Edit existing book from the library");
            System.out.println("0. Return to main menu");

            switch (new GetNumberFromScanner().execute()){
                case 1:
                    new PrintBookList().execute();
                    break;
                case 2:
                    int bookToEditId = prepareBookForEditing();
                    new EditBook(bookToEditId).execute();
                    break;
                case 0:
                    return;
            }
        }
    }

    private int prepareBookForEditing() {
        boolean isPresent = false;
        int bookToEditId = -1;

        while (!isPresent) {
            System.out.println("Enter existing book's id: ");
            bookToEditId = new GetNumberFromScanner().execute();
            isPresent = bookAvailabilityVerification(bookToEditId);
        }
        return bookToEditId;
    }

    private boolean bookAvailabilityVerification (int id) {
        ArrayList<Integer> bookIDs = new ArrayList<>();
        for (Book aBook : Library.getInstance().getBooksList()) {
            bookIDs.add(aBook.getId());
        }

        if (!bookIDs.contains(id)) {
            System.out.println("There is no book with this id in the library");
            System.out.println();
            return false;
        } else {
            return true;
        }
    }
}
