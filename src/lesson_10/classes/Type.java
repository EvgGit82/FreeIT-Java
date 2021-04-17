package lesson_10.classes;

import java.util.ArrayList;
import java.util.Objects;

public class Type {

    private boolean isPeripheral;
    private EnergyConsumption energyConsumption;
    private boolean coolerAvailability;
    private String port;

    public Type(boolean isPeripheral, EnergyConsumption energyConsumption, boolean coolerAvailability, String port) {
        this.isPeripheral = isPeripheral;
        this.energyConsumption = energyConsumption;
        this.coolerAvailability = coolerAvailability;
        this.port = port;
    }

    public boolean isPeripheral() {
        return isPeripheral;
    }

    public void setPeripheral(boolean peripheral) {
        isPeripheral = peripheral;
    }

    public EnergyConsumption getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(EnergyConsumption energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public boolean isCoolerAvailability() {
        return coolerAvailability;
    }

    public void setCoolerAvailability(boolean coolerAvailability) {
        this.coolerAvailability = coolerAvailability;
    }

    public String getPorts() {
        return port;
    }

    public void setPorts(ArrayList ports) {
        this.port = port;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Type type = (Type) o;
        return isPeripheral == type.isPeripheral && coolerAvailability == type.coolerAvailability
                && Objects.equals(energyConsumption, type.energyConsumption) && Objects.equals(port, type.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isPeripheral, energyConsumption, coolerAvailability, port);
    }

    @Override
    public String toString() {
        return "Type [peripheral = " + isPeripheral + ", energy consumption = " + energyConsumption +
                ", cooler availability = " + coolerAvailability + ", port = " + port + ']';
    }
}
