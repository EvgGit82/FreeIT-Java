package lesson_5.com.interfacetasks.spaceport.spaceships;

import lombok.Data;

import java.util.Random;

@Data
public class Shuttle implements IStart {

    private String name;

    public Shuttle(String name) {
        this.name = name;
    }

    @Override
    public boolean preflightSystemsCheck() throws InterruptedException {
        System.out.printf("Shuttle '%s' systems check...\n", name);
        Thread.sleep(800);
        return new Random().nextInt(10) > 3;
    }

    @Override
    public void enginesStart() {
        System.out.println("Shuttle \'" + name + "\' engines ON! All systems online!");
    }

    @Override
    public void start() {
        System.out.println("Shuttle \'" + name + "\' launched!");
    }
}
