package lesson_5.com.abstractstasks.transport.abstracts;

import lesson_5.com.abstractstasks.transport.enums.Model;

public abstract class Transport {

    protected double power;
    protected double maximumSpeed;
    protected double weight;
    protected Model model;

    public Transport(double power, double maximumSpeed, double weight, Model model) {
        this.power = power;
        this.maximumSpeed = maximumSpeed;
        this.weight = weight;
        this.model = model;
    }

    protected double calculatePowerINKiloWatts (){
        return power*0.74;
    }


}
