package lesson_2.main_tasks;

import java.util.Arrays;
import java.util.Random;

/*
Создать массив оценок произвольной длины, вывести максимальную и минимальную оценку, её (их) номера
*/

public class Task14 {

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

        System.out.println("Maximum value: " + maxValue + " with position " + indexMax);
        System.out.println("Minimum value: " + minValue + " with position " + indexMin);
    }

}
