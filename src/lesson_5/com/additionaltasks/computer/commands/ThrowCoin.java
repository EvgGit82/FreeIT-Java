package lesson_5.com.additionaltasks.computer.commands;

import java.util.Random;

public class ThrowCoin {

    public boolean Execute(){
        int numberFromUser = 2;
        int coinFlip = new Random().nextInt(10)%2;
        while (numberFromUser != 1 && numberFromUser != 0){
            System.out.println("Select a number: 1 or 0");
            numberFromUser = new GetNumberFromScanner().Execute();
        }

        return numberFromUser == coinFlip;
    }
}
