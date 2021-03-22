package lesson_5.com.interfacetasks.robot.hands;

import lombok.Data;

@Data
public class ToshibaHand implements IHand{

    private int price;

    public ToshibaHand() {
        this.price = 20;
    }

    public ToshibaHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Toshiba hand up.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
