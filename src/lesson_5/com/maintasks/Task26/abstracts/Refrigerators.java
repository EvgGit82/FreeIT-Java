package lesson_5.com.maintasks.Task26.abstracts;

public abstract class Refrigerators extends DomesticAppliances {

    public void selectCoolingMode () {
        System.out.println("Cooling mode has been selected for " + name.toLowerCase() + ".");
    }

    public void setTemperature () {
        System.out.println("For " + name.toLowerCase() + " the cooling temperature has been set.");
    }
}
