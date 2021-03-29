package lesson_5.com.interfacetasks.clothing.shorts;

public class GucciShorts implements IShorts {

    @Override
    public String putOn() {
        return " puts Gucci shorts on.";
    }

    @Override
    public String takeOff() {
        return " takes Gucci shorts off.";
    }

}
