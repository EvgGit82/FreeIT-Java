package lesson_5.com.abstractstasks.transport.classes;

import lesson_5.com.abstractstasks.transport.abstracts.AirTransport;
import lesson_5.com.abstractstasks.transport.enums.Model;

public class MilitaryAirPlane extends AirTransport {

    private boolean hasEscapeSystem;
    private int numberOfMissiles;

    public MilitaryAirPlane(double power, double maximumSpeed, double weight, Model model, int wingSpan,
                            int minimumTakeOffStripLength, boolean hasEscapeSystem, int numberOfMissiles) {
        super(power, maximumSpeed, weight, model, wingSpan, minimumTakeOffStripLength);
        this.hasEscapeSystem = hasEscapeSystem;
        this.numberOfMissiles = numberOfMissiles;
    }

    public String launchMissile (){
        return (numberOfMissiles > 0) ? "Missile launched..." : "No missiles left";
    }

    public String escapeSystemlaunch () {
        return (hasEscapeSystem) ? "Catapult launch!" : "The system is not available!";
    }

    @Override
    public String toString() {
        return "Military Air Plane [model = " + model + ", wing span = " + wingSpan
                + "m, minimum take-off strip length = " + minimumTakeOffStripLength + "m, power = " + power +
                "h.p., maximumSpeed = " + maximumSpeed + "km/h, weight = "
                + weight + "t., escape system availability = " + hasEscapeSystem + ", power in kW = " +
                calculatePowerINKiloWatts() + "kW]";
    }

}
