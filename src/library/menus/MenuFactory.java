package library.menus;

import library.menus.submenu_types.*;

import java.util.HashMap;
import java.util.Map;

public class MenuFactory {

    public IMenu createSubMenu(int option) {
        Map <Integer, IMenu> subMenus = new HashMap<>();
        subMenus.put(1, new SortingMenu());
        subMenus.put(2, new AddBookMenu());
        subMenus.put(3, new DeleteBookMenu());
        subMenus.put(4, new EditBookMenu());
        subMenus.put(0, new QuitMenu());

        return subMenus.get(option);
    }
}
