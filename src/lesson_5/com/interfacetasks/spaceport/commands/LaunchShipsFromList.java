package lesson_5.com.interfacetasks.spaceport.commands;

import lesson_5.com.interfacetasks.spaceport.SpacePort;
import lesson_5.com.interfacetasks.spaceport.spaceships.IStart;

import java.util.List;

public class LaunchShipsFromList {

    List<IStart> sourceShipsList;
    SpacePort spacePort;

    public LaunchShipsFromList(List<IStart> sourceShipsList, SpacePort spacePort) {
        this.sourceShipsList = sourceShipsList;
        this.spacePort = spacePort;
    }

    public void Execute() throws InterruptedException {
        for (IStart spaceship : sourceShipsList) {
            spacePort.start(spaceship);
            System.out.println();
            Thread.sleep(2000);
        }
    }
}
