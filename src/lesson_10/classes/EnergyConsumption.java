package lesson_10.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EnergyConsumption {

    private String ECunit;
    private double ECvalue;

    @Override
    public String toString() {
        return ECvalue + " " + ECunit;
    }
}
