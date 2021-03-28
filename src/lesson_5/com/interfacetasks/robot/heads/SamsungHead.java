package lesson_5.com.interfacetasks.robot.heads;

import lombok.Data;

@Data
public class SamsungHead implements IHead {

    private int price;

    public SamsungHead() {
        this.price = 20;
    }

    @Override
    public void speak() {
        System.out.println("Samsung head speaks.");
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Samsung Head (price = " + price + ")";
    }
}
