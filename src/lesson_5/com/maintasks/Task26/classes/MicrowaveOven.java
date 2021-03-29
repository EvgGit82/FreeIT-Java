package lesson_5.com.maintasks.Task26.classes;

import lesson_5.com.maintasks.Task26.abstracts.Ovens;

public class MicrowaveOven extends Ovens {

    public MicrowaveOven() {
        name = "Microwave";
    }

    public void selectMode () {
        System.out.println("Baking mode has been selected for " + name.toLowerCase() +".");
    }

}
