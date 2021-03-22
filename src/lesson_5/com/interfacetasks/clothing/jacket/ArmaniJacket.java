package lesson_5.com.interfacetasks.clothing.jacket;


public class ArmaniJacket implements IJacket {

    @Override
    public String putOn() {
        return " puts Armani jacket on.";
    }

    @Override
    public String takeOff() {
        return " takes Armani jacket off.";
    }
}
