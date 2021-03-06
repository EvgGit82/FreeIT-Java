package lesson_5.com.interfacetasks.spaceport.spaceships;

import java.util.Random;

public class Progress implements IStart{

    private String name;

    public Progress (String name) {
        this.name = name;
    }

    @Override
    public boolean preflightSystemsCheck() throws InterruptedException {
        System.out.printf("Progress '%s' systems check...\n", name);
        Thread.sleep(800);
        return new Random().nextInt(10) > 3;
    }

    @Override
    public void startEngines() {
        System.out.println("Progress \'" + name + "\' engines ON! All systems online!");
    }

    @Override
    public void start() {
        System.out.println("Progress \'" + name + "\' launched!");
    }

}
