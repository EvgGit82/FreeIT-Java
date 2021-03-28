package lesson_5.com.interfacetasks.robot;

import lesson_5.com.interfacetasks.robot.hands.IHand;
import lesson_5.com.interfacetasks.robot.heads.IHead;
import lesson_5.com.interfacetasks.robot.legs.ILeg;
import lombok.Data;


@Data
public class Robot implements IRobot {
    private IHead head;
    private IHand hand;
    private ILeg leg;
    private String name;

    public Robot(String name, IHead head, IHand hand, ILeg leg) {
        this.name = name;
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    @Override
    public void action() {
        System.out.println("Robot '" + name + "'");
        head.speak();
        hand.upHand();
        leg.step();
    }

    @Override
    public int getPrice() {
        return head.getPrice() + hand.getPrice() + leg.getPrice();
    }

    @Override
    public String toString() {
        return "Robot '" + name + "' [head = " + head.toString() + ", hand = "
                + hand.toString() + ", leg = " + leg.toString() + ']';
    }
}
