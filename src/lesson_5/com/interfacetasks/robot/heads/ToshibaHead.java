package lesson_5.com.interfacetasks.robot.heads;

public class ToshibaHead implements IHead {

    private int price;

    public ToshibaHead() {
        this.price = 30;
    }

    public ToshibaHead(int price) {
        this.price = price;
    }

    @Override
    public void speak() {
        System.out.println("Toshiba head speaks.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
