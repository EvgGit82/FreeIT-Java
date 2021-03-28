package lesson_5.com.interfacetasks.spaceport;

import lesson_5.com.interfacetasks.spaceport.spaceships.IStart;

public class Spaceport {

    public void start (IStart start) throws InterruptedException {
        if (start.preflightSystemsCheck()) {
            System.out.println("Prestart systems check complete!");
            start.enginesStart();
            System.out.println("Starting final countdown!");
            Thread.sleep(500);
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(150);
            }
            start.start();
        } else {
            System.out.println("Prestart system check failed... Wait for the next launch.");
        }
    }
}
