package lesson_5.com.abstractstasks.transport.abstracts;

import lesson_5.com.abstractstasks.transport.enums.Model;

public abstract class LandTransport extends Transport {

    protected int numberOfWheels;
    protected double fuelConsumption;

    public LandTransport(double power, double maximumSpeed, double weight, Model model,
                         int numberOfWheels, double fuelConsumption) {
        super(power, maximumSpeed, weight, model);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }
}
