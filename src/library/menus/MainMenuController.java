package library.menus;

import library.db_commands.PrintBookList;
import library.menus.submenu_types.*;

import java.util.HashMap;
import java.util.Map;

public class MainMenuController {

    private Map<Integer, IMenu> subMenus = new HashMap<>();

    public MainMenuController() {
        subMenus.put(1, new SortingMenu());
        subMenus.put(2, new AddBookMenu());
        subMenus.put(3, new DeleteBookMenu());
        subMenus.put(4, new EditBookMenu());
        subMenus.put(0, new QuitMenu());
    }
    
    public void runSubmenu (int option) {

        if (option == 1) {
            subMenus.get(option).runMenu();
            new PrintBookList().execute();
        } else {
            subMenus.get(option).runMenu();
            System.out.println();
        }
    }
}
