package lesson_2.main_tasks;

import java.util.Arrays;
import java.util.Random;

/*
Определите сумму элементов одномерного массива, расположенных между минимальным и максимальным значениями.
*/

public class Task16 {

    public static void main(String[] args) {

        Random random = new Random();

        int [] randomNumbers = new int [10];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(randomNumbers));

        int maxValue = randomNumbers[0];
        int indexMax = 0;
        int minValue = randomNumbers[0];
        int indexMin = 0;

        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] > maxValue) {
                maxValue = randomNumbers[i];
                indexMax = i;
            }

            if (randomNumbers[i] < minValue) {
                minValue = randomNumbers[i];
                indexMin = i;
            }
        }

        System.out.println("Max: " + indexMax);
        System.out.println("Min: " + indexMin);

        int totalSum = 0;

        if (randomNumbers[indexMin] < randomNumbers[indexMax]) {
            for (int i = indexMin+1; i < indexMax; i++) {
                totalSum += randomNumbers[i];
            }
        } else {
            for (int i = indexMax+1; i < randomNumbers[indexMin]; i++) {
                totalSum += randomNumbers[i];
            }
        }

        System.out.println("Total sum between the minimum and maximum units makes " + totalSum);
    }

}
