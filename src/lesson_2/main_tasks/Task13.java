package lesson_2.main_tasks;

import java.util.Arrays;
import java.util.Random;

/*
Создать последовательность случайных чисел, найти и вывести наибольшее из них.
*/

public class Task13 {

    public static void main(String[] args) {

        Random random = new Random();

        int [] randomNumbers = new int [10];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(randomNumbers));

        int max = randomNumbers[0];

        for (int i = 1; i < randomNumbers.length; i++) {
            if (randomNumbers[i] > max){
                max = randomNumbers[i];
            }
        }

        System.out.println("Maximum value: " + max);
    }

}
