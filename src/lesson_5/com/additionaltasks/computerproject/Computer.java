package lesson_5.com.additionaltasks.computerproject;

import java.util.Random;
import java.util.Scanner;

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
        } else{
        System.out.println("Computer configuration [processor: " + PROCESSOR + ", RAM: " + RAM + ", HDD: "
                + HDD + ", cycles-to-failure: " + cyclesToFailure + "]");
        }
    }

    public void turnOn() throws Throwable {
        if (!isWorking && !isBurned) {
            int coinFlip = new Random().nextInt(10)%2;
            if (coinFlip == throwCoin()) {
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

    public void turnOff(){
        if (isWorking) {
            System.out.println("Computer is now turned off");
            isWorking = false;
            cyclesToFailure--;
            System.out.println(cyclesToFailure + " cycles left.");
        } else {
            System.out.println("Computer is not working now.");
        }
    }

    public void burnDown () throws Throwable {
        System.out.println("Computer burns down");
        isBurned = true;
    }

    private int throwCoin (){
        Scanner scn = new Scanner(System.in);
        System.out.println("Select a number: 1 or 0");
        return Integer.parseInt(scn.nextLine().trim());
    }

}
