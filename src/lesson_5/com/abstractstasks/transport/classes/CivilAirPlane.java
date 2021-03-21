package lesson_5.com.abstractstasks.transport.classes;

import lesson_5.com.abstractstasks.transport.abstracts.AirTransport;
import lesson_5.com.abstractstasks.transport.enums.Model;

public class CivilAirPlane extends AirTransport {

    private final int passengersNumbers;
    private final boolean hasBusinessClass;

    public CivilAirPlane(double power, double maximumSpeed, double weight, Model model, int wingSpan,
                         int minimumTakeOffStripLength, int passengersNumbers, boolean hasBusinessClass) {
        super(power, maximumSpeed, weight, model, wingSpan, minimumTakeOffStripLength);
        this.passengersNumbers = passengersNumbers;
        this.hasBusinessClass = hasBusinessClass;
    }

    public String freeSpaceAvailability(int passengerSeatsRequired) {
        return (passengersNumbers - passengerSeatsRequired) >= 0 ? "The jet has enough seats." : "You need a larger jet.";
    }

    @Override
    public String toString() {
        return "Passenger Plane [" + super.toString() + "passenger capacity = " + passengersNumbers
                + " passengers, business class availability = " + hasBusinessClass + ", power in kW = "
                + calculatePowerINKiloWatts() + "kW]";
    }
}
