package lesson_5.com.interfacetasks.robot.heads;

public class SamsungHead implements IHead {

    private int price;

    public SamsungHead() {
        this.price = 20;
    }

    public SamsungHead(int price) {
        this.price = price;
    }

    @Override
    public void speak() {
        System.out.println("Samsung head speaks.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
