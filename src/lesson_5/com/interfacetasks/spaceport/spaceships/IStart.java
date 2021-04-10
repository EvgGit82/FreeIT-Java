package lesson_5.com.interfacetasks.spaceport.spaceships;

public interface IStart {

    boolean preflightSystemsCheck() throws InterruptedException;
    void startEngines();
    void start();


}
