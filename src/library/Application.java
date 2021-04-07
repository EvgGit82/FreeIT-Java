package library;

import library.menus.MainMenuController;
import library.utils.GetNumberFromScanner;

public class Application {

    public void start() {

        while (true) {
            System.out.println("1. Show all books");
            System.out.println("2. Add a book");
            System.out.println("3. Delete a book");
            System.out.println("4. Edit book info");
            System.out.println("0. Quit.");

            int option;

            do {
                System.out.println("Select your option: ");
                option = new GetNumberFromScanner().execute();
            } while (option < 0 || option > 4);

            new MainMenuController().runSubmenu(option);
        }
    }
}