package lesson_5.com.maintasks.Task26;

import lesson_5.com.maintasks.Task26.classes.MicrowaveOven;
import lesson_5.com.maintasks.Task26.classes.Refrigerator;
import lesson_5.com.maintasks.Task26.classes.Toaster;

/*
Создать иерархию классов, описывающих бытовую технику. Создать несколько объектов описанных классов,
часть из них включить в розетку. Иерархия должна иметь хотя бы три уровня.
*/

public class Runner {
    public static void main(String[] args) {

        Toaster toaster = new Toaster();
        Refrigerator refrigerator = new Refrigerator();
        MicrowaveOven microwaveOven = new MicrowaveOven();

        toaster.plugInMains();
        toaster.loadBread();
        toaster.switchOn();
        toaster.setTemperature();
        toaster.pressStart();
        toaster.switchOff();
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
