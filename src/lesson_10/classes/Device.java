package lesson_10.classes;

import java.util.Objects;

public class Device {

    private String name;
    private String origin;
    private Price price;
    private Type type;
    private boolean isCritical;

    public Device(String name, String origin, Price price, Type type, boolean isCritical) {
        this.name = name;
        this.origin = origin;
        this.price = price;
        this.type = type;
        this.isCritical = isCritical;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public boolean isCritical() {
        return isCritical;
    }

    public void setCritical(boolean critical) {
        isCritical = critical;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return isCritical == device.isCritical && Objects.equals(name, device.name)
                && Objects.equals(origin, device.origin) && Objects.equals(price, device.price)
                && Objects.equals(type, device.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, origin, price, type, isCritical);
    }

    @Override
    public String toString() {
        return "Device [name = " + name + ", origin = " + origin + ", price = " + price + ", type = " + type +
                ", functionally critical = " + isCritical + ']';
    }
}
