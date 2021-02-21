package lesson_2.main_tasks;

import java.util.Random;

/*
Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.
*/

public class Task11 {

    public static void main(String[] args) {

        int number = new Random().nextInt(100);

        System.out.println(number + isNumberSimple(number));

    }

    public static String isNumberSimple (int number) {

        int count = 0;

        for (int i = 2; i <= number; i++) {
            if (number%i == 0) {
                count++;
            }
        }

        String result = count > 1 ? " is NOT a simple number" : " is a SIMPLE number";

        return result;
    }

}
