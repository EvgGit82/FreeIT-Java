package library.menus.submenu_types;

import library.db_commands.DeleteBook;
import library.db_commands.PrintBookList;
import library.entity_classes.Library;
import library.utils.GetNumberFromScanner;

public class DeleteBookMenu implements IMenu {

    public void runMenu()
    {
        System.out.println("Let's  remove the book from the library. Enter the id of the book you want to delete.");

        while (true) {

            if (Library.getInstance().getBooksList().size() == 0) {
                System.out.println("The library is empty. You cannot delete a book. You must add a book first");
                return;
            }

            System.out.println("1. Show book list.");
            System.out.println("2. Delete the book using the book's id");
            System.out.println("0. Return to Main menu");
            System.out.println();

            System.out.println("Select option: ");

            switch (new GetNumberFromScanner().execute()) {
                case 1:
                    new PrintBookList().execute();
                    break;
                case 2:
                    System.out.println("Enter the book's id:");
                    new DeleteBook(new GetNumberFromScanner().execute()).execute();
                    System.out.println();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Wrong number!");
            }
        }
    }
}
