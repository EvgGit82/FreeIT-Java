package lesson_5.com.interfacetasks.spaceport.spaceships;

import lombok.Data;

import java.util.Random;

@Data
public class SpaceX implements IStart {

    private String name;

    public SpaceX(String name) {
        this.name = name;
    }

    @Override
    public boolean preflightSystemsCheck() throws InterruptedException {
        System.out.printf("SpaceX '%s' systems check...\n", name);
        Thread.sleep(800);
        return new Random().nextInt(10) > 3;
    }

    @Override
    public void startEngines() {
        System.out.println("SpaceX \'" + name + "\' engines ON! All systems online!");
    }

    @Override
    public void start() {
        System.out.println("SpaceX \'" + name + "\' launched!");
    }
}
