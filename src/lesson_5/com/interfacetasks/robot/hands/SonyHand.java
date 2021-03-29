package lesson_5.com.interfacetasks.robot.hands;

import lombok.Data;

@Data
public class SonyHand implements IHand {

    private int price;

    public SonyHand() {
        this.price = 15;
    }

    @Override
    public void upHand() {
        System.out.println("Sony hand up.");
    }

    @Override
    public String toString() {
        return "Sony Hand (price = " + price + ")";
    }
}
