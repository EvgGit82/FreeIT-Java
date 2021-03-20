package lesson_5.com.interfacetasks.spaceport;

public class SpacePort {

    public void start (IStart start) throws InterruptedException {
        if (start.preflightSystemsCheck()) {
            System.out.println("Prestart systems check complete!");
            start.enginesStart();
            System.out.println("Starting final countdown!");
            Thread.sleep(500);
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(200);
            }
            start.start();
        } else {
            System.out.println("Prestart system check failed...");
        }
    }

}
