package lesson_5.com.abstractclassestasks.transport_project.classes;

import lesson_5.com.abstractclassestasks.transport_project.abstracts.AirTransport;
import lesson_5.com.abstractclassestasks.transport_project.enums.Model;

public class CivilAirPlane extends AirTransport {

    private int passengersNumbers;
    private boolean hasBusinessClass;

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
        return "Civil Air Plane [model = " + model + ", wing span = " + wingSpan
                + "m, minimum take-off strip length = "  + minimumTakeOffStripLength + "m., power = "
                + power + "h.p., maximum speed = " + maximumSpeed + "km/h, weight = "
                + weight + "t., number of passengers = " + passengersNumbers + ", business class availability = "
                + hasBusinessClass + ", power in kW = " + calculatePowerINKiloWatts() + "kW]";
    }


}
