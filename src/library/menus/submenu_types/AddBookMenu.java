package library.menus.submenu_types;

import library.db_commands.AddBook;
import library.db_commands.AssembleBook;
import library.entity_classes.Library;
import library.utils.CommonProperties;
import library.utils.GetNumberFromScanner;

public class AddBookMenu implements IMenu {

    @Override
    public void runMenu() {

        System.out.println("Let's add a book");

        while (true){

            if (Library.getInstance().getBooksList().size() > CommonProperties.LIBRARY_CAPACITY) {
                System.out.println("Library's full. Cannot add another book. You must delete a book first.");
                return;
            }

            System.out.println("1. Start adding a book");
            System.out.println("0. Return to Main menu");

            switch (new GetNumberFromScanner().execute()) {
                case 1:
                    new AddBook(new AssembleBook().execute()).execute();
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
