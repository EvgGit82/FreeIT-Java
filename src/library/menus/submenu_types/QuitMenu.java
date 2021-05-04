package library.menus.submenu_types;

public class QuitMenu implements IMenu {

    @Override
    public void runMenu() {
        System.out.println("Bye-bye!");
        System.exit(0);
    }

}
