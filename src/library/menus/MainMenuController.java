package library.menus;

import library.db_commands.PrintBookList;

public class MainMenuController {

    public void runSubmenu (int option) {

        if (option == 1) {
            new MenuFactory().createSubMenu(option).runMenu();
            new PrintBookList().execute();
        } else {
            new MenuFactory().createSubMenu(option).runMenu();
            System.out.println();
        }
    }
}
