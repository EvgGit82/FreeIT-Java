package lesson_5.com.abstractclassestasks.transport_project.classes;

import lesson_5.com.abstractclassestasks.transport_project.abstracts.LandTransport;
import lesson_5.com.abstractclassestasks.transport_project.enums.Model;

public class CargoLandTransport extends LandTransport {

    private double capacity;

    public CargoLandTransport(double power, double maximumSpeed, double weight, Model model,
                              int numberOfWheels, double fuelConsumption, double capacity) {
        super(power, maximumSpeed, weight, model, numberOfWheels, fuelConsumption);
        this.capacity = capacity;
    }

    public String freeSpaceAvailability(double cargoToBeLoaded) {
        return (capacity - cargoToBeLoaded) >= 0 ? "The truck is loaded." : "You need a larger truck.";
    }


    @Override
    public String toString() {
        return "Cargo Land Transport [model = " + model + ", " + numberOfWheels + " wheels, fuel consumption = "
                + fuelConsumption + "l/100km, power = " + power + "h.p., maximum speed = " + maximumSpeed +
                "km/h, weight = " + weight + "t., capacity = " + capacity + "t., power in kW = " +
                calculatePowerINKiloWatts() + "kW]";
    }
}