package library;

import library.menus.MainMenuController;
import library.utils.GetMenuOption;
import library.utils.GetNumberFromScanner;

public class Application {

    public void start() {

        while (true) {
            System.out.println("1. Show all books");
            System.out.println("2. Add a book");
            System.out.println("3. Delete a book");
            System.out.println("4. Edit book info");
            System.out.println("0. Quit.");

            int option = new GetMenuOption(0, 4).execute();

            new MainMenuController().runSubmenu(option);
        }
    }
}