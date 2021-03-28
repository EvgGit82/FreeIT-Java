package lesson_5.com.interfacetasks.spaceport.spaceships;

import java.util.Random;

public class Soyuz implements IStart{

    private String name;

    public Soyuz(String name) {
        this.name = name;
    }

    @Override
    public boolean preflightSystemsCheck() throws InterruptedException {
        System.out.printf("Soyuz '%s' systems check...\n", name);
        Thread.sleep(800);
        return new Random().nextInt(10) > 3;
    }

    @Override
    public void enginesStart() {
        System.out.println("Soyuz \'" + name + "\' engines ON! All systems online!");
    }

    @Override
    public void start() {
        System.out.println("Soyuz \'" + name + "\' launched!");
    }
}
