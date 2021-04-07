package library.menus;

import library.menus.submenu_types.*;

public class MenuFactory {

    private IMenu subMenu;

    public IMenu createSubMenu(int option) {

        switch (option) {
            case 1:
                subMenu = new SortingMenu();
                break;
            case 2:
                subMenu = new AddBookMenu();
                break;
            case 3:
                subMenu = new DeleteBookMenu();
                break;
            case 4:
                subMenu = new EditBookMenu();
                break;
            case 0:
                subMenu = new QuitMenu();
                break;
        }
        return subMenu;
    }
}
