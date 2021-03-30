package lesson_2.main_tasks;

import java.util.ArrayList;
import java.util.Random;

/*
Создайте число. Определите, является ли число трехзначным. Определите, является ли его последняя цифра семеркой.
Определите, является ли число четным
*/

public class Task06 {
    public static void main(String[] args) {

//        int randomNumber = new Random().nextInt(999);

        int randomNumber = -127;



        System.out.println("Original number: " + randomNumber);

        System.out.println("Is it a three-digit number? " + ((Math.abs(randomNumber) > 99 && Math.abs(randomNumber) < 1000) ? "Yes" : "No"));
        System.out.println("Is the last digit \"7\"? " + (Math.abs(randomNumber) % 10 == 7 ? "Yes" : "No"));
        System.out.println("Is this number even? " + ((randomNumber % 2 == 0) ? "Yes" : "No"));
    }


}
