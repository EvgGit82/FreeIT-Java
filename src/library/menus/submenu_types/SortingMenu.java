package library.menus.submenu_types;

import library.sorters.ListSorter;
import library.utils.GetMenuOption;

public class SortingMenu implements IMenu {

    @Override
    public void runMenu() {
        System.out.println("1. Show sorted by title A-Z");
        System.out.println("2. Show sorted by title Z-A");
        System.out.println("3. Show sorted by time of adding to the library");

        int option = new GetMenuOption(1, 3).execute();

        new ListSorter().sortLibraryList(option);
        System.out.println();
    }

}
