package lesson_5.com.interfacetasks.spaceport;

import java.util.ArrayList;
import java.util.List;

public class SpacePortRunner {
    public static void main(String[] args) throws InterruptedException {

        SpacePort spacePort = new SpacePort();

        List<IStart> spaceships = new ArrayList<>(){{
            add(new Shuttle("Discovery"));
            add(new SpaceX("Of Course I Still Love You"));
            add(new Shuttle("Columbia"));
            add(new SpaceX("Just Read the Instructions"));
            add(new Shuttle("Challenger"));
            add(new SpaceX("GO Ms. Tree"));
            add(new SpaceX("GO Ms. Chief"));
            add(new Shuttle("Atlantis"));
            add(new SpaceX("GO Searcher"));
            add(new Shuttle("Endeavour"));
            add(new SpaceX("GO Navigator"));
            add(new SpaceX("GO Quest"));
        }};

        for (IStart spaceship : spaceships) {
            spacePort.start(spaceship);
            System.out.println();
            Thread.sleep(2000);
        }
    }
}
