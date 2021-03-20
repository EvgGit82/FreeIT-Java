package lesson_5.com.interfacetasks.clothing.boots;

public class GrensonBoots implements IBoots{

    String name;

    @Override
    public String putOn() {
        return " puts Grenson boots on";
    }

    @Override
    public String takeOff() {
        return " takes Grenson boots off.";
    }
}
