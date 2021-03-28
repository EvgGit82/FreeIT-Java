package lesson_5.com.additionaltasks.computer;

import lombok.Getter;

import java.util.Random;
import java.util.Scanner;

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

    public void turnOff() {
        if (isWorking) {
            int coinFlip = new Random().nextInt(10)%2;
            if (coinFlip == throwCoin()) {
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

    private int throwCoin (){
        int numberFromUser = 2;
        while (numberFromUser != 1 && numberFromUser != 0){
            System.out.println("Select a number: 1 or 0");
            numberFromUser = getNumberFromScanner();
        }
        return numberFromUser;
    }

     public int getNumberFromScanner() {
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        try { number = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e){
            System.out.println("Wrong number!"); }
        return number;
    }
}
