package lesson_2.main_tasks;

import java.util.Arrays;
import java.util.Random;

/*
Создать массив, заполнить его случайными элементами, распечатать, перевернуть, и снова распечатать
(при переворачивании нежелательно создавать еще один массив)
*/

public class Task_15 {

    public static void main(String[] args) {

        Random random = new Random();

        int [] randomNumbers = new int [10];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(randomNumbers));

        for (int i = 0; i < randomNumbers.length/2; i++) {
            int temp = randomNumbers[i];
            randomNumbers[i] = randomNumbers[randomNumbers.length-1-i];
            randomNumbers[randomNumbers.length-1-i] = temp;
        }

        System.out.println(Arrays.toString(randomNumbers));
    }

}

