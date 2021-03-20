package lesson_5.com.interfacetasks.clothing.jacket;

public class ZaraJacket implements IJacket {

    @Override
    public String putOn() {
        return " puts Zara jacket on.";
    }

    @Override
    public String takeOff() {
        return " takes Zara jacket off.";
    }
}
