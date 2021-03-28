package lesson_5.com.interfacetasks.robot.legs;

import lombok.Data;

@Data
public class SonyLeg implements ILeg {

    private int price;

    public SonyLeg() {
        this.price = 7;
    }

    @Override
    public void step() {
        System.out.println("Sony leg steps");
    }

    @Override
    public String toString() {
        return "Sony Leg (price = " + price + ")";
    }
}

