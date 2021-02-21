package lesson_2.optional_tasks;

/*
Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
*/

import java.util.Random;

public class OptTask11 {

    public static void main(String[] args) {

        Random random = new Random();

        int a = random.nextInt(10);
        int b = random.nextInt(10);
        int result = 0;

        for (int i = 0; i < b; i++) {
            result += a;
        }

        System.out.println("a = " + a + " b = " + b);
        System.out.println("The result is " + result);
    }
}