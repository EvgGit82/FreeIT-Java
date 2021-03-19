package lesson_5.Task26;

import lesson_5.Task26.classes.MicrowaveOven;
import lesson_5.Task26.classes.Refrigerator;
import lesson_5.Task26.classes.Toaster;

public class Runner {
    public static void main(String[] args) {

        Toaster toaster = new Toaster("Toaster");
        Refrigerator refrigerator = new Refrigerator("Fridge");
        MicrowaveOven microwaveOven = new MicrowaveOven("Microwave");

        toaster.plugInMains();
        toaster.loadBread();
        toaster.setTemperature();
        toaster.pressStart();
        toaster.switchedOff();
        toaster.unplugFromMains();

        System.out.println();

        refrigerator.plugInMains();
        refrigerator.selectCoolingMode();
        refrigerator.setTemperature();

        System.out.println();

        microwaveOven.plugInMains();
        microwaveOven.selectMode();
        microwaveOven.setTemperature();
        microwaveOven.pressStart();
        microwaveOven.pressStop();
        microwaveOven.unplugFromMains();
    }

}
