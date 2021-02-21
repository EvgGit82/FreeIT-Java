package lesson_2.main_tasks;

import java.util.Random;

/*
Создайте число. Определите, является ли число трехзначным. Определите, является ли его последняя цифра семеркой.
Определите, является ли число четным
*/

public class Task_06 {
    public static void main(String[] args) {

        int randomNumber = new Random().nextInt(999);

        System.out.println("Original number: " + randomNumber);

        System.out.println("Is it a three-digit number? " + ((randomNumber > 99 && randomNumber < 1000) ? "Yes" : "No"));
        System.out.println("Is the last digit \"7\"? " + (randomNumber % 10 == 7 ? "Yes" : "No"));
        System.out.println("Is this number even? " + ((randomNumber % 2 == 0) ? "Yes" : "No"));

    }

}
