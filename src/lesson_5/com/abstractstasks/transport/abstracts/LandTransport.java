package lesson_5.com.abstractstasks.transport.abstracts;

import lesson_5.com.abstractstasks.transport.enums.Model;
import lombok.Getter;

@Getter
public abstract class LandTransport extends Transport {

    protected final int numberOfWheels;
    protected final double fuelConsumption;

    public LandTransport(double power, double maximumSpeed, double weight, Model model,
                         int numberOfWheels, double fuelConsumption) {
        super(power, maximumSpeed, weight, model);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return super.toString() + "number of wheels = " + numberOfWheels + ", fuel consumption = " + fuelConsumption + "l/100km, ";
    }
}
