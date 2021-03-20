package lesson_5.com.abstractstasks.transport.classes;

import lesson_5.com.abstractstasks.transport.abstracts.LandTransport;
import lesson_5.com.abstractstasks.transport.enums.Model;

import java.text.DecimalFormat;

public class PassengerLandTransport extends LandTransport {

    private int passengersNumber;

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
        return "Passenger Land Transport [model = " + model + ", " + numberOfWheels + " wheels, fuel consumption = "
                + fuelConsumption + "l/100km, power = " + power + "h.p, maximum speed = " + maximumSpeed
                + "km/h, weight = " + weight + "t., number of passengers = " + passengersNumber + ", power in kW = " +
                calculatePowerINKiloWatts() + "kW]";
    }

}

