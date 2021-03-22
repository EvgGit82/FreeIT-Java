package lesson_5.com.interfacetasks.clothing.boots;


public class MartensBoots implements IBoots {

    @Override
    public String putOn() {
        return " puts Dr. Martens boots on.";
    }

    @Override
    public String takeOff() {
        return " takes Dr. Martens boots off.";
    }
}
