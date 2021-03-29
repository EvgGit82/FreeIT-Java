package lesson_5.com.interfacetasks.clothing.boots;


public class TimberlandBoots implements IBoots {

    @Override
    public String putOn() {
        return " puts Timberland boots on.";
    }

    @Override
    public String takeOff() {
        return " takes Timberland boots off.";
    }

}
