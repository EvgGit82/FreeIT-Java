package lesson_10.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Price {

    private String currency;
    private double priceValue;

    @Override
    public String toString() {
        return  currency + " " + priceValue;
    }
}
