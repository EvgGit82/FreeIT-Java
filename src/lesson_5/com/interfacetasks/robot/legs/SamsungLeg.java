package lesson_5.com.interfacetasks.robot.legs;

public class SamsungLeg implements ILeg{

    private int price;

    public SamsungLeg() {
        this.price = 5;
    }

    public SamsungLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Samsung leg steps.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
