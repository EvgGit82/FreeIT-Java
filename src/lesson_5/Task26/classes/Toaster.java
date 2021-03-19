package lesson_5.Task26.classes;

import lesson_5.Task26.abstracts.Ovens;

public class Toaster extends Ovens {

    public Toaster(String name) {
        super(name);
    }

    public void loadBread () {
        System.out.println("Bread has been loaded into " + name.toLowerCase() + ".");
    }

}
