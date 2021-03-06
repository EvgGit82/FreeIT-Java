package lesson_5.com.abstractstasks.transport.types;

import lesson_5.com.abstractstasks.transport.abstracts.LandTransport;
import lesson_5.com.abstractstasks.transport.enums.Model;
import lombok.Getter;

import java.text.DecimalFormat;

@Getter
public class PassengerLandTransport extends LandTransport {

    private final int passengersNumber;

    public PassengerLandTransport(double power, double maximumSpeed, double weight, Model model,
                                  int numberOfWheels, double fuelConsumption, int passengersNumber) {
        super(power, maximumSpeed, weight, model, numberOfWheels, fuelConsumption);
        this.passengersNumber = passengersNumber;
    }

    public void printDistanceAndFuelConsumptionCalculationResults (double time) {
        System.out.printf("For " + time + " hours automobile " + model + " travelling with the maximum speed " +
                "of " + maximumSpeed +"km/h will consume " + calculateFuelConsumption(time) + " litres of fuel.");
    }

    private String calculateFuelConsumption(double time) {
        DecimalFormat formatter = new DecimalFormat("#0.00");

        return formatter.format(fuelConsumption/time);
    }

    @Override
    public String toString() {
        return "Passenger Land Transport [" + super.toString() + "passengers capacity = " + passengersNumber + " passengers, power in kW = "
                + calculatePowerInKW() + "kW]";
    }
}

