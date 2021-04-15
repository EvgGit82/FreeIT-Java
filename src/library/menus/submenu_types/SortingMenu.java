package library.menus.submenu_types;

import library.sorters.ListSorter;
import library.utils.GetNumberFromScanner;

public class SortingMenu implements IMenu {

    @Override
    public void runMenu() {
        System.out.println("1. Show sorted by title A-Z");
        System.out.println("2. Show sorted by title Z-A");
        System.out.println("3. Show sorted by time of adding to the library");

        int option;

        do {
            System.out.println("Select your option: ");
            option = new GetNumberFromScanner().execute();
        } while (option < 1 || option > 3);

        new ListSorter().sortLibraryList(option);
        System.out.println();
    }

}
