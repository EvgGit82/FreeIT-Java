package lesson_5.com.abstractstasks.transport.abstracts;

import lesson_5.com.abstractstasks.transport.enums.Model;

public abstract class Transport {

    protected final double power;
    protected final double maximumSpeed;
    protected final double weight;
    protected final Model model;

    public Transport(double power, double maximumSpeed, double weight, Model model) {
        this.power = power;
        this.maximumSpeed = maximumSpeed;
        this.weight = weight;
        this.model = model;
    }

    protected double calculatePowerInKW(){
        return power*0.74;
    }

    @Override
    public String toString() {
        return "model = " + model + ", power = " + power + "h.p., maximum speed = " + maximumSpeed + "km/h, weight = " + weight + "kg., ";
    }
}
