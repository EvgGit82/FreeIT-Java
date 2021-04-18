package lesson_10.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Type {

    private boolean isPeripheral;
    private EnergyConsumption energyConsumption;
    private boolean coolerAvailability;
    private String port;

    @Override
    public String toString() {
        return "Type [peripheral = " + isPeripheral + ", energy consumption = " + energyConsumption +
                ", cooler availability = " + coolerAvailability + ", port = " + port + ']';
    }
}
