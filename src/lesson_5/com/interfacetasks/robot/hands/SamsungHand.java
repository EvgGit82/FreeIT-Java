package lesson_5.com.interfacetasks.robot.hands;

import lombok.Data;

@Data
public class SamsungHand implements IHand {

    private int price;

    public SamsungHand() {
        this.price = 10;
    }

    @Override
    public void upHand() {
        System.out.println("Samsung hand up.");
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Samsung Hand (price = " + price + ")";
    }
}
