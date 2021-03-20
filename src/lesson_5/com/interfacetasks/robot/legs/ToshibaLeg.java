package lesson_5.com.interfacetasks.robot.legs;

public class ToshibaLeg implements ILeg {

    private int price;

    public ToshibaLeg() {
        this.price = 9;
    }

    public ToshibaLeg(int price) {
        this.price = price;
    }


    @Override
    public void step() {
        System.out.println("Toshiba leg steps.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
