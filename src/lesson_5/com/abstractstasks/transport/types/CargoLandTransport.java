package lesson_5.com.abstractstasks.transport.types;

import lesson_5.com.abstractstasks.transport.abstracts.LandTransport;
import lesson_5.com.abstractstasks.transport.enums.Model;
import lombok.Getter;

@Getter
public class CargoLandTransport extends LandTransport {

    private final double capacity;

    public CargoLandTransport(double power, double maximumSpeed, double weight, Model model,
                              int numberOfWheels, double fuelConsumption, double capacity) {
        super(power, maximumSpeed, weight, model, numberOfWheels, fuelConsumption);
        this.capacity = capacity;
    }

    public String checkFreeSpaceAvailability(double cargoToBeLoaded) {
        return (capacity - cargoToBeLoaded) >= 0 ? "The truck is loaded." : "You need a larger truck.";
    }

    @Override
    public String toString() {
        return "Cargo Land Transport [" + super.toString() + "capacity = " + capacity + "t., power in kW = "
                + calculatePowerInKW() + "kW]";
    }
}