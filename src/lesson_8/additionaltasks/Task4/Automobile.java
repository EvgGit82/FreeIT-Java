package lesson_8.additionaltasks.Task4;

import java.io.Serializable;
import java.util.Objects;

public class Automobile implements Serializable {

    private String brand;
    private int maxSpeed;
    private double price;

    public Automobile(String brand, int maxSpeed, double price) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automobile that = (Automobile) o;
        return maxSpeed == that.maxSpeed && Double.compare(that.price, price) == 0 && brand.equals(that.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, maxSpeed, price);
    }

    @Override
    public String toString() {
        return "Automobile [brand = '" + brand + "\'" + ", maxSpeed = " + maxSpeed + "m/h, price = $" + price + "]";
    }

}
