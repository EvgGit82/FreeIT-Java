package lesson_5.com.interfacetasks.robot.legs;

import lombok.Data;

@Data
public class ToshibaLeg implements ILeg {

    private int price;

    public ToshibaLeg() {
        this.price = 9;
    }

    @Override
    public void step() {
        System.out.println("Toshiba leg steps.");
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Toshiba Leg (price = " + price + ")";
    }
}
