package lesson_5.com.interfacetasks.spaceport;

import java.util.Random;

public class SpaceX implements IStart {

    private String name;

    public SpaceX(String name) {
        this.name = name;
    }

    @Override
    public boolean preflightSystemsCheck() {
        if (new Random().nextInt(10) >3 ){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void enginesStart() {
        System.out.println("SpaceX \'" + name + "\' engines ON! All systems online!");
    }

    @Override
    public void start() {
        System.out.println("SpaceX \'" + name + "\' launched!");
    }

}
