package lesson_5.com.interfacetasks.robot.hands;

import lombok.Data;

@Data
public class SonyHand implements IHand {

    private int price;

    public SonyHand() {
        this.price = 15;
    }

    public SonyHand(int price) {
        this.price = price;
    }


    @Override
    public void upHand() {
        System.out.println("Sony hand up.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
