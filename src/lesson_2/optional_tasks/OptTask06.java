package lesson_2.optional_tasks;

/*
Даны 2 числа. Вывести большее из них
*/

import java.util.Random;

public class OptTask06 {

    public static void main(String[] args) {

        Random random = new Random();

        int numberOne = random.nextInt(10);
        int numberTwo = random.nextInt(10);

        System.out.println("Two numbers: " + numberOne + " and " + numberTwo);

        if (numberOne > numberTwo) {
            System.out.println(numberOne + " is bigger.");
        } else if (numberTwo >numberOne) {
            System.out.println(numberTwo + " is bigger.");
        } else {
            System.out.println("These numbers are equal.");
        }
    }
}
