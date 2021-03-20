package lesson_5.com.interfacetasks.clothing.jacket;

public class DieselJacket implements IJacket {

    @Override
    public String putOn() {
       return " puts Diesel jacket on.";
    }

    @Override
    public String takeOff() {
        return " takes Diesel jacket off.";
    }
}
