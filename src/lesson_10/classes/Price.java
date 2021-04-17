package lesson_10.classes;

import java.util.Objects;

public class Price {
    private String currency;
    private double priceValue;

    public Price(String currency, double priceValue) {
        this.currency = currency;
        this.priceValue = priceValue;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getPriceValue() {
        return priceValue;
    }

    public void setPriceValue(double priceValue) {
        this.priceValue = priceValue;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price = (Price) o;
        return priceValue == price.priceValue && Objects.equals(currency, price.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, priceValue);
    }

    @Override
    public String toString() {
        return "Price [" + currency + ": " + priceValue + ']';
    }
}
