package lesson_5.com.maintasks.Task25;

import lombok.Data;

import java.util.Scanner;

@Data
public class CashMachine {

    private int twenties;
    private int fifties;
    private int hundreds;

    private final int TWENTIES_LIMIT = 500;
    private final int FIFTIES_LIMIT = 200;
    private final int HUNDREDS_LIMIT = 100;

    private final String OUT_OF_LIMIT_MESSAGE = "The desired value is out of limit";

    public CashMachine(int twenties, int fifties, int hundreds) {
        this.twenties = twenties;
        this.fifties = fifties;
        this.hundreds = hundreds;
    }

    public void displayMenu() {

        boolean isWorking = true;

        while (isWorking){
            System.out.println("Select option: ");
            System.out.println("0. Display available cash");
            System.out.println("1. Deposit cash");
            System.out.println("2. Withdraw cash");
            System.out.println("3. Quit");

            int option = getNumberFromScanner();

            switch (option) {
                case 0 -> {
                    System.out.println(this.toString());
                    System.out.println();}
                case 1 -> {
                    System.out.println(depositCash() ? "Success!" : "Transaction failure");
                    System.out.println();
                }
                case 2 -> {
                    System.out.println("Enter the amount to withdraw: ");
                    int amount = getNumberFromScanner();
                    withdrawCash(amount);
                    System.out.println();
                }
                case 3 -> {
                    System.out.println("Bye-Bye!");
                    isWorking = false;
                }
                default -> {
                    System.out.println("Wrong number!");
                    System.out.println();
                }
            }
        }
    }

    private boolean depositCash () {
        System.out.println("Let's deposit cash!");
        System.out.println("How many 100 dollar bills you want to deposit: ");
        int hundredsInput = getNumberFromScanner();
        if (hundredsInput <= (HUNDREDS_LIMIT - hundreds)) {
            hundreds += hundredsInput;
        } else {
            System.out.println(OUT_OF_LIMIT_MESSAGE);
            return false;
        }
        System.out.println("How many 50 dollar bills you want to deposit: ");
        int fiftiesInput = getNumberFromScanner();
        if (fiftiesInput <= (FIFTIES_LIMIT - fifties)) {
            fifties += fiftiesInput;
        } else {
            System.out.println(OUT_OF_LIMIT_MESSAGE);
            return false;
        }
        System.out.println("How many 20 dollar bills you want to deposit: ");
        int twentiesInput = getNumberFromScanner();
        if (twentiesInput <= (TWENTIES_LIMIT - twenties)) {
            twenties += twentiesInput;
        } else {
            System.out.println(OUT_OF_LIMIT_MESSAGE);
            return false;
        }
        return true;
    }

    private void withdrawCash (int amount) {
        int tempTwenties = 0;
        int tempFifties = 0;
        int tempHundreds = 0;
        if ((twenties*20 + fifties*50 + hundreds*100) < amount){
            System.out.println("The cash machine has not enough cash! ");
            System.out.println();
            return;
        } else {
            if (amount/100 >= 0) {
                tempHundreds = Math.min(amount / 100, hundreds);
                hundreds -= tempHundreds;
                amount -= tempHundreds*100;
            }
            if (amount/50 >= 0) {
                tempFifties = Math.min(amount / 50, fifties);
                fifties -= tempFifties;
                amount -= tempFifties*50;
            }
            if (amount/20 >= 0) {
                tempTwenties = Math.min(amount / 20, twenties);
                twenties -= tempTwenties;
                amount -= tempTwenties*20;
            }

            System.out.println("The amount was cashed in " + tempHundreds + " hundred bill(s) "
                    + tempFifties + " fifty bill(s) and " + tempTwenties
                    + " twenty bill(s) (and " + amount + " will be cashed otherwise)");
        }
    }

    @Override
    public String toString() {
        return "The cash machine contains: \n" +
                + twenties + " twenty dollar bill(s), \n" +
                + fifties +" fifty dollar bill(s), \n" +
                + hundreds + " hundred dollar bill(s)\n" +
                "Total amount: " + (twenties*20 + fifties*50 + hundreds*100);
    }

    private int getNumberFromScanner() {
        Scanner scanner = new Scanner(System.in);
        try { return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e){
            System.out.println("Wrong number!"); }
        return -1;
    }
}
