package lesson_5.com.maintasks.Task26.abstracts;

import lesson_5.com.maintasks.Task26.interfaces.IPLug;

public abstract class DomesticAppliances implements IPLug {

    protected String name;

    public DomesticAppliances(String name) {
        this.name = name;
    }

    public void plugInMains(){
        System.out.println(name + " is now plugged into the mains.");
    }

    public void unplugFromMains () {
        System.out.println(name + " is now unplugged from the mains.");
    }

    public void setTemperature () {
        System.out.println("For " + name.toLowerCase() + " the temperature has been set.");
    }

}
