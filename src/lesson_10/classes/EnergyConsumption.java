package lesson_10.classes;

import java.util.Objects;

public class EnergyConsumption {

    private String ECunit;
    private double ECvalue;

    public EnergyConsumption(String ECunit, double ECvalue) {
        this.ECunit = ECunit;
        this.ECvalue = ECvalue;
    }

    public String getECunit() {
        return ECunit;
    }

    public void setECunit(String ECunit) {
        this.ECunit = ECunit;
    }

    public double getECvalue() {
        return ECvalue;
    }

    public void setECvalue(double ECvalue) {
        this.ECvalue = ECvalue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnergyConsumption that = (EnergyConsumption) o;
        return Double.compare(that.ECvalue, ECvalue) == 0 && Objects.equals(ECunit, that.ECunit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ECunit, ECvalue);
    }


    @Override
    public String toString() {
        return "energy consumption = " + ECvalue + " " + ECunit;
    }
}
