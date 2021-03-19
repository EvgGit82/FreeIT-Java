package lesson_5.Task26.abstracts;

import lesson_5.Task26.interfaces.IStarter;

public abstract class Ovens extends DomesticAppliances implements IStarter {

    public Ovens(String name) {
        super(name);
    }

    public void switchOn (){
        System.out.println(name + " is now switched on.");
    }

    public void switchedOff (){
        System.out.println(name + " is now switched off.");
    }

    public void pressStart () {
        System.out.println(name + " is now switched on and running.");
    }

    public void pressStop (){
        System.out.println(name + " has stopped.");
    }

    public void setTemperature () {
        System.out.println("For " + name.toLowerCase() + " the heating temperature has been set.");
    }

}
