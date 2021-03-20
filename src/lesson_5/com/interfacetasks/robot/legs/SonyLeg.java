package lesson_5.com.interfacetasks.robot.legs;

public class SonyLeg implements ILeg {

    private int price;

    public SonyLeg() {
        this.price = 7;
    }

    public SonyLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Sony leg steps");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

