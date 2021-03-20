package lesson_5.com.interfacetasks.robot.hands;

public class SamsungHand implements IHand {

    private int price;

    public SamsungHand() {
        this.price = 10;
    }

    public SamsungHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Samsung hand up.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
