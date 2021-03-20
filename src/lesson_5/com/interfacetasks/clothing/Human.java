package lesson_5.com.interfacetasks.clothing;

import lesson_5.com.interfacetasks.clothing.boots.IBoots;
import lesson_5.com.interfacetasks.clothing.jacket.IJacket;
import lesson_5.com.interfacetasks.clothing.shorts.IShorts;

public class Human implements IHuman{

    private String name;

    private IJacket jacket;
    private IShorts shorts;
    private IBoots boots;

    public Human(String name, IJacket jacket, IShorts shorts, IBoots boots) {
        this.name = name;
        this.jacket = jacket;
        this.shorts = shorts;
        this.boots = boots;
    }

    @Override
    public void putClothesOn() {
        System.out.println(name + jacket.putOn());
        System.out.println(name + shorts.putOn());
        System.out.println(name + boots.putOn());
    }

    @Override
    public void takeClothesOff() {
        System.out.println(name + jacket.takeOff());
        System.out.println(name + shorts.takeOff());
        System.out.println(name + boots.takeOff());
    }
}
