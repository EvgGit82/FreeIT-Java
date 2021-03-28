package lesson_5.com.interfacetasks.robot.heads;

import lombok.Data;

@Data
public class SonyHead implements IHead {

    private int price;

    public SonyHead() {
        this.price = 25;
    }

    @Override
    public void speak() {
        System.out.println("Sony head speaks.");
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Sony Head (price = " + price + ")";
    }
}
