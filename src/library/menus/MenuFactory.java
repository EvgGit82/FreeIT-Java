package library.menus;

import library.menus.submenu_types.*;

import java.util.HashMap;
import java.util.Map;

public class MenuFactory {

    private Map <Integer, IMenu> subMenus = new HashMap<>();

    public MenuFactory() {
        subMenus.put(1, new SortingMenu());
        subMenus.put(2, new AddBookMenu());
        subMenus.put(3, new DeleteBookMenu());
        subMenus.put(4, new EditBookMenu());
        subMenus.put(0, new QuitMenu());
    }

    public IMenu createSubMenu(int option) {
        return subMenus.get(option);
    }
}
