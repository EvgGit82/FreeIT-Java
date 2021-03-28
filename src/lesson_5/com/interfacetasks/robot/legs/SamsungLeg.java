package lesson_5.com.interfacetasks.robot.legs;

import lombok.Data;

@Data
public class SamsungLeg implements ILeg{

    private int price;

    public SamsungLeg() {
        this.price = 5;
    }

    @Override
    public void step() {
        System.out.println("Samsung leg steps.");
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Samsung Leg (price = " + price + ")";
    }
}
