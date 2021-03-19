package lesson_5.Task26.classes;

import lesson_5.Task26.abstracts.Ovens;

public class MicrowaveOven extends Ovens {

    public MicrowaveOven(String name) {
        super(name);
    }

    public void selectMode () {
        System.out.println("Baking mode has been selected for " + name.toLowerCase() +".");
    }

}
