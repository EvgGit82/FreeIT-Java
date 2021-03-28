package lesson_5.com.additionaltasks.computer;

import lesson_5.com.additionaltasks.computer.commands.ThrowCoin;
import lombok.Getter;

@Getter
public class Computer {

    private final String PROCESSOR;
    private final int RAM;
    private final int HDD;
    private int cyclesToFailure;

    private boolean isWorking = false;
    private boolean isBurned = false;


    public Computer(String processor, int RAM, int HDD, int cyclesToFailure) {
        this.PROCESSOR = processor;
        this.RAM = RAM;
        this.HDD = HDD;
        this.cyclesToFailure = cyclesToFailure;
    }

    public int getCyclesToFailure() {
        return cyclesToFailure;
    }

    public void printDescription () {
        if (isBurned){
            System.out.println("You have no computer anymore!");
        } else if (isWorking){
            System.out.println("Computer configuration [processor: " + PROCESSOR + ", RAM: " + RAM + ", HDD: "
                    + HDD + ", cycles-to-failure: " + cyclesToFailure + "]");
        } else {
            System.out.println("Tip: You must turn computer first!");
        }
    }

    public void turnOn() {
        if (!isWorking && !isBurned) {
            if (new ThrowCoin().execute()) {
                System.out.println("Computer successfully turned on");
                isWorking = true;
            } else {
                burnDown();
            }
        } else if (isBurned){
            System.out.println("Your computer kicked the bucket. Get a new one!");
        }
        else {
            System.out.println("Computer is working now.");
        }
    }

    public void turnOff() {
        if (isWorking) {
            if (new ThrowCoin().execute()) {
                System.out.println("Computer is now turned off");
                isWorking = false;
                cyclesToFailure--;
                System.out.println(cyclesToFailure + " cycles left.");
            } else {
                burnDown();
            }
        } else {
            System.out.println("Computer is not working now.");
        }
    }

    public void burnDown (){
        System.out.println("Computer burns down");
        isBurned = true;
    }

}
