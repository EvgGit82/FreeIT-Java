package lesson_5.com.maintasks.Task26.classes;

import lesson_5.com.maintasks.Task26.abstracts.Ovens;

public class Toaster extends Ovens {

    public Toaster() {
        name = "Toaster";
    }

    public void loadBread () {
        System.out.println("Bread has been loaded into " + name.toLowerCase() + ".");
    }

}
